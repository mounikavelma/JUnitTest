package com.junit.helpertest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ParameterizedStringHelperTest.class, StringHelperTest.class })
public class AllTests {

}
