package mru.game.view;

import java.util.Scanner;

import mru.game.model.Player;

public class AppMenu {

	/**
	 * This class will be used to show the menus and sub menus to the user
	 * It also prompts the user for the inputs and validates them 
	 */
	Scanner input;
	/**
	 * create a constructor that instantiates the objects
	 */
	public AppMenu() {
		input = new Scanner(System.in);
		//Instantiate the scanner 
	}
	
	/**
	 * this method shows the main menu which gives the user options to choose from 
	 */
	public int showMainMenu() {
		System.out.println("Select one of the options below:\n");
		System.out.println("\t(P). Play Game");
		System.out.println("\t(S). Search");
		System.out.println("\t(E). Save and Exit\n");
		System.out.print("Enter a letter here: ");
		//prints out users options to choose from 
		char option = input.nextLine().toLowerCase().charAt(0);
		return option;
	}
	/**
	 * this method prints out the subMenu which gives the user more options to choose form
	 */
	public char showSubMenu() {
		System.out.println("Select one of the options below:\n");
		System.out.println("\t(T) Top Player");
		System.out.println("\t(S) Search by Name");
		System.out.println("\t(B) Back to Main Menu \n");
		System.out.print("Enter a letter here: ");
		//Prints out the users choices in the subMenu
		char option=input.nextLine().toLowerCase().charAt(0);
		return option;
	}
	/**
	 * this method prompts the user to enter a name and then later 
	 * @return users name 
	 */
	public String prompName() {
		System.out.println("Enter a name here: ");
		//prompt user to enter name
		String name=input.nextLine().trim();
		//save the name into name variable
		return name;
		//return the users name
		
	}
	/**
	 * this method prompts user to enter id and 
	 * @return the id they input
	 */
	public String promptID() {
		System.out.println("Enter your id here: ");
		//prompt user to enter id 
		String id=input.nextLine().trim();
		//save the id into name variable
		return id;
		//return the users id
		
	}
	/**
	 * method prints out the player
	 * @param ply
	 */
	public void showPlayer(Player ply) {
		System.out.println(ply);
		//print out the player
	}
}
