package com.rajnish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajnish.entity.KidEntity;

@Repository
public interface KidRepo extends JpaRepository<KidEntity, Serializable>{

}
