package mru.game.controller;

import mru.game.view.GameMenu;

public class PuntoBancoGame {
	
	/**
	 * In this class you implement the game
	 * You should use CardDeck class here
	 * See the instructions for the game rules
	 */
	GameMenu gm;
	CardDeck cd;
	public PuntoBancoGame() {
		gm=new GameMenu();
		launchTGame();
	}
	
	
	public boolean launchTGame() {
		String betPBT;
		int betAmount;
		boolean win=false;
		
		 betPBT=gm.showGameMenu();
		 betAmount=gm.setBets();
		 
		return win;
	}

	public int PlayPrinCard() {
		int playerTotal=0;
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		System.out.printf("%-20s",currentCard);	
		int playCard=currentCard.getRank();
		int modCard=playCard%10;// Rank to mod 10 
		playerTotal+=modCard;
		//System.out.println(playerTotal);	
		return playerTotal;
	}	
	public int BankPrinCard() {
		int bankTotal=0;
		CardDeck myDeck= new CardDeck();
		Card currentCard =  myDeck.getDeck().remove(0);		
		System.out.printf("%-20s",currentCard);	
		int playCard=currentCard.getRank();
		int modCard=playCard%10;// Rank to mod 10 
		bankTotal+=modCard;
		//System.out.println(bankTotal);	
		return bankTotal;
	}	
/**	
	public int AddPlayCards(int playCard) {
		int CardValue= playCard;
		int playerTotal=0;
		playerTotal+=CardValue;
		return playerTotal;
	}
	
	public int AddBankCards(int playCard) {
		int CardValue= playCard;
		int bankTotal=0;
		bankTotal+=CardValue;
		return bankTotal;
	}*/
	
		public void cards(int playerTotal, int bankTotal) {
			
			String Bank="Bank";
			String Player="Player";
			String bankWins ="Bank wins";
			String playerWins="player wins";
			
			
		
		
		System.out.printf("%-20s", Player);	
		System.out.printf("%-20s", Bank);	
		System.out.println();

		PlayPrinCard();
		BankPrinCard();
		System.out.println();	
		PlayPrinCard();	
		BankPrinCard();
	
	
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
		PlayPrinCard();
		System.out.println();	
	}
	CardDeck myDeck= new CardDeck();
	Card currentCard =  myDeck.getDeck().remove(0);		
	int playCard =currentCard.getRank();
	 if(playCard>5 && playCard<8 ){ 
		if(bankTotal >=0 && bankTotal <=5) {//bank gets 3rd card 
		currentCard =  myDeck.getDeck().remove(0);
		 System.out.printf("%-20s",currentCard);	
		}else if(bankTotal==6||bankTotal==7) {// bank stand
			//Add empty outline if there is time 
		}	
	}else if(playCard==2||playCard==3){
		if(bankTotal >=0 && bankTotal <=4) {//bank gets 3rd card 
			currentCard =  myDeck.getDeck().remove(0);
			 System.out.printf("%-20s",currentCard);	
			}else if(bankTotal>=5||bankTotal<=7) {// bank stand
				//Add empty outline if there is time 
			}	
	}

		else if(playCard==4||playCard==5){
			if(bankTotal >=0 && bankTotal <=5) {//bank gets 3rd card 
				currentCard =  myDeck.getDeck().remove(0);
				 System.out.printf("%-20s",currentCard);	
				}else if(bankTotal>=6 ||bankTotal<=7) {// bank stand
					//Add empty outline if there is time 
				}	
		}

		else if(playCard==6||playCard==7){
			if(bankTotal >=0 && bankTotal <=6) {//bank gets 3rd card 
				currentCard =  myDeck.getDeck().remove(0);
				 System.out.printf("%-20s",currentCard);	
				}else if(bankTotal==7) {// bank stand
					//Add empty outline if there is time 
				}	
		}
		else if(playCard==8){
			if(bankTotal >=0 && bankTotal <=2) {//bank gets 3rd card 
				currentCard =  myDeck.getDeck().remove(0);
				 System.out.printf("%-20s",currentCard);	
				}else if(bankTotal>=3||bankTotal<=7) {// bank stand
					//Add empty outline if there is time 
				}	
		}

		else if(playCard==0||playCard==1||playCard==9){
			if(bankTotal >=0 && bankTotal <=3) {//bank gets 3rd card 
				currentCard =  myDeck.getDeck().remove(0);
				 System.out.printf("%-20s",currentCard);	
				}else if(bankTotal>=4||bankTotal<=7) {// bank stand
					//Add empty outline if there is time 
				}
		}

	
	

		}
		
	
}
