package com.luv2cide.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		
	//load the spring configuration file
	ClassPathXmlApplicationContext	context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	//retrieve bean from spring container
	Coach theCoach =  context.getBean("myCoach", Coach.class);
	//call methods on the bean
	System.out.println("hi"+theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
	// close the context
	context.close();
	}
}
