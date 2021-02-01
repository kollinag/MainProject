package com.kolli.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolli.entity.COPdfs;

public interface CoPdfRepo extends JpaRepository<COPdfs,Serializable> {

}
