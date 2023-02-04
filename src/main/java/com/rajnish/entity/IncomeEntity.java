package com.rajnish.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="INCOME_DETAILS")
public class IncomeEntity {
	@Id
	@GeneratedValue
	private Integer incomeId;
	private Double monthlyIncome;
	private Double rentIncome;
	private Double properIncome;
	
	@ManyToOne
	@PrimaryKeyJoinColumn(name = "Plane_Id")
    private PlanEntity planEntity;
}
