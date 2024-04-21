package com.aditya.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aditya.learnspringframework.game.GameRunner;
import com.aditya.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
//			GamingConsole gc = (GamingConsole)context.getBean("game");
//			gc.up();
			
			
			context.getBean(GameRunner.class).run();

			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


			}
}
