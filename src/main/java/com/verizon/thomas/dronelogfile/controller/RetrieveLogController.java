package com.verizon.thomas.dronelogfile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.thomas.dronelogfile.domain.Voltage;
import com.verizon.thomas.dronelogfile.service.ReadFlightLogService;


@RestController
@RequestMapping("/api/logResource")
public class RetrieveLogController {
	
	@Autowired
	private ReadFlightLogService readFlightLogService;
	
	
	@GetMapping("/voltage/{uid}")
	public ResponseEntity<?> getVoltageById(@PathVariable("uid") final String id) {
		Voltage rS = readFlightLogService.readVoltageFlightById(id);
		if (rS!=null) {
		return new ResponseEntity<Voltage>(rS, HttpStatus.OK);
		}
		return new ResponseEntity<String>("Your file " + id + " is not found", HttpStatus.NOT_FOUND);
		
	}
}




