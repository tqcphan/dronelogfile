package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class LogFileDeviceOrigin implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user_interface_idiom;
	 private String operating_system;
	 private String model;
	 private String device_ssid;


	 // Getter Methods 

	 public String getUser_interface_idiom() {
	  return user_interface_idiom;
	 }

	 public String getOperating_system() {
	  return operating_system;
	 }

	 public String getModel() {
	  return model;
	 }

	 public String getDevice_ssid() {
	  return device_ssid;
	 }

	 // Setter Methods 

	 public void setUser_interface_idiom(String user_interface_idiom) {
	  this.user_interface_idiom = user_interface_idiom;
	 }

	 public void setOperating_system(String operating_system) {
	  this.operating_system = operating_system;
	 }

	 public void setModel(String model) {
	  this.model = model;
	 }

	 public void setDevice_ssid(String device_ssid) {
	  this.device_ssid = device_ssid;
	 }

}
