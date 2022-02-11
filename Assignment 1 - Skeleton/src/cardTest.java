import static org.junit.Assert.*;

import org.junit.Test;

import mru.game.controller.Card;
import mru.game.controller.CardDeck;
import mru.game.model.Player;

public class cardTest {
/**
 * this test is for card rank
 */
	@Test
	public void getRankTest() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		currentCard.setRank(1);
		int playCard= currentCard.getRank();	
		assertEquals(playCard, playCard);
	}
	/**
	 * this test is for the card suit 
	 */
	@Test
	public void getsuitTest() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		String testSuite="diamond";
		currentCard.setSuit(testSuite);
		String playCard= currentCard.getSuit();	
		assertEquals(playCard, testSuite);
	}
	
	/**
	 * this test is for the toString method
	 */
	@Test
    void testToStringPlayer() {
        Player obj2 = new Player("Name", 10, 10);
        assertEquals(obj2.toString(), "Name: NameBalance: 10Number of wins: 10");
    }
	
	
	
		
	
	
	

}
