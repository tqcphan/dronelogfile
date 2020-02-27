package com.verizon.thomas.dronelogfile.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.verizon.thomas.dronelogfile.config.LogStorageProperties;
import com.verizon.thomas.dronelogfile.domain.Logfile;
import com.verizon.thomas.dronelogfile.exception.LogFileNotFoundException;
import com.verizon.thomas.dronelogfile.service.FileStorageService;
import com.verizon.thomas.dronelogfile.service.ImportJsonService;
import com.verizon.thomas.dronelogfile.service.ReadFlightLogService;


@RestController
@RequestMapping("/api/logFile")
public class LogFileController {
	
	
	@Autowired
	private FileStorageService logFileStorageService;
	@Autowired
	private ImportJsonService readJsonService;
	@Autowired
	private LogStorageProperties logStoragePropertie;
	
	@Autowired
	private ReadFlightLogService readFlightLogService;
	
	@PostMapping("/uploadFile")
	@ResponseBody
	public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
		//
		String filename =""; 
		// We save into server storage first 
		if (!file.isEmpty()) {
         
            	filename = logFileStorageService.storeLogFile(file);
     
            }
		// This step can call asynchonously or by batch or by event via message broker
		// When scale to high request volume, decouple 2 services : first upload server then asynchonously insert to 
		// database for retrieve the data later. 
		// Insert file to Database
		if (filename!="") {
			readJsonService.readJson(filename);
		}

	    return  "Your log file id :  " + filename;
	}
		

	
	    @GetMapping("/download/{uuid}")
	    public void downloadFileId(@PathVariable("uuid") String uuid, HttpServletResponse response) throws IOException
	    {
	    
	         try {
		    	 Path targetLocation = Paths.get(this.logStoragePropertie.getUploadDir()).resolve(uuid);	   
		    	 File file = new File(targetLocation.toString());
		    	 response.setContentType("application/json");
		    	 response.setHeader("Content-Disposition", "attachment; filename="+uuid);
		   
		    	 InputStream inStream = new FileInputStream(file);
		    	 IOUtils.copy(inStream, response.getOutputStream());
		         response.flushBuffer();
		         inStream.close();
	         }
	         catch (Exception e) {
	    	
	    		 throw new LogFileNotFoundException("Your file " + uuid + " is not found");
	         }
	
	     
	    }
	    
	    @GetMapping("/download/db/{uuid}")
	    public void downloadDbId (@PathVariable("uuid") String uuid, HttpServletResponse response) throws IOException
	    {
	    	Logfile lfile = readFlightLogService.readLogfleById(uuid);
	    	ObjectMapper mapper = new ObjectMapper();
	    	
	    	if (lfile !=null) {
	    	response.setContentType("application/json");
	        response.setHeader("Content-Disposition", "attachment; filename="+uuid);
	    	mapper.writeValue(response.getOutputStream(), lfile);
	    	response.flushBuffer();
	    	}
	    	else {
	    		throw new LogFileNotFoundException("Your file " + uuid + " is not found");
	    	}
	    	
	    	
	    	
	    	
	    }
	    
	   
}
