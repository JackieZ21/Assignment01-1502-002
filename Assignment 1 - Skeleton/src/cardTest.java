import static org.junit.Assert.*;

import org.junit.Test;

import mru.game.controller.Card;
import mru.game.controller.CardDeck;

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
	public void toStringTest() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);	
		currentCard.setRank(12);
		String testSuite="Diamond";
		String playCard=currentCard.toString();	
		currentCard.setSuit(testSuite);
		assertEquals(playCard, testSuite);
		
	}
	
	
	
		
	
	
	

}
