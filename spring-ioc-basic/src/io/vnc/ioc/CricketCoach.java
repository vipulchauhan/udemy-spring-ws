package io.vnc.ioc;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;

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

}
