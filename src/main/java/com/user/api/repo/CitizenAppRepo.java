package com.user.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.api.entity.CitizenAppEntity;

public interface CitizenAppRepo extends JpaRepository<CitizenAppEntity, Integer> {
	
	public CitizenAppEntity  findByCitizenSsn(Long citizenSsn);
	
	public List<CitizenAppEntity> findByCreatedBy(String createdBy);

}
