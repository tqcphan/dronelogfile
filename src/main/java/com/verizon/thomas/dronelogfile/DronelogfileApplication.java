package com.verizon.thomas.dronelogfile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class DronelogfileApplication {
	
	// Logger
	private static final Logger logger = LoggerFactory.getLogger(DronelogfileApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DronelogfileApplication.class, args);
	}

}
