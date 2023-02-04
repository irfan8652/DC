package com.rajnish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajnish.entity.IncomeEntity;
import com.rajnish.repository.IncomeRepo;

@Service
public class IncomeServiceImpl implements IncomeService{
	
	@Autowired
	private IncomeRepo incomeRepo;
	@Override
	public String saveIncome(IncomeEntity incomeApp) {
		
		return null;
	}

}
