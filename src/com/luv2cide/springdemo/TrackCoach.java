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
    	System.out.println("TrackCoach: inside method doMyStartupStuff, hey i added foe eclipse git tutorial");
    }
	//add a destroy method
    
    public void doMyCleanupStuffYoYo()
    {
    	System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo , want to arise a conflict");
    }

}
