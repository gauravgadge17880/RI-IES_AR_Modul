package com.user.api.binding;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
public class CitizenApp {

	private Integer caseNum;

	private String CitizenName;

	private String citizenEmail;

	private Long citizenPhno;

	private String citizenGender;

	private LocalDate citizenDob;

	private Long citizenSsn;

	private LocalDate createdDate;

	private LocalDate updateDate;

	private String createdBy;
}
