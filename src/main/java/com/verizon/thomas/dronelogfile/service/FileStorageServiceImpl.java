package com.verizon.thomas.dronelogfile.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.verizon.thomas.dronelogfile.config.LogStorageProperties;
import com.verizon.thomas.dronelogfile.exception.LogStorageException;

/**
 * @author thomasphan
 *
 */
@Service
public class FileStorageServiceImpl implements FileStorageService {
	
	private final Path logStorageLocation;

    /**
     * @param logStorageProperties
     */
    @Autowired
    public FileStorageServiceImpl(LogStorageProperties logStorageProperties) {
        this.logStorageLocation = Paths.get(logStorageProperties.getUploadDir())
            .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.logStorageLocation);
        } catch (Exception ex) {
            throw new LogStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }
    
    
    /**
     * @param file
     * @return
     */
    public String storeLogFile(MultipartFile file) {
        // Generate UUID for filename 
        String fileName = UUID.randomUUID().toString();

        try {
           
            // Copy file to the target location
            Path targetLocation = this.logStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (IOException ex) {
            throw new LogStorageException("Could not store file, Please try again!", ex);
        }
    }

	
	
}
