package com.luv2cide.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
    public void doMyStartupStuff()
    {
    	System.out.println("TrackCoach: inside method doMyStartupStuff, just to check");
    }
	//add a destroy method
    
    public void doMyCleanupStuffYoYo()
    {

    	System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo, even I want to make a conflict");

    }

}
