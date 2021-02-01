package com.kolli.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name=" CO_TRIGGERS")
public class COTriggers {
	@Column(name="trg_id")
	private Integer tiggerId;
	@Column(name="case_num")
	private Integer caseNum;
	@Column(name="create_dt")
	private Date createdDate;
	@Column(name="trg_status")
	private String trgStatus;
	@Column(name="update_dt")
	private Date updatedDate;
}
