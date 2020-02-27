package com.verizon.thomas.dronelogfile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author thomasphan
 *
 */
@Component
@ConfigurationProperties (prefix ="log")
public class LogStorageProperties {
	
	    private String uploadDir;

	    /**
	     * @return
	     */
	    public String getUploadDir() {
	        return uploadDir;
	    }

	    /**
	     * @param uploadDir
	     */
	    public void setUploadDir(String uploadDir) {
	        this.uploadDir = uploadDir;
	    }
}


