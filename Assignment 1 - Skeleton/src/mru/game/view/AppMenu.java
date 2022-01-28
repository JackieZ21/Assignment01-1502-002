package mru.game.view;

import java.util.Scanner;

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
	public void showMainMenu() {
		System.out.println("Select one of the options below:\n");
		System.out.println("\t. Play Game");
		System.out.println("\t. Search");
		System.out.println("\t. Save and Exit\n");
		System.out.print("Enter a number here: ");
		//prints out users options to choose from 
	}
	/**
	 * this method prints out the subMenu which gives the user more options to choose form
	 */
	public void showSubMenu() {
		System.out.println("Select one of the options below:\n");
		System.out.println("\t(T) Top Player");
		System.out.println("\t(S) Search by Name");
		System.out.println("\t(B) Back to Main Menu \n");
		System.out.print("Enter a number here: ");
		//Prints out the users choices in the subMenu
	}
	/**
	 * this method prompts the user to enter a name and then later 
	 * @return users name 
	 */
	public String prompName() {
		System.out.println("Enter a name here: ");
		//prompt user to enter name
		String name=input.nextLine();
		//save the name into name variable
		return name;
		//return the users name
		
	}
}
