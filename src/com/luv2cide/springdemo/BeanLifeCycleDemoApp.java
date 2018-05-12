package com.luv2cide.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		beanScopeDemo();
		
	}
   public static void beanScopeDemo()
   {
	 //load the spring configuration file
	 		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
	        
	 		// retrieve bean from spring container
	 		Coach theCoach = context.getBean("myCoach",Coach.class);
	 		
	 		System.out.println(theCoach.getDailyWorkout());
	 		
	 		//close the context
	 		context.close();
	 		
	 		
   }
}
