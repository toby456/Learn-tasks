package com.qa.Black;
import static org.junit.Assert.*;

import org.junit.Test;



public class Tests {
	
	@Test
	public void test() {
	
	BlackJack blackjack = new BlackJack();
	
	assertEquals(10, blackjack.cardSelect(10, 5));
	assertEquals(10, blackjack.cardSelect(10, 23));
	assertEquals(0, blackjack.cardSelect(23,23));
	assertEquals(10, blackjack.cardSelect(7, 10));
	assertEquals(0, blackjack.cardSelect(22, 22));
	assertEquals(21, blackjack.cardSelect(23, 21));
	assertEquals(21, blackjack.cardSelect(21, 21));
	
	
	
	
	}
}
