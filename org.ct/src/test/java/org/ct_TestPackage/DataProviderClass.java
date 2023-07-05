package org.ct_TestPackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	
	
	
	@DataProvider(name="mydata")
	public static String[][] datamethod()
	{
		String data[][]= {{"pune","pune1"},{"mumbai","mumbai1"},{"satara","satara1"}};
		return data;
	}
}
