package com.verizon.thomas.dronelogfile.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;



@Entity
@Table(name="dlogfile")
public class DLogfile extends EntUUID {
	
    
	@Type(type="jsonb")
	@Column(columnDefinition = "jsonb")
    private Logfile logfile;

	public Logfile getLogfile() {
		return logfile;
	}

	public void setLogfile(Logfile logfile) {
		this.logfile = logfile;
	}



}
