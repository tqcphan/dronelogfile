package com.verizon.thomas.dronelogfile.domain;

public class Voltage {
    int startingVoltage;
    int endingVoltage;
	public Voltage(int startingVoltage, int endingVoltage) {
		super();
		this.startingVoltage = startingVoltage;
		this.endingVoltage = endingVoltage;
	}
	public Voltage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStartingVoltage() {
		return startingVoltage;
	}
	public void setStartingVoltage(int startingVoltage) {
		this.startingVoltage = startingVoltage;
	}
	public int getEndingVoltage() {
		return endingVoltage;
	}
	public void setEndingVoltage(int endingVoltage) {
		this.endingVoltage = endingVoltage;
	}
	
    
}
