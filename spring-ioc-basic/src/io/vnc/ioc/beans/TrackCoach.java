package io.vnc.ioc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.vnc.ioc.services.FortuneService;

@Component("trackCoach")
public class TrackCoach implements Coach {

	@Autowired	
	private FortuneService fortuneService;

	private static int count = 0;

	public TrackCoach() {
		super();
		System.out.println("Track coach " + count + " constructor called");
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public void init() {
		System.out.println("Track coach initialization");
	}

	public void destroyed() {
		System.out.println("Track coach destroyed");
	}

}
