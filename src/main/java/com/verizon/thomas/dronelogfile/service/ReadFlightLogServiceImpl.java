package com.verizon.thomas.dronelogfile.service;

import java.util.Collections;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogFile;
import org.springframework.stereotype.Service;

import com.verizon.thomas.dronelogfile.domain.DLogfile;
import com.verizon.thomas.dronelogfile.domain.FlightLogging;
import com.verizon.thomas.dronelogfile.domain.Logfile;
import com.verizon.thomas.dronelogfile.domain.Voltage;
import com.verizon.thomas.dronelogfile.repository.DLogfileRepository;
import com.verizon.thomas.dronelogfile.tools.EventComparator;

/**
 * @author thomasphan
 *
 */
@Service
public class ReadFlightLogServiceImpl implements ReadFlightLogService {
	
	@Autowired
	private DLogfileRepository dlogfilerRepo;
	
	
	public Voltage readVoltageFlightById (String uid) {
		DLogfile jsonfile = dlogfilerRepo.findById(UUID.fromString(uid));
        Voltage rV= new Voltage();
		
		if (jsonfile == null) return null;
		if (jsonfile!=null) {
		 FlightLogging flog;
		 flog = jsonfile.getLogfile().getMessage().getFlight_logging();
		 Collections.sort(flog.getFlight_logging_items(),new EventComparator() );
		 int nbItems = flog.getFlight_logging_items().size();
		 if (nbItems >0) {
			 int SVoltage = (int) flog.getFlight_logging_items().get(0).get(28);
			 int EVoltage = (int) flog.getFlight_logging_items().get(nbItems-1).get(28);
			 rV.setStartingVoltage(SVoltage);
			 rV.setEndingVoltage(EVoltage);
		  }
		 }
		 return  rV;
	}
   
	
	public Logfile readLogfleById (String uid) {
		DLogfile jsonfile = dlogfilerRepo.findById(UUID.fromString(uid));
		if (jsonfile == null) return null;
		return jsonfile.getLogfile();
	}
}
