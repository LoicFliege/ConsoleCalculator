package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator testee;

	@Test
	public void testSummeZweiPositivIsOk() {
		testee = new Calculator();
		assertTrue(testee.adition(10, 25) == 35);
	}
	@Test
	public void testSummeZweiNegativIsOk() {
		testee = new Calculator();
		assertTrue(testee.adition(-10, -20) == -30);;
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraction(25,10) == 15);
	}

	@Test
	public void testSubtractionZweiNegativIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraction(25, -10) == 35);
	}

}
