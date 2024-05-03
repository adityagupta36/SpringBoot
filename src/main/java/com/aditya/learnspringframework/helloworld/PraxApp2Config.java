package com.aditya.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


record Engine(String eng_name, int eng_modelyear) {};
record Car(String car_name , int car_nos , Engine engine) {};

public class PraxApp2Config {
	
	@Bean
	public String car_name() {
		return "Maruti";
	}
	
	@Bean
	public int car_nos() {
		return 2;
	}
	
	@Bean
	public Engine engine() {
		return new Engine("Ford Engine" , 2015);
	}
	
	
	@Bean
//	@Primary
	public Engine engine2() {
		return new Engine("Mercedes Engine" , 2021);
	}
	
	@Bean("bean_name_engine3")
	public Engine engine3() {
		return new Engine("Ferrari Engine" , 2017);
	}
	
	@Bean
	@Qualifier("Qualifier_for_eng4")
	public Engine engine4(String eng_name , int eng_modelyear) {
		return new Engine("BmW Engine" , 2002);
	}
	
	@Bean 
	public Car car() {
		return new Car("Hyundai",3 , new Engine("Tata Engine" , 2019) );
	}
	
	@Bean 
	public Car car2() {
		return new Car("Chevrolet" , 6 , engine2());
	}
	
	@Bean 
	public Car car3(String car_name, int car_nos, Engine bean_name_engine3) {
		return new Car(car_name , car_nos , bean_name_engine3);
	}
	
	@Bean
	public Car car4(String car_name, int car_nos,@Qualifier("Qualifier_for_eng4") Engine bean_name_engine3) {
		return new Car(car_name , car_nos , bean_name_engine3);
	
	}

}
