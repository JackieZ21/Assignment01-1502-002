package mru.game.view;

import java.util.Scanner;

public class GameMenu {
	Scanner input;
	
	public GameMenu() {
		input =new Scanner(System.in);
		
	}
	public String showGameMenu() {
		String choicePBT;
		System.out.println("Please enter who you would like to bet on: ");
		System.out.println("\t(P) Player");
		System.out.println("\t(B) Banker");
		System.out.println("\t(T) Tie \n");
		System.out.print("Enter your choice here: ");
		choicePBT=input.next();
		
		return choicePBT;
		
	}
	public int setBets() {
		int bet;
		
		do {
			System.out.println("How much would you like to bet?: ");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a valid bet!");
		        input.next(); // this is important!
		    }
		    bet = input.nextInt();
		} while (bet <= 0);
		
		return bet;
		
	}
	
	
	
}
