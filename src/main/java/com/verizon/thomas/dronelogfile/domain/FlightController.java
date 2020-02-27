package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class FlightController implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String serial_number;
	 private String firmware_version;


	 // Getter Methods 

	 public String getSerial_number() {
	  return serial_number;
	 }

	 public String getFirmware_version() {
	  return firmware_version;
	 }

	 // Setter Methods 

	 public void setSerial_number(String serial_number) {
	  this.serial_number = serial_number;
	 }

	 public void setFirmware_version(String firmware_version) {
	  this.firmware_version = firmware_version;
	 }


}
