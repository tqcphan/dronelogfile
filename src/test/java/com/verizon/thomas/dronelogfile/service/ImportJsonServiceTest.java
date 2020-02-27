package com.verizon.thomas.dronelogfile.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.verizon.thomas.dronelogfile.domain.Logfile;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ImportJsonServiceTest {
	@Autowired
	private ImportJsonService importJsonService;
	
	
	@Test
	public void readJsonTest () throws Exception {
		//Given 
		String uuid= "7ecd2a9b-42e2-4cad-baaf-7e9b303936b6";
		//When
		Logfile rlf = importJsonService.readJson (uuid);	
		//assert
	    assertThat(rlf.getMessage()).isNotNull();
		
	}

}
