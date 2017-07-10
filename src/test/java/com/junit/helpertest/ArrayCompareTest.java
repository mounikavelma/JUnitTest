package com.junit.helpertest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArrayssort() {
		//fail("Not yet implemented");
		
		int [] numbers={12,3,4,1};
		int [] expected={1,3,4,12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArrayException()
	{
		int [] numbers=null;
		Arrays.sort(numbers);
		//this throws nullpointerexception which is expected 
		//in general when we are expecting the exception we will write it in try catch block
		//here we used test body 
		//@Test(expected=NullPointerException)
		//it expects the exception in case if it doesn't get the expected exception then it throws error.
	}
	
	@Test(timeout=50)
	public void testArrayPerformance()
	{
		int array[]={12,3,23};
		for(int i=0;i<=1000000;i++)
		{
			array[0]=i;
			Arrays.sort(array);
		}
	}

}
