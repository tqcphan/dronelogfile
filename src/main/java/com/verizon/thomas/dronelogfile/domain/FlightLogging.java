package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class FlightLogging implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList < Event > event = new ArrayList < Event > ();
	 private String altitude_system;
	 private String logging_start_dtg;
	 ArrayList<ArrayList<Object>> flight_logging_items = new ArrayList < ArrayList <Object> > ();
	 ArrayList < String > flight_logging_keys = new ArrayList < String > ();


	 // Getter Methods 

	 public String getAltitude_system() {
	  return altitude_system;
	 }

	 public String getLogging_start_dtg() {
	  return logging_start_dtg;
	 }

	 // Setter Methods 

	 public void setAltitude_system(String altitude_system) {
	  this.altitude_system = altitude_system;
	 }

	 public void setLogging_start_dtg(String logging_start_dtg) {
	  this.logging_start_dtg = logging_start_dtg;
	 }

	public ArrayList<Event> getEvent() {
		return event;
	}

	public void setEvent(ArrayList<Event> event) {
		this.event = event;
	}

	public ArrayList<ArrayList<Object>> getFlight_logging_items() {
		return flight_logging_items;
	}

	public void setFlight_logging_items(ArrayList<ArrayList<Object>> flight_logging_items) {
		this.flight_logging_items = flight_logging_items;
	}

	public ArrayList<String> getFlight_logging_keys() {
		return flight_logging_keys;
	}

	public void setFlight_logging_keys(ArrayList<String> flight_logging_keys) {
		this.flight_logging_keys = flight_logging_keys;
	}
	 
	 
}
