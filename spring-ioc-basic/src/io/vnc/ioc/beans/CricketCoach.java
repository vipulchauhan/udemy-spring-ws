package io.vnc.ioc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.vnc.ioc.services.FortuneService;

@Component("cricketCoach")
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;

	@Autowired
	@Qualifier("badFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Score a century";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("Congratulations team " + getTeam() + " goodies sent to " + getEmail());
		return this.fortuneService.getFortune();

	}

	public void init() {
		System.out.println("Track coach initialization");
	}

	public void destroyed() {
		System.out.println("Track coach destroyed");
	}
}
