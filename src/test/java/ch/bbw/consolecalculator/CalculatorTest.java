package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator testee;
	
	@Before
	public void setupCalculator() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositivIsOk() {
		assertTrue(testee.adition(10, 25) == 35);
	}
	@Test
	public void testSummeZweiNegativIsOk() {
		assertTrue(testee.adition(-10, -20) == -30);;
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraction(25,10) == 15);
	}

	@Test
	public void testSubtractionZweiNegativIsOk() {
		assertTrue(testee.subtraction(25, -10) == 35);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivisonThroughZeroArithmeticException() {
		assertTrue(testee.division(5,0) == 0);
	}
	@Test
	public void testDivisonZweiPositivIsOk() {
		assertTrue(testee.division(25, 5) == 5);
	}
	
	@Test
	public void testMultiplicationZweiPositivIsOk() {
		assertTrue(testee.multiplication(5, 5) == 25);
	}

}
