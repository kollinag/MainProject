package com.kolli.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="co_pdfs")
public class COPdfs {
	
	@Column(name="co_pdf_id")
	private Integer coPdfs;
	@Column(name="plan_status")
	private String planStatus;
	@Column(name="case_number")
	private String caseNumber;
	@Column(name="pdfDocument")
	private Byte[] pdfDocument;
	@Column(name="plan_name")
	private String planName;
	
	

}
