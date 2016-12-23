package com.calc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	Addition add = null;
	@Before
	public void before() {
		
		add=new Addition();
		
	}
	
	@Test
	public void testNotNull() {
		
		assertNotNull(add);
	}
	
	@Test
	public void testSumOfTwoNum_success() {
		
		int result = add.sumOfTwoNum(2, 3);
		
		assertEquals(5, result);
		
	}

	@Test
	public void testSumOfTwoNum_fail() {
		
		int result = add.sumOfTwoNum(2, 3);
		
		assertNotEquals(6, result);
	}
	
	
}
