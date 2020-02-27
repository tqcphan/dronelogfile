package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class Logfile implements Serializable {
		
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exchange_type;
	 private String exchanger;
	 private String uploadingOrgUuid = null;
	 private String uploadingPilotUuid;
	 private String flight_session_id;
	 Message MessageObject;


	 // Getter Methods 

	 public String getExchange_type() {
	  return exchange_type;
	 }

	 public String getExchanger() {
	  return exchanger;
	 }

	 public String getUploadingOrgUuid() {
	  return uploadingOrgUuid;
	 }

	 public String getUploadingPilotUuid() {
	  return uploadingPilotUuid;
	 }

	 public String getFlight_session_id() {
	  return flight_session_id;
	 }

	 public Message getMessage() {
	  return MessageObject;
	 }

	 // Setter Methods 

	 public void setExchange_type(String exchange_type) {
	  this.exchange_type = exchange_type;
	 }

	 public void setExchanger(String exchanger) {
	  this.exchanger = exchanger;
	 }

	 public void setUploadingOrgUuid(String uploadingOrgUuid) {
	  this.uploadingOrgUuid = uploadingOrgUuid;
	 }

	 public void setUploadingPilotUuid(String uploadingPilotUuid) {
	  this.uploadingPilotUuid = uploadingPilotUuid;
	 }

	 public void setFlight_session_id(String flight_session_id) {
	  this.flight_session_id = flight_session_id;
	 }

	 public void setMessage(Message messageObject) {
	  this.MessageObject = messageObject;
	 }
	

}
