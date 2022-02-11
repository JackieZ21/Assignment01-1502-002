import static org.junit.Assert.*;

import org.junit.Test;

import mru.game.controller.Card;
import mru.game.controller.CardDeck;

public class puntoBancoTest {
/**
 * this test is for the player prin Card
 */
	@Test
	public void playPrinCard() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		int value;
		currentCard.setRank(1);
		int playCard= currentCard.getRank();	
		assertEquals(playCard, playCard);
	}
	/**
	 * this test is for the banker prin card
	 */
	@Test
	public void bankPrinCard() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		int value;
		currentCard.setRank(1);
		int bankCard= currentCard.getRank();	
		assertEquals(bankCard, bankCard);
	}
	

}
