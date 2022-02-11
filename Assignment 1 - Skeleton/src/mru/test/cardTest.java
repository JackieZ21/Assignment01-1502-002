package mru.test;
import static org.junit.Assert.*;

import org.junit.Test;

import mru.game.controller.Card;
import mru.game.controller.CardDeck;

public class cardTest {
/**
 * this test is for the rank
 */
	@Test
	public void setRankTest() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		currentCard.setRank(1);
		int playCard= currentCard.getRank();	
		
		assertEquals(playCard, 1);
	}
	
	/**
	 * this test is for get suit 
	 */
	@Test
	public void getsuitTest() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);	
		currentCard.setRank(1);
		currentCard.setSuit("Diamond");
		String suitTest="Diamond";
		assertEquals(currentCard.getSuit(), suitTest);
	}
	/**
	 * this test is for getting a card
	 */
	@Test
	public void newCard() {
		CardDeck myDeck= new CardDeck();
		Card currentCard = myDeck.getDeck().remove(2);		
		currentCard.setRank(1);
		int playCard= currentCard.getRank();	
		assertEquals(playCard, playCard);
	}
	

}
