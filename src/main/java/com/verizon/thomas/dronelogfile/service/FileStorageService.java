package com.verizon.thomas.dronelogfile.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
	 public String storeLogFile(MultipartFile file);
	

}
