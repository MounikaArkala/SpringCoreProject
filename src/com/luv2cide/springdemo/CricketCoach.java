package com.luv2cide.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String teamName;
	private String emailAddress;
	

	public String getTeamName() {
		return teamName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setTeamName(String teamName) {
		System.out.println("CricketCoach: inside setter method: setTeamName,,I added some code");
		this.teamName = teamName;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method: setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public CricketCoach()
	{
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method:setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
