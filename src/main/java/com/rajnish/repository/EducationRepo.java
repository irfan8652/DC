package com.rajnish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<EducationRepo, Serializable>{

}
