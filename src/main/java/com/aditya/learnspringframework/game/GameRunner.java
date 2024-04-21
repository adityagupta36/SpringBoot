package com.aditya.learnspringframework.game;

public class GameRunner {

	
	private MarioGame marioGame;                  //tight coupling
	
	private SuperContraGame superContrGame;       //tight coupling
	
	private GamingConsole gamingConsole;          //loose coupling using Interfaces
	

	/*
	 * public GameRunner(MarioGame marioGame) { this.marioGame = marioGame; }
	 */

	public GameRunner(GamingConsole gamingConsole) {
		this.gamingConsole = gamingConsole;
	}




	/*
	 * public void run() {
	 * 
	 * System.out.println("Running Game: " + marioGame );
	 * 
	 * marioGame.up(); marioGame.down(); marioGame.left(); marioGame.right();
	 * 
	 * }
	 */
	
	public void run() {
		
		System.out.println("Running Game: " + gamingConsole );

		gamingConsole.up();
		gamingConsole.down();
		gamingConsole.left();
		gamingConsole.right();
		
	}

}
