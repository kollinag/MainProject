package com.kolli.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolli.entity.BatchRunDetails;

public interface BatchRunDetailsRepo extends JpaRepository<BatchRunDetails,Serializable> {

}
