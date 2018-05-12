package com.luv2cide.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		beanScopeDemo();
		
	}
   public static void beanScopeDemo()
   {
	 //load the spring configuration file
	 		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	        
	 		// retrieve bean from spring container
	 		Coach theCoach = context.getBean("myCoach",Coach.class);
	 		Coach alphaCoach = context.getBean("myCoach",Coach.class); 
	 		
	 		//check if they are the same
	 		System.out.println("Pointing to the same object "+ (theCoach == alphaCoach) );
	 		System.out.println("Memory location for the Coach: "+ theCoach);
	 		System.out.println("Memory location for the alphaCoach: "+ alphaCoach);
	 		
	 		//close the context
	 		context.close();
	 		
	 		
   }
}
