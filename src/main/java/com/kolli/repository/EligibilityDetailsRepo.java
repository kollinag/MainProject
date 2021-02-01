package com.kolli.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolli.entity.EligibilityDetails;

public interface EligibilityDetailsRepo extends JpaRepository<EligibilityDetails,Serializable> {

}
