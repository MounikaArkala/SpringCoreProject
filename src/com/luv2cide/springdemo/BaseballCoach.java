package com.luv2cide.springdemo;

public class BaseballCoach implements Coach {

private FortuneService fortuneService;

public BaseballCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
}

@Override	
public String getDailyWorkout() {
	return "Spend 30 minjutes on batting practice";
}

@Override
public String getDailyFortune() {
    // use my fortuneService to get a fortune
	return fortuneService.getFortune();
}
}
