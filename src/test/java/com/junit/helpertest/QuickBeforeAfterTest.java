package com.junit.helpertest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	//@BeforeClass and @AfterClass should be static methods 
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("before class");
	}
	
	
	@Before
	public void setup()
	{
		System.out.println("before test");
	}
	
	@Test
	public void test1() {
		//fail("Not yet implemented");
		System.out.println("test1 executed");
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		System.out.println("test2 executed");
	}
	
	@After
	public void teardown()
	{
		System.out.println("after test");
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("after class");
	}


}
