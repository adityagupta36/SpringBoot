package com.aditya.learnspringframework.helloworld;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aditya.learnspringframework.game.GameRunner;
import com.aditya.learnspringframework.game.GamingConsole;
import com.aditya.learnspringframework.game.PacmanGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: Launch a Spring Context
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//2: Configure things that we want Spring to manage -@Configuration
			//HelloWorldConfiguration -@Configuration
			//name -@Bean
			System.out.println(context.getBean("name"));   
			System.out.println(context.getBean("age"));   
			System.out.println(context.getBean("person"));  
			System.out.println(context.getBean("address2"));   //name of the bean
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address3"));
			System.out.println(context.getBean(Address.class));  //type of the bean
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person5Qualifier"));
			Person person = (Person)context.getBean("person5Qualifier");
			System.out.println("Hello ==> " + person);
			
			
			 String [] array = context.getBeanDefinitionNames(); 
			 for(String s : array) {
			 System.out.println(s); 
			 }
			 
			 
//				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
				
			 
			 
		} 
		catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		

		 
	}

}
