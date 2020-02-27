package com.verizon.thomas.dronelogfile.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.verizon.thomas.dronelogfile.domain.Voltage;
import com.verizon.thomas.dronelogfile.service.ReadFlightLogService;

@RunWith(SpringRunner.class)
//@WebAppConfiguration
@AutoConfigureMockMvc
@SpringBootTest
public class RetrieveLogControllerTest {
	
	@MockBean
	private ReadFlightLogService readFlightLogService;
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getVoltageByIdTest () throws Exception {
		 //given
		String uuid = "c8e5afb9-83d4-415e-abbb-4c1be7f15329";
		//Voltage voltage = new Voltage (1579, 1577);
		 given(readFlightLogService.readVoltageFlightById(uuid))
         .willReturn(new Voltage (1579, 1577));
	     // when
        MockHttpServletResponse response = mockMvc.perform(
                get("/api/logResource/voltage/"+ uuid)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

}
