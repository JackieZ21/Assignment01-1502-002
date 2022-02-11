package mru.game.view;

import java.util.Scanner;
/**
 * feb 10, 2022.
 * @author obaida Daoud
 * @author Jackie Zheng
 */
public class GameMenu {
	Scanner input;
	
	public GameMenu() {
		input =new Scanner(System.in);
		
	}
	public char showGameMenu() {
		char choicePBT;
		
		System.out.println("Please enter who you would like to bet on: ");
		System.out.println("\t(P) Player");
		System.out.println("\t(B) Banker");
		System.out.println("\t(T) Tie \n");
		
		
		do {
			System.out.print("Enter your choice here: ");
		    while (!input.hasNext()) {
		        System.out.println("That's not a valid bet!");
		        input.next(); // this is important!
		    }
		    choicePBT=input.next().charAt(0);;
		} while (choicePBT !='p'&& choicePBT !='P' &&choicePBT!='b' && choicePBT !='B'&&choicePBT!='t'&&choicePBT!='T' );
		
		    
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
