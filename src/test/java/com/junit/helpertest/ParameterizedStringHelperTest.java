package com.junit.helpertest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junit.helper.StringHelper;

@RunWith(Parameterized.class)
public class ParameterizedStringHelperTest {
	

	StringHelper helper=new StringHelper();
	
	private String input;
	private String expectedoutput;
	
	
	

	public ParameterizedStringHelperTest(String input, String expectedoutput) {
		super();
		this.input = input;
		this.expectedoutput = expectedoutput;
	}
	/*@Test
	public void test() {
		//fail("Not yet implemented");
		//assertEquals("ABC", "ABCD");
		//it fails the test and gives the following error
		//org.junit.ComparisonFailure: expected:<ABC[]> but was:<ABC[D]>
		assertEquals("ABC", "ABC");
		//this is the success case
	}*/
	
	@Parameters
	public static Collection<String[]> testConditions()
	{
		String expetedOutputs[][]={
				{"AACD", "CD"},
				{"ACD", "CD"},
		};
		return Arrays.asList(expetedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions()
	{
		assertEquals(expectedoutput, helper.truncateAInFirst2Positions(input));
	}
	
	/*@Test
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
*/

}
