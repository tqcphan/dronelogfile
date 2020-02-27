package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class Summary implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String home_location_lat;
	 private String home_location_lon;
	 AircraftSmartGoHome Aircraft_smart_gohomeObject;


	 // Getter Methods 

	 public String getHome_location_lat() {
	  return home_location_lat;
	 }

	 public String getHome_location_lon() {
	  return home_location_lon;
	 }

	 public AircraftSmartGoHome getAircraft_smart_gohome() {
	  return Aircraft_smart_gohomeObject;
	 }

	 // Setter Methods 

	 public void setHome_location_lat(String home_location_lat) {
	  this.home_location_lat = home_location_lat;
	 }

	 public void setHome_location_lon(String home_location_lon) {
	  this.home_location_lon = home_location_lon;
	 }

	 public void setAircraft_smart_gohome(AircraftSmartGoHome aircraft_smart_gohomeObject) {
	  this.Aircraft_smart_gohomeObject = aircraft_smart_gohomeObject;
	 }


}
