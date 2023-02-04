package com.rajnish.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Plan_DETAILS")
@Data
public class PlanEntity {
	@Id 
	@GeneratedValue
	private Integer caseNumber;
	private String planName;
}
