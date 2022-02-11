package mru.game.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import mru.game.model.Player;
import mru.game.view.AppMenu;
/**
 * feb 10, 2022.
 * @author obaida Daoud
 * @author Jackie Zheng
 * @version 1.0
 */
public class GameManager {

	/*
	 * In this class toy'll need these methods: A constructor A method to load the
	 * txt file into an arraylist (if it exists, so you check if the txt file exists
	 * first) A save method to store the arraylist into the the txt file A method to
	 * search for a player based their name A method to find the top players
	 * Depending on your designing technique you may need and you can add more
	 * methods here
	 */
	// create the file path
	private final String FILE_PATH = "res/players.txt";
	// create the array list
	ArrayList<Player> players;
	// create the scanner object
	Scanner fileReader;
	AppMenu appMenu;
	private final int INIT_WINS = 0;
	private final int INIT_BALANCE = 100;
	private double runningBalance;
	PuntoBancoGame pb;
/**
 * method Game Manager loads the arrayList and instantiate it.
 * instantiate the appMenu.
 * create the file.
 *  shows the main menu.
 * @throws Exception
 */
	public GameManager() throws Exception {
		// instantiate the arraylist here
		players = new ArrayList<>();
		// load the data
		appMenu = new AppMenu();
		// instantiate the appMenu
		loadData();
		// create the file
		launchApplication();
		// shows the main menu
		
	}
/**
 * method contain switch case for main menu
 * @throws IOException
 */
	private void launchApplication() throws IOException {
		boolean flag = true;
		char option = (char) appMenu.showMainMenu();
		while (flag) {

			switch (option) {
			case 'p':
				playGame();
				break;
			case 's':
				Search();
				break;
			case 'e':
				Save();
				flag = false;

			}
		}
	}

	/**
	 * this method prompts the user with a name searches for the users name
	 */
	private void playGame() {
		// TODO Auto-generated method stub

		String name = appMenu.prompName();

		Player p = searchByName(name);
		// search for the name

		if (p == null) {

			players.add(new Player(name, INIT_BALANCE, INIT_WINS));
			System.out.println("Welcome "+name+" Your initial balance is: $"+INIT_BALANCE);
			// create the player

		} 
		pb = new PuntoBancoGame();
		boolean win=pb.launchTGame();
		if (win) {
			for(Player pl: players) {
				int num=pl.getNumOfWins();
				pl.setNumOfWins(num+1);
			}
		}

	}
/**
 * method contain switch case for player search.
 * @throws IOException
 */
	private void Search() throws IOException {
		char option = appMenu.showSubMenu();
		switch (option) {
		case 't':
			FindTopPlayer();
			break;
		case 's':
			String name = appMenu.prompName();
			Player ply = searchByName(name);
			appMenu.showPlayer(ply);
			break;
		case 'b':
			launchApplication();
			break;

		default:
			break;
		}

	}
/**
 * method search for players Name.
 * @param name
 * @return player name
 */
	private Player searchByName(String name) {

		Player ply = null;
		for (Player p : players) {
			if (p.getName().equals(name)) {
				ply = p;
				break;
			}
		}
		return ply;
	}
	
	private void printHorizontalBoundary(String token) {
		for (int i = 0; i < 75; i++) {
			System.out.print(token);
		}
		System.out.println();
	}
	private void printHeader(String head) {
		for (int i = 0; i < 30; i++) {
			System.out.print(" ");
		}
		System.out.print("- " + head + " -");
		for (int i = 0; i < 30; i++) {
			System.out.print(" ");
		}
		System.out.println("");
	}
/**
 * method finds and prints top 2 players
 * @throws Exception 
 * 
 */
	private void FindTopPlayer() {
		if (players.size() == 0) {
			System.out.println("No player found in database");
			return;
		}
	
		printHeader("TOP PLAYERS");
		int maxScore = Integer.MIN_VALUE;
		
		for (Player p: players) {
			if (p.getNumOfWins() > maxScore) {
				maxScore = p.getNumOfWins();
			}
		}
		printHorizontalBoundary("=");
		printOneLine("|NAME", "|# WINS");
		printHorizontalBoundary("=");
		for (Player p: players) {
			if (p.getNumOfWins() == maxScore) {
				printOneLine(p.getName(), Integer.toString(p.getNumOfWins()));
				printHorizontalBoundary("-");
			}
		}		
	}
	/**
	 * 
	 * @param text1
	 * @param text2
	 */
	private void printOneLine(String text1, String text2) {
		System.out.printf("|%-36s|%-36s|\n", text1, text2);
	}
	
	
	
/**
 * method Save after player Exits.
 * @throws IOException
 */
	private void Save() throws IOException {
		File db = new File(FILE_PATH);
		PrintWriter pw = new PrintWriter(db);

		for (Player p : players) {
			pw.println(p.format());
		}
		System.out.println("saved, thank you for playing");
		pw.close();
	}
/**
 * method load old data
 * add new player 
 * @throws Exception
 */
	private void loadData() throws Exception {
		File db = new File(FILE_PATH);
		String currentLine;
		String[] splittedLine;
		if (db.exists()) {
			fileReader = new Scanner(db);
			// instantiate the scanner
			while (fileReader.hasNextLine()) {
				currentLine = fileReader.nextLine();
				// read the file
				splittedLine = currentLine.split(";");
				// read the lines split with semi colon
				Player p = new Player(splittedLine[0], Integer.parseInt(splittedLine[1]),
						Integer.parseInt(splittedLine[2]));
				// creates new object for player
				players.add(p);
				// add the input into the array list
			}

		}

	}
	
	
	}
	


