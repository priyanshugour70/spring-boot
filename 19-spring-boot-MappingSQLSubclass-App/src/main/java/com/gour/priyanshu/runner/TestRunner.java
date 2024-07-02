package com.gour.priyanshu.runner;

import com.gour.priyanshu.service.IPoliticalMgmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gour.priyanshu.beans.PoliticalParty;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPoliticalMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		PoliticalParty party = service.fetchPoliticalPartyDetailsByPartyId(2);
		System.out.println(party);
		
		System.out.println("************************");
		
		service.fetchPoliticalPartiesByNames("congress", "bjp").forEach(System.out::println);
		
		int count = service.modifyFlagColorsByPartyName("yellow", "congress");
		System.out.println("No of rows modified are :: "+count);
	
	}
}
