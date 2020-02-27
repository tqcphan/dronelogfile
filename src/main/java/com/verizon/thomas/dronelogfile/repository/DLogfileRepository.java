package com.verizon.thomas.dronelogfile.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.verizon.thomas.dronelogfile.domain.DLogfile;

@RepositoryRestResource

public interface DLogfileRepository extends JpaRepository <DLogfile, Long> {

	
	DLogfile findById (UUID id); 
}
