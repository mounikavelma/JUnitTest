package com.junit.helpertest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.helper.StringHelper;

public class StringHelperTest {
	
	StringHelper helper=new StringHelper();

	/*@Test
	public void test() {
		//fail("Not yet implemented");
		//assertEquals("ABC", "ABCD");
		//it fails the test and gives the following error
		//org.junit.ComparisonFailure: expected:<ABC[]> but was:<ABC[D]>
		assertEquals("ABC", "ABC");
		//this is the success case
	}*/
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions()
	{
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinLast2Positions()
	{
		assertEquals("CDA", helper.truncateAInFirst2Positions("CDA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_SpecialPositiveScenario()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
		
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_SpecialNegativeScenario()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
		
	}

}
