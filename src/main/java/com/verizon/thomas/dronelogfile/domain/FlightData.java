package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class FlightData implements Serializable {
	
	 
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Payload PayloadObject;
	 RemoteController Remote_controllerObject;
	 Aircraft AircraftObject;
	 Summary SummaryObject;
	 Gcs GcsObject;
	 private String flight_session_end;
	 FlightController Flight_controllerObject;
	 Battery BatteryObject;
	 private String flight_session_start;
	 LogFileDeviceOrigin Logfile_device_originObject;


	 // Getter Methods 

	 public Payload getPayload() {
	  return PayloadObject;
	 }

	 public RemoteController getRemote_controller() {
	  return Remote_controllerObject;
	 }

	 public Aircraft getAircraft() {
	  return AircraftObject;
	 }

	 public Summary getSummary() {
	  return SummaryObject;
	 }

	 public Gcs getGcs() {
	  return GcsObject;
	 }

	 public String getFlight_session_end() {
	  return flight_session_end;
	 }

	 public FlightController getFlight_controller() {
	  return Flight_controllerObject;
	 }

	 public Battery getBattery() {
	  return BatteryObject;
	 }

	 public String getFlight_session_start() {
	  return flight_session_start;
	 }

	 public LogFileDeviceOrigin getLogfile_device_origin() {
	  return Logfile_device_originObject;
	 }

	 // Setter Methods 

	 public void setPayload(Payload payloadObject) {
	  this.PayloadObject = payloadObject;
	 }

	 public void setRemote_controller(RemoteController remote_controllerObject) {
	  this.Remote_controllerObject = remote_controllerObject;
	 }

	 public void setAircraft(Aircraft aircraftObject) {
	  this.AircraftObject = aircraftObject;
	 }

	 public void setSummary(Summary summaryObject) {
	  this.SummaryObject = summaryObject;
	 }

	 public void setGcs(Gcs gcsObject) {
	  this.GcsObject = gcsObject;
	 }

	 public void setFlight_session_end(String flight_session_end) {
	  this.flight_session_end = flight_session_end;
	 }

	 public void setFlight_controller(FlightController flight_controllerObject) {
	  this.Flight_controllerObject = flight_controllerObject;
	 }

	 public void setBattery(Battery batteryObject) {
	  this.BatteryObject = batteryObject;
	 }

	 public void setFlight_session_start(String flight_session_start) {
	  this.flight_session_start = flight_session_start;
	 }

	 public void setLogfile_device_origin(LogFileDeviceOrigin logfile_device_originObject) {
	  this.Logfile_device_originObject = logfile_device_originObject;
	 }

}
