package com.verizon.thomas.dronelogfile.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.verizon.thomas.dronelogfile.config.LogStorageProperties;
import com.verizon.thomas.dronelogfile.domain.DLogfile;
import com.verizon.thomas.dronelogfile.domain.Logfile;
import com.verizon.thomas.dronelogfile.repository.DLogfileRepository;

@Service
public class ImportJsonService {
	
	private final Path logStorageLocation;
	private  ObjectMapper mapper ;

	private  DLogfileRepository dlogfilerepo;
	
		
	@Autowired
    public ImportJsonService(LogStorageProperties logStorageProperties, ObjectMapper mapper, DLogfileRepository dlogfilerepo) {
        this.logStorageLocation = Paths.get(logStorageProperties.getUploadDir())
            .toAbsolutePath().normalize();
        this.mapper = mapper;
        this.dlogfilerepo = dlogfilerepo;
    }
	
	public Logfile readJson ( String uid ) {
		Logfile lf = new Logfile();
		try {
			Path targetLocation = this.logStorageLocation.resolve(uid);
			InputStream inStream = new FileInputStream (targetLocation.toString());
			lf = mapper.readValue(inStream, Logfile.class);
			DLogfile dlogfile = new DLogfile ();
			dlogfile.setId(UUID.fromString(uid));
			dlogfile.setLogfile(lf);
			dlogfilerepo.save(dlogfile);
	
		}
	 catch (IOException e) {
		 e.printStackTrace();
	  }
		return lf;
	}
}
		

	

