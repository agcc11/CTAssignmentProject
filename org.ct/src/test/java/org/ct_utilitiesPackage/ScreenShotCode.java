package org.ct_utilitiesPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import basepackage.BaseClass;

public class ScreenShotCode extends BaseClass {

	
	
	public static String timestamp()
	{
		String t=new SimpleDateFormat("MM dd HH.mm.ss").format(Calendar.getInstance().getTime());
		return t;
	}
	
	public static void screenshotmethod(WebDriver driver, String Filename) throws IOException
	{
		File s= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File(".//Screenshots/"+Filename+timestamp()+".jpg");
		FileUtils.copyFile(s, d);
	}
}
