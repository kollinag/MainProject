package com.kolli.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="batch_summary")
public class BatchSummary {
	@Id
	@Column(name="SUMMARY_ID")
	private Integer summaryId;
	@Column(name="BATCH_NAME")
	private String batchName;
	@Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failTriggerCount;
	@Column(name="SUCCESS_TRIGGER_COUNT")
	private Integer successtriggerCount;
	@Column(name="TOTAL_TRIGGER_PROCESSED")
	private Integer totalTgiggerCount;

}
