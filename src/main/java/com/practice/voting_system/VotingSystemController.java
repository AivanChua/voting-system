package com.practice.voting_system;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.voting_system.model.Candidates;
import com.practice.voting_system.model.Votes;

import repository.VotesRepository;

@RestController
public class VotingSystemController {
	
	@Autowired
	private VotesRepository votesRepository;

	@RequestMapping("/")
	public String index() {
		return "home.html";
	}
	
	//submit votes
//	@PostMapping("/votes") 
//	public {
//		
//	}
	
	//submit votes
	@PostMapping("/votes") 
	public Votes submitUserVotes(@RequestBody Votes userVotes){
		return votesRepository.save(userVotes);
	}
	
	@GetMapping("/candidates")
	public List<Candidates> retrieveCandidateListWithLeader() {
		List<Candidates> resultList = new ArrayList<>();
		return resultList;
	}
	
}
