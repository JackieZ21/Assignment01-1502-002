import static org.junit.Assert.*;

import org.junit.Test;

import mru.game.model.Player;

public class playerTest {
/**
 * this test is for the name
 */
	@Test
	public void getNameTest() {
		Player p=new Player(null, 0, 0);
		p.setName("jeff");
		assertEquals(p.getName(), "jeff");
	}
	/**
	 * this test is for the balance 
	 */
	@Test
	public void getBalanceTest() {
		Player p=new Player(null, 0, 0);
		p.setBalance(100);
		assertEquals(p.getBalance(), 100);
	}
	/**
	 * this test is for the number of wins 
	 */
	@Test
	public void getWinstest() {
		Player p=new Player(null, 0, 0);
		p.setNumOfWins(10);
		assertEquals(p.getNumOfWins(), 10);
	}
	/**
	 * this test is for formatting
	 */
	@Test
	public void formatTest() {
		Player p=new Player("jake", 120, 2);
		p.format();
		assertEquals(p.format(),p.format());
	}
}
