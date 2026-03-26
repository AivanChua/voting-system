package com.practice.voting_system.model;

public class Votes {
	
	private Long id;
	private String user;
	private String firstPlace;
	private String secondPlace;
	private String thirdPlace;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getFirstPlace() {
		return firstPlace;
	}
	
	public void setFirstPlace(String firstPlace) {
		this.firstPlace = firstPlace;
	}
	
	public String getSecondPlace() {
		return secondPlace;
	}
	
	public void getSecondPlace(String secondPlace) {
		this.secondPlace = secondPlace;
	}

	public String getThirdPlace() {
		return thirdPlace;
	}

	public void setThirdPlace(String thirdPlace) {
		this.thirdPlace = thirdPlace;
	}

}
