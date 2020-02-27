package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String event_info ;
	private String event_timestamp ;
	private String event_type;
	
	
	public String getEvent_info() {
		return event_info;
	}
	public void setEvent_info(String event_info) {
		this.event_info = event_info;
	}
	public String getEvent_timestamp() {
		return event_timestamp;
	}
	public void setEvent_timestamp(String event_timestamp) {
		this.event_timestamp = event_timestamp;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	


}
