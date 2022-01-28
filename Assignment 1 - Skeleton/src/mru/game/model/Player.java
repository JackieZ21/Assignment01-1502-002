package mru.game.model;

public class Player {
	
	/**
	 * This class represent each player record in the Database
	 * It is basically a model class for each record in the txt file
	 */
	String name;
	String id;
	int numOfWins;
	
	public Player(String name,String id, int numOfWins) {
		this.name=name;;
		this.id=id;
		this.numOfWins=numOfWins;
		
	}
	/**
	 * this method sets the name for the player 
	 * @param name
	 */
	public void setName(String name) {
		this.name=name;
		//takes the most local variable name and saves it into name
	}
	/**
	 * this method returns the name of the player
	 * @return name
	 */
	public String getName() {
		return name;
		//return the player name
	}
	/**
	 * this method sets the player id number in
	 * @param id
	 */
	public void setId(String id) {
		this.id=id;
		//takes the most local variable of id and saves it into id 
	}
	/**
	 * this method returns the player id number
	 * @return id number 
	 */
	public String getId() {
		return id;
		//return id number
		
	}
	/**
	 * this method set the number of wins in the variable
	 * @param numOfWins
	 */
	public void setNumOfWins(int numOfWins) {
		this.numOfWins=numOfWins;
		//set the most local variable of numOfWins in the numOfWins
	}
	/**
	 * this method returns the number of wins the player has
	 * @return number of wins
	 */
	public int getNumOfWins() {
		return numOfWins;
		//return the number of wins for the corresponding player
	}
	/**
	 * this method returns the players informations such as name id and number of wins
	 */
	public String toString() {
		return "Name: "+name+"ID: "+ id+ "Number of Wins: "+ numOfWins;
		//returns the players information that they currently have saved Name,ID and number of wins
	}
}
