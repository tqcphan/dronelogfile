package com.verizon.thomas.dronelogfile.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.verizon.thomas.dronelogfile.domain.Voltage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadFlightLogServiceImplTest {
	
	@Autowired
	private ReadFlightLogServiceImpl readFlightLogService;
	
	@Test
	public void readVoltageFlightByIdTest () throws Exception {
		
		//Given 
		String uuid= "751ab284-8cbb-4f3a-8807-42db0d843cc5";
		
		// when
		Voltage vt = readFlightLogService.readVoltageFlightById(uuid);
		
		//assert
	    assertThat(vt).isNotNull();
		
	}

}
