package io.vnc.ioc.beans;

import io.vnc.ioc.services.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on swimming practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
