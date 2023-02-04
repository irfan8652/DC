package com.rajnish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.rajnish.entity.PlanEntity;
import com.rajnish.repository.PlanRepo;

@Service
public class PlanServiceImpl implements PlanService{
	@Autowired
	private PlanRepo planRepo;

	@Override
	public String savePlan(PlanEntity planApp) {
		
		/*String url="";
		WebClient catFact = WebClient.create();
		Integer id = catFact.get()
        .uri(url, url.getAppId)
        .retrieve()
        .bodyToMono(Integer.class);
		if(appId==caseNumber) {
			
			planRepo.save(entity)
		}*/
		return null;
	}

}
