package io.vnc.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.vnc.ioc.beans.Coach;
import io.vnc.ioc.config.CoachConfig;

public class AnnotationSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);

		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);

		// call methods on the bean
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());

		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());

		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
