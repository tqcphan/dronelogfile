package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class Gcs implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String manufacturer;
	 private String model;
	 private String version;


	 // Getter Methods 

	 public String getManufacturer() {
	  return manufacturer;
	 }

	 public String getModel() {
	  return model;
	 }

	 public String getVersion() {
	  return version;
	 }

	 // Setter Methods 

	 public void setManufacturer(String manufacturer) {
	  this.manufacturer = manufacturer;
	 }

	 public void setModel(String model) {
	  this.model = model;
	 }

	 public void setVersion(String version) {
	  this.version = version;
	 }


}
