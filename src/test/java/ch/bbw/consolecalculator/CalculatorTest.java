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
	public void testSummeEinPositivEinNegativIsOk() {
		assertTrue(testee.adition(-10, 20) == 10);
	}
	@Test
	public void testSummeHoechsterIntegerWertPlusEinsIsOk() {
		assertTrue(testee.adition(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
	}
	@Test
	public void testSummeNullPlusPositiverWertIsOk() {
		assertTrue(testee.adition(0, 5) == 5);
	}
	@Test
	public void testSummeNullPlusNegativerWertIsOk() {
		assertTrue(testee.adition(0, -5) == -5);
	}
	@Test
	public void testSummeZweiNullIsOk() {
		assertTrue(testee.adition(0, 0) == 0);
	}
	@Test(expected = AssertionError.class)
	public void testSummeZweiMaxIntegerIsNOk() {
		assertTrue(testee.adition(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
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
