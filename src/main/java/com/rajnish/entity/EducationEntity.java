package com.rajnish.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="EDUCATION_DETAILS")
public class EducationEntity{
	@Id
	@GeneratedValue
	private Integer educationId;
	private String educationName;
	private LocalDate graducationYear;
	private String universityName;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "Plane_Id")
    private PlanEntity planEntity;
}
