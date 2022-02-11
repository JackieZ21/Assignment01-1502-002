package mru.game.controller;
import mru.game.model.Player;
import mru.game.view.GameMenu;
/**
 * feb 10, 2022.
 * @author obaida Daoud
 * @author Jackie Zheng
 * @version 1.0
 */
public class PuntoBancoGame {
	
	/**
	 * In this class you implement the game
	 * You should use CardDeck class here
	 * See the instructions for the game rules
	 */
	GameMenu gm;//Game Menu initial
	CardDeck cd;//Card Deck initial
	public int playerTotal=0;// player Total variable initial
	public int bankTotal=0;//  bank Total variable initial
	Player pl;
	public int balance;
	/**
	 * PuntoBancoGame constructor instantiate the game Menu
	 * and the launch Game
	 */
	public PuntoBancoGame() {
		pl = new Player(null, balance,0);		
		gm=new GameMenu();
		launchTGame();
		
	}
	
	/**
	 * method to validate bets 
	 * @return amount Bet
	 */
	public boolean launchTGame() {
		char betPBT;
		int betAmount;
		boolean win=false;
		
		 betPBT=gm.showGameMenu();
		 betAmount=gm.setBets();
		 cards(bankTotal, bankTotal);
		winner(bankTotal, playerTotal, balance);
		return win;
	}
/**
 * method prints player's card 
 * convert cards to modulo
 *  add it to player Total 
 * @return player Total
 */
	public int PlayPrinCard() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		System.out.printf("%-20s",currentCard);
		int playCard= currentCard.getRank();	
		int modCard=playCard%10;// Rank to modulo 10 
		playerTotal+=modCard; // add the modulo card to total
		//System.out.print(playerTotal);	
		return playerTotal;
		}
	
	/**
	 * method prints banker card 
	 * convert cards to modulo
	 *  add it to banker Total 
	 * @return banker Total
	 */
	public int BankPrinCard() {
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		System.out.printf("%-20s",currentCard);	
		int playCard=currentCard.getRank();
		int modCard=playCard%10;// Rank to mod 10 
		bankTotal+=modCard;
	//	System.out.print(bankTotal);	
		return bankTotal;
	}	

	/**
	 * method contain the rules of the game 
	 * @param playerTotal input total for player cards 
	 * @param bankTotalinput total for banker cards
	 */
		public void cards(int playerTotal, int bankTotal) {
			String Bank="Bank";
			String Player="Player";
			String bankWins ="Bank wins";
			String playerWins="player wins";
			
		System.out.printf("%-20s", Player);	
		System.out.printf("%-20s", Bank);	
		System.out.println();

		PlayPrinCard();//print card for player  
		BankPrinCard();//print card for player  
		System.out.println();	
		PlayPrinCard();	//print card for player  
		BankPrinCard();//print card for player  
	
	
	if(bankTotal==8 || playerTotal== 8||bankTotal==9 || playerTotal == 8){	// 
		
		if(bankTotal > playerTotal) { // bank wins
			System.out.println();
			System.out.print("\t");
				for(int i=0; i< 25;i++){
					System.out.print("$");	
				}
				System.out.println();
				for(int i=0; i<= 2;i++){
					System.out.print("\t$\t");	
					while(i==0) {
						System.out.print(bankWins); // print bet amount !!
						i+=1;
					}
				}
				System.out.println();
				System.out.print("\t");
				for(int i=0; i< 25;i++){
					System.out.print("$");	
				}			
		}
	
		if(playerTotal>bankTotal){ // player win 
			System.out.println();
			System.out.print("\t");
			for(int i=0; i< 25;i++){
				System.out.print("$");	
			}
			System.out.println();
			for(int i=0; i<= 2;i++){
				System.out.print("\t$\t");	
				while(i==0) {
					System.out.print(playerWins);// print bet amount !!
					i+=1;
				}
			}
			System.out.println();
			System.out.print("\t");
			for(int i=0; i< 25;i++){
				System.out.print("$");	
			}
		}
		if(playerTotal==bankTotal){ //tie
			System.out.println();
			System.out.print("\t");
			for(int i=0; i< 25;i++){
				System.out.print("$");	
			}
			System.out.println();
			for(int i=0; i<= 2;i++){
				System.out.print("\t$\t");	
				while(i==0) {
					System.out.print(playerWins);// print bet amount !!
					i+=1;
				}
			}
			System.out.println();
			System.out.print("\t");
			for(int i=0; i< 25;i++){
				System.out.print("$");	
			}	
		}
	}else if(playerTotal>=0 && playerTotal<=5){ //player gets 3rd card 
		System.out.println();	
		PlayPrinCard();//print card for player  
		
	}
	
	//
	CardDeck myDeck= new CardDeck();
	Card currentCard =  myDeck.getDeck().remove(0);	
	int modCard=currentCard.getRank();
	int playCard=modCard%10;// Rank to mod 10 
	playerTotal+=playCard;
	
	if(playCard>5 && playCard<8 ){ 
		if(bankTotal >=0 && bankTotal <=5) {//bank gets 3rd card 
			BankPrinCard();// print card for bank
		}else if(bankTotal==6||bankTotal==7) {// bank stand
			//Add empty outline if there is time 
		}	
	}else if(playCard==2||playCard==3){
		if(bankTotal >=0 && bankTotal <=4) {//bank gets 3rd card 
			BankPrinCard();// print card for bank
			}else if(bankTotal>=5||bankTotal<=7) {// bank stand
				//Add empty outline if there is time 
			}	
	}

		else if(playCard==4||playCard==5){
			if(bankTotal >=0 && bankTotal <=5) {//bank gets 3rd card 
				BankPrinCard();// print card for bank
				}else if(bankTotal>=6 ||bankTotal<=7) {// bank stand
					//Add empty outline if there is time 
				}	
		}

		else if(playCard==6||playCard==7){
			if(bankTotal >=0 && bankTotal <=6) {//bank gets 3rd card 
				BankPrinCard();// print card for bank
				}else if(bankTotal==7) {// bank stand
					//Add empty outline if there is time 
				}	
		}
		else if(playCard==8){
			if(bankTotal >=0 && bankTotal <=2) {//bank gets 3rd card 
				BankPrinCard();// print card for bank
				}else if(bankTotal>=3||bankTotal<=7) {// bank stand
					//Add empty outline if there is time 
				}	
		}

		else if(playCard==0||playCard==1||playCard==9){
			if(bankTotal >=0 && bankTotal <=3) {//bank gets 3rd card 
				BankPrinCard();// print card for bank	
				}else if(bankTotal>=4||bankTotal<=7) {// bank stand
					//Add empty outline if there is time 
				}
		}
	System.out.println();
	System.out.print("playerTotal:");
	System.out.print(playerTotal);
	System.out.print("BankTotal:");	
	System.out.print(bankTotal);
	System.out.println();
	winner( bankTotal,  playerTotal, balance);
	
}
	/**
	 * method determine winner, print it to screen and add/subtract money to balance.
	 * @param bankTotal
	 * @param playerTotal
	 * @param balance
	 */
public void winner(int bankTotal, int playerTotal,int balance) {
	balance = pl.getBalance();
	 int betAmount = gm.getBets();
	char choicePBT =gm.showGameMenu();
	if(choicePBT=='p'&&choicePBT=='P') {
	 if(playerTotal>bankTotal) {
		System.out.println("Player wins"+ betAmount);
		balance+=betAmount;
	}else 	if(playerTotal<bankTotal) {
		System.out.println("Player lost"+ betAmount);
		balance-=betAmount;
	}}
	
	if(choicePBT=='b'&&choicePBT=='B') {
		 if(playerTotal<bankTotal) {
			System.out.println("banker wins"+ betAmount);
			balance+=betAmount;
		}else 	if(playerTotal>bankTotal) {
			System.out.println("banker lost"+ betAmount);
			balance-=betAmount;
		}}
	if(choicePBT=='t'&&choicePBT=='T') {
		 if(playerTotal==bankTotal) {
			System.out.println("Tie "+ betAmount);
		
		 }}
	

		}
		
	
}
