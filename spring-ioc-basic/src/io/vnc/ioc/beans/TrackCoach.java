package io.vnc.ioc.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.vnc.ioc.services.FortuneService;

@Component("trackCoach")
@Scope("prototype")
public class TrackCoach implements Coach {

	@Autowired
	@Qualifier("badFortuneService")
	private FortuneService fortuneService;

	private static int count = 0;

	public TrackCoach() {
		super();
		System.out.println("Track coach " + count + " constructor called");
		count++;
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

	@PostConstruct
	public void init() {
		System.out.println("Track coach initialization");
	}

	@PreDestroy
	public void destroyed() {
		System.out.println("Track coach destroyed");
	}

}
