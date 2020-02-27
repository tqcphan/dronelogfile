package com.verizon.thomas.dronelogfile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LogFileNotFoundException extends RuntimeException {
	 private static final long serialVersionUID = 1L;
	 
    public LogFileNotFoundException (String message) {
    	 super(message);
    }
    public LogFileNotFoundException (String message, Throwable cause)
    {
    	 super(message, cause);
    }
    	
}

