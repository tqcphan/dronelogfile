package com.verizon.thomas.dronelogfile.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;

import com.verizon.thomas.dronelogfile.config.LogStorageProperties;

@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
@SpringBootTest
public class FileStorageServiceImplTest {

	
	private FileStorageServiceImpl fileStorageService;
	@Autowired
	private LogStorageProperties logStorageProperties;
	
	
	  @Before
	  public void setUp() {
            // init File storage Service
	        fileStorageService = new FileStorageServiceImpl(logStorageProperties);
	  }
	 
	  @Test
	 public void storeLogFileTest() throws Exception {
		 //given
		File initialFile = new File("./uploads/logfile.json");
		InputStream uploadStream = new FileInputStream(initialFile);
	    MockMultipartFile file = new MockMultipartFile("file", uploadStream);	
	    
	    //when
	    String filename = fileStorageService.storeLogFile(file);
	    
		//assert
	    assertThat(filename).isNotEmpty();
		 
	 }
	 


}
