package org.ct_utilitiesPackage;

import org.openqa.selenium.JavascriptExecutor;

import basepackage.BaseClass;

public class ScrollingPageCode extends BaseClass {

	public static void scrollpagedown(long a,long b)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+a+","+b+")");
	}
	
}
