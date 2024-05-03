package com.aditya.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PraxApp2 {
	public static void main(String [] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PraxApp2Config.class);
	
		System.out.println(context.getBean("car_name"));
		System.out.println(context.getBean("car_nos"));
		System.out.println(context.getBean("engine"));
		
		System.out.println(context.getBean("bean_name_engine3"));
		
		
		System.out.println(context.getBean("car"));
		
		System.out.println(context.getBean("car2"));
		
		System.out.println(context.getBean("car3"));
		
		System.out.println(context.getBean("car4"));

		
		

//		System.out.println(context.getBean(Engine.class));

		
		





		
	}
}
