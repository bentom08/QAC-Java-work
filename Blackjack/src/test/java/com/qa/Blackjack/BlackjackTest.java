package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest {

	@Test
	public void testBlackjack() {
		assertEquals(0, Runner.playBlackjack(22, 22));
		assertEquals(10, Runner.playBlackjack(10, 22));
		assertEquals(5, Runner.playBlackjack(22, 5));
		assertEquals(7, Runner.playBlackjack(7, 2));
		assertEquals(17, Runner.playBlackjack(11, 17));
	}
}
