package com.qa.amsterdamString;

import static org.junit.Assert.*;

public class Test {


	@Test
	public void amISearchTest() {
		assertEquals(1, Runner.amFinder("Am I in Amsterdam"));
		assertEquals(2, Runner.amFinder("I am in Amsterdam am I?"));
		assertEquals(0, Runner.amFinder("I have been in Amsterdam"));
		assertEquals(5, Runner.amFinder("am am am amamam am am amuyg"));
		
	}
}
