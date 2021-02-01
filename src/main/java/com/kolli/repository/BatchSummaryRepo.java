package com.kolli.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolli.entity.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Serializable> {

}
