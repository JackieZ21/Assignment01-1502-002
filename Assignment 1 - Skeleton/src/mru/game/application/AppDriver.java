package mru.game.application;

import mru.game.controller.GameManager;
import mru.game.controller.PuntoBancoGame;// take it out just for testing 
/**
 * this class contain main method 
 * feb 10, 2022.
 * @author obaida Daoud
 * @author Jackie Zheng
 *  @version 1.0
 */
public class AppDriver {
/**
 * main method to run the code
 * @param args
 * @throws Exception
 *
 */
	public static void main(String[] args) throws Exception {

		// This is the starting point of the project!
		//hint - It usually calls method from GameManager class to start the app, so
		// only one or two lines will be written here
		 new GameManager();
		// PuntoBancoGame game= new PuntoBancoGame();
		 //game.cards(0, 0);
		 
	}

}
