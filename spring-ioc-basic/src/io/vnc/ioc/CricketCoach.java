package io.vnc.ioc;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Score a century";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();

	}

}
