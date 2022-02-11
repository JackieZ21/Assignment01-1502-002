import static org.junit.Assert.*;

import org.junit.Test;

import mru.game.controller.Card;
import mru.game.controller.CardDeck;
import mru.game.controller.PuntoBancoGame;

public class puntoBancoTest {
/**
 * this test is for the prin card method
 */
	@Test
	public void playPrinCard() {
		PuntoBancoGame pbg=new PuntoBancoGame();
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		currentCard.setRank(1);
		int p=pbg.PlayPrinCard();
		int playCard= currentCard.getRank();	
		assertEquals(playCard, p);
	}
	/**
	 * this test is for the bank card
	 */
	@Test
	public void bankPrinCard() {
		PuntoBancoGame pbg=new PuntoBancoGame();
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		currentCard.setRank(1);
		int p=pbg.BankPrinCard();
		int bankCard= currentCard.getRank();	
		assertEquals(bankCard, p);
	}
	
	
	@Test
	public void cardBuncoTest() {
		PuntoBancoGame pbg=new PuntoBancoGame();
		pbg.cards(4, 5);
		assertSame(pbg, pbg);
	}
	

}
