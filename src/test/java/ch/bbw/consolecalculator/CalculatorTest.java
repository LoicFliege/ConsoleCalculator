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

}
