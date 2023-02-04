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
@Table(name="KID_DETAILS")
public class KidEntity {
	@Id
	@GeneratedValue
	private Integer kidId;
	private String kidName;
	private Integer kidAge;

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "Plane_Id")
    private PlanEntity planEntity;
}
