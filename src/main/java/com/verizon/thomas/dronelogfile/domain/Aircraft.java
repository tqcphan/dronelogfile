package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class Aircraft implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manufacturer;
	 private String serial_number;
	 private String name;
	 private String model;
	 private String firmware_version;


	 // Getter Methods 

	 public String getManufacturer() {
	  return manufacturer;
	 }

	 public String getSerial_number() {
	  return serial_number;
	 }

	 public String getName() {
	  return name;
	 }

	 public String getModel() {
	  return model;
	 }

	 public String getFirmware_version() {
	  return firmware_version;
	 }

	 // Setter Methods 

	 public void setManufacturer(String manufacturer) {
	  this.manufacturer = manufacturer;
	 }

	 public void setSerial_number(String serial_number) {
	  this.serial_number = serial_number;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setModel(String model) {
	  this.model = model;
	 }

	 public void setFirmware_version(String firmware_version) {
	  this.firmware_version = firmware_version;
	 }


}
