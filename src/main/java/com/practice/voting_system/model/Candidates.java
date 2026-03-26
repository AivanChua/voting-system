package com.practice.voting_system.model;

public class Candidates {

	private Long id;
	private String name;
	private Long firstPlaceVotes;
	private Long secondPlaceVotes;
	private Long thirdPlaceVotes;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Long getFirstPlaceVotes() {
		return firstPlaceVotes;
	}

	public void setFirstPlaceVotes(Long firstPlaceVotes) {
		this.firstPlaceVotes = firstPlaceVotes;
	}

	public Long getSecondPlaceVotes() {
		return secondPlaceVotes;
	}

	public void setSecondPlaceVotes(Long secondPlaceVotes) {
		this.secondPlaceVotes = secondPlaceVotes;
	}

	public Long getThirdPlaceVotes() {
		return thirdPlaceVotes;
	}

	public void setThirdPlaceVotes(Long thirdPlaceVotes) {
		this.thirdPlaceVotes = thirdPlaceVotes;
	}
	
}
