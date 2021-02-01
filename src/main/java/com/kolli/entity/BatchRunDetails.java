package com.kolli.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="batch_run_dtls")
public class BatchRunDetails {
	@Id
	@Column(name="BATCH_RUN_SEQ")
	private Integer batchRunId;   
	@Column(name="BATCH_NAME")
	private String batchName; 
	@Column(name="BATCH_RUN_STATUS")
	private String batchRunStatus;   
	@Column(name="ENDDATE")
	private LocalDateTime endDate;  
	@Column(name="INSTANCE_NUMBER")
	private Integer instanceNumber;  
	@Column(name="START_DATE")
	private LocalDateTime startDate;               
}
