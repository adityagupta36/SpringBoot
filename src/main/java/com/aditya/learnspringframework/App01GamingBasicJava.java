package com.aditya.learnspringframework;

import com.aditya.learnspringframework.game.GameRunner;
import com.aditya.learnspringframework.game.GamingConsole;
import com.aditya.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
	
//		GamingConsole game = new MarioGame();
		
//		GamingConsole game = new SuperContraGame();
		
		GamingConsole game = new PacmanGame();            //1:Object Creation
		GameRunner gameRunner = new GameRunner(game);     
		//2:Object creation + Wiring of Dependencies
		//game is a dependency of GameRunner 
		
		gameRunner.run();
		

	}

}
