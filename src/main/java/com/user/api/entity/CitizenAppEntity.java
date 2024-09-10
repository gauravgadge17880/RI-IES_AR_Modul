package com.user.api.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CitizenAppEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseNum;
	
	private String CitizenName;
	
	private String citizenEmail;
	
	private Long citizenPhno;
	
	private String citizenGender;
	
	private LocalDate citizenDob;
	
	private Long citizenSsn;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updateDate;
	
	private String createdBy;
	

}
