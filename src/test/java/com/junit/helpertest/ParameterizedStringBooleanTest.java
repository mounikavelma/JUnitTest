package com.junit.helpertest;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.junit.helper.StringHelper;

@RunWith(Parameterized.class)
public class ParameterizedStringBooleanTest {
	
	StringHelper helper=new StringHelper();
	
	private String input;
	private String expectedoutput;
	
	public ParameterizedStringBooleanTest(String input, String expectedoutput) {
		super();
		this.input = input;
		this.expectedoutput = expectedoutput;
	}
	
	public static Collection<boolean[]> testString()
	{
		String expetedOutput[][]={
				{"ABAB",""},{}
		};
		return null;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
