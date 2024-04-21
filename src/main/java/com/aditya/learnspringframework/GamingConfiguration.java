package com.aditya.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aditya.learnspringframework.game.GameRunner;
import com.aditya.learnspringframework.game.GamingConsole;
import com.aditya.learnspringframework.game.PacmanGame;



@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		GamingConsole game= new PacmanGame();
		return game;
	}
	
//	@Bean
//	public GameRunner gameRunner() {
//		GameRunner game = new GameRunner(game());
//		return game;
//	}
//	                 OR
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		GameRunner gameRunner = new GameRunner(game);
		return gameRunner;
	}
	

	
}
