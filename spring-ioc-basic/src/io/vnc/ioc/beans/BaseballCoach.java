package io.vnc.ioc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.vnc.ioc.services.FortuneService;

@Component()
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public BaseballCoach(@Qualifier("badFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
