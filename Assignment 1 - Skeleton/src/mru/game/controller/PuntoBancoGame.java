package mru.game.controller;

import mru.game.view.GameMenu;

public class PuntoBancoGame {
	
	/**
	 * In this class you implement the game
	 * You should use CardDeck class here
	 * See the instructions for the game rules
	 */
	GameMenu gm;
	CardDeck cd;
	public PuntoBancoGame() {
		gm=new GameMenu();
		launchTGame();
	}
	
	
	public boolean launchTGame() {
		String betPBT;
		int betAmount;
		boolean win=false;
		
		 betPBT=gm.showGameMenu();
		 betAmount=gm.setBets();
		 
		 
		return win;
		 
		 
		 
		
	}
}
