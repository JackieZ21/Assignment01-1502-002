package mru.game.view;

import java.util.Scanner;

public class GameMenu {
	Scanner input;
	
	public GameMenu() {
		input =new Scanner(System.in);
		
	}
	public int showGameMenu() {
		int card;
		System.out.println("Please enter a number between 1 and 10: ");
		card=input.nextInt();
		
		return card;
		
	}
	
}
