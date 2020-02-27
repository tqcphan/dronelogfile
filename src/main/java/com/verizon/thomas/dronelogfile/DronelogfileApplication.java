package com.verizon.thomas.dronelogfile;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

@SpringBootApplication

public class DronelogfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(DronelogfileApplication.class, args);
	}

}
