package mru.game.view;

import java.util.Scanner;
/**
 * feb 10, 2022.
 * @author obaida Daoud
 * @author Jackie Zheng
 */
public class GameMenu {
	Scanner input;
	public int bet; 
	public char choicePBT;
	public GameMenu() {
		input =new Scanner(System.in);
	 this.bet=bet;
	this.choicePBT=choicePBT;
	}
	/**
	 * method shows game menu with input validation.
	 * @return bet choice 
	 */
	public char showGameMenu() {
		
		
		
		System.out.println("Please enter who you would like to bet on: ");
		System.out.println("\t(P) Player");
		System.out.println("\t(B) Banker");
		System.out.println("\t(T) Tie \n");
		
		
		
			System.out.print("Enter your choice here: ");
		    while (!input.hasNext()) {
		        System.out.println("That's not a valid choice!");
		        input.next(); 
		    }  choicePBT=input.next().charAt(0);
		 
			
		  
		return choicePBT;
		
	}
	/**
	 * method set bets with input validation.
	 * @return bet
	 */
	public int setBets() {
		
		
		do {
			System.out.println("How much would you like to bet?: ");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a valid bet!");
		        input.next(); 
		    }
		    bet = input.nextInt();
		} while (bet <= 0);
		
		return bet;
		
	}
	/**
	 * method return the bet 
	 * @return bet
	 */
	public int getBets() {
		return bet;
	}
	
}
