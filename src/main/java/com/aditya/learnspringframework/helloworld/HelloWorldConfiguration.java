package com.aditya.learnspringframework.helloworld;

import java.lang.annotation.Retention;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor, 
//equals, hashcode and toString are automatically created. 
//Released in JDK 16.
record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean // method level annotation
	public String name() {
		return "Aditya";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		Person person = new Person("Atmiya", 26, new Address("Dwarka", "Delhi"));
		return person;
	}

	@Bean
	public Person person2MethodCall() {
		// Creating new Person Spring bean with relationship to existing Spring beans
		Person person = new Person(name(), age(), address());
		return person;
	}

	@Bean // fetching other bean data in new bean by calling "beans name"
	public Person person3Parameters(String name, int age, Address address3) {
		Person person = new Person(name, age, address3);
		return person;
	} 
	
	@Bean 
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		Person person = new Person(name, age, address);
		return person;
	} 
	
	@Bean 
	public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) {
		Person person = new Person(name, age, address);
		return person;
	} 

	@Bean(name = "address2") // customize bean names
	@Primary                 //denotes most imp bean(especially when multiple beans of same class type found)
	public Address address() {
		Address address = new Address("borivali", "Mumbai");
		return address;

//	    return new Address("borivali", "Mumbai");
	}

	@Bean(name = "address3") // customize bean names
	@Qualifier("address3Qualifier")
	public Address addresss() {
		Address address = new Address("Baker Street", "London");
		return address;

	}

}
