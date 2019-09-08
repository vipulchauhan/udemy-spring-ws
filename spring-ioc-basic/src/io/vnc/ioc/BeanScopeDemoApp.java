package io.vnc.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.vnc.ioc.beans.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container

		Coach cricketCoach1 = context.getBean("cricketCoach", Coach.class);

		Coach cricketCoach2 = context.getBean("cricketCoach", Coach.class);

		System.out.println("coach 1 address " + cricketCoach1);
		System.out.println("coach 2 address " + cricketCoach2);
		System.out.println("two coaches are equal is " + (cricketCoach1 == cricketCoach2));

		Coach trackCoach1 = context.getBean("trackCoach", Coach.class);

		Coach trackCoach2 = context.getBean("trackCoach", Coach.class);

		System.out.println("coach 1 address " + trackCoach1);
		System.out.println("coach 2 address " + trackCoach2);
		System.out.println("two coaches are equal is " + (trackCoach1 == trackCoach2));

		// close the context
		context.close();

	}

}
