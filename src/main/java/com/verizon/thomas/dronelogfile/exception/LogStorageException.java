package com.verizon.thomas.dronelogfile.exception;


/**
 * @author thomasphan
 *
 */
public class LogStorageException extends RuntimeException{
	
	   private static final long serialVersionUID = 1L;

	    /**
	     * @param message
	     */
	    public LogStorageException(String message) {
	        super(message);
	    }

	    /**
	     * @param message
	     * @param cause
	     */
	    public LogStorageException(String message, Throwable cause) {
	        super(message, cause);
	    }

}
