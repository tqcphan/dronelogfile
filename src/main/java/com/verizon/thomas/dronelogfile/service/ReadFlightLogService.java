package com.verizon.thomas.dronelogfile.service;

import com.verizon.thomas.dronelogfile.domain.Logfile;
import com.verizon.thomas.dronelogfile.domain.Voltage;

public interface ReadFlightLogService {
	
	public Voltage readVoltageFlightById (String uid);
	public Logfile readLogfleById (String uid);

}
