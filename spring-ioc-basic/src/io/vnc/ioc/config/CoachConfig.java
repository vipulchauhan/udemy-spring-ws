package io.vnc.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.vnc.ioc.beans.Coach;
import io.vnc.ioc.beans.SwimCoach;
import io.vnc.ioc.services.BadFortuneService;
import io.vnc.ioc.services.FortuneService;

@Configuration
@ComponentScan("io.vnc.ioc")
public class CoachConfig {

	@Bean
	public FortuneService badFortuneService() {
		return new BadFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(badFortuneService());
	}
}
