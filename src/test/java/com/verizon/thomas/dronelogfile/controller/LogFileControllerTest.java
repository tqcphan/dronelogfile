package com.verizon.thomas.dronelogfile.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.verizon.thomas.dronelogfile.domain.Logfile;
import com.verizon.thomas.dronelogfile.service.FileStorageService;
import com.verizon.thomas.dronelogfile.service.ImportJsonService;



@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest 
//@WebMvcTest(LogFileController.class)
public class LogFileControllerTest {
	
	@Autowired 
	private MockMvc mockMvc;
	@MockBean
	private FileStorageService logFileStorageService;
	
	@MockBean
	private ImportJsonService readJsonService;


	 @Test
	 public void uploadFileTest() throws Exception {
		 //given
		File initialFile = new File("./uploads/logfile.json");
		String uuid = "c8e5afb9-83d4-415e-abbb-4c1be7f15329";
		given(readJsonService.readJson(uuid)).willReturn(new  Logfile());
		
	
		InputStream uploadStream = new FileInputStream(initialFile);
	    MockMultipartFile file = new MockMultipartFile("file", uploadStream);	
	    given(logFileStorageService.storeLogFile(file)).willReturn(uuid);
	    assert uploadStream != null;
        //When
			mockMvc.perform(MockMvcRequestBuilders.multipart("/api/logFile/uploadFile")
			                .file(file))
		//then 
		.andExpect(status().isOk());
	    
	 }
}



