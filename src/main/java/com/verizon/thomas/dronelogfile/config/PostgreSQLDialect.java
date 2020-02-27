package com.verizon.thomas.dronelogfile.config;

import java.sql.Types;

import org.hibernate.dialect.PostgreSQL91Dialect;

public class PostgreSQLDialect extends PostgreSQL91Dialect {

	    public PostgreSQLDialect() {
	        super();
	        this.registerColumnType( Types.JAVA_OBJECT, "json" );
	    }
	
}
