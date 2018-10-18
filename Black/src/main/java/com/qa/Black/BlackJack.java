package com.qa.Black;

public class BlackJack {
	
	public static void main(String[] args) {
		
		
		
	}
	
	public int cardSelect(int card1, int card2) {
		
		if (card1 <= 21 && card2 <= 21) {
			if (card1 == card2) {
				return card1;
			}
			if (card1 > card2) {
				return card1;					
			}
			
			else return card2;
			
		} 
		if (card1 > 21 && card2 > 21) {
			return 0;
		
		} else if (card1 < 21) {
			return card1;
		}
		
					
		 else return card2;
				
	}

}
