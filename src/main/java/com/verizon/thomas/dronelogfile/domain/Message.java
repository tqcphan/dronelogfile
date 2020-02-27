package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class Message implements Serializable {

	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	File FileObject;
	 private String message_type;
	 FlightLogging Flight_loggingObject;
	 FlightData Flight_dataObject;


	 // Getter Methods 

	 public File getFile() {
	  return FileObject;
	 }

	 public String getMessage_type() {
	  return message_type;
	 }

	 public FlightLogging getFlight_logging() {
	  return Flight_loggingObject;
	 }

	 public FlightData getFlight_data() {
	  return Flight_dataObject;
	 }

	 // Setter Methods 

	 public void setFile(File fileObject) {
	  this.FileObject = fileObject;
	 }

	 public void setMessage_type(String message_type) {
	  this.message_type = message_type;
	 }

	 public void setFlight_logging(FlightLogging flight_loggingObject) {
	  this.Flight_loggingObject = flight_loggingObject;
	 }

	 public void setFlight_data(FlightData flight_dataObject) {
	  this.Flight_dataObject = flight_dataObject;
	 }
}
