package org.ct_TestPackage;

import java.io.IOException;
import java.util.ArrayList;

import org.ct_pompackage.HomePage;
import org.ct_pompackage.PGSHomePagePom;
import org.ct_utilitiesPackage.FetchDataFromExcel;
import org.ct_utilitiesPackage.ScreenShotCode;
import org.ct_utilitiesPackage.ScrollingPageCode;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;

public class TestClass01 extends BaseClass {
	
	HomePage hm;
	PGSHomePagePom pm;
	
	public TestClass01()
	{
		super();
	}
	
	@Test(priority=1)
	public void homepagetest() throws InterruptedException
	{
		hm=new HomePage(driver);
		hm.clickontoolsicon();
		Thread.sleep(3000);
		hm.clickonpgssicon();	
	}
	
	@Test(priority=2)
	public void hristest() throws InterruptedException
	{
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(win);
		driver.switchTo().window(win.get(1));
		pm=new PGSHomePagePom();
		pm.hrisaction();
		pm.clickonemployeedetails();
		Assert.assertEquals(pm.capturewindowID(), "CentriCT");
		Thread.sleep(3000);
		
	}
	
	@Test(priority=3)
	public void handledropdown() throws InterruptedException, IOException
	{
		
		pm.ClickOnTravelTab();
		
	/*	pm.selectcountry(1);
		pm.selecttypeoftravel(1);
		pm.selectnooftrips(1);
		pm.selecttsd(1);
		pm.remarkbox();
		pm.ClickOnAddBtn();
		
		Thread.sleep(4000);
		pm.selectcountry(2);
		pm.selecttypeoftravel(2);
		pm.selectnooftrips(2);
		pm.selecttsd(2);
		pm.remarkbox();
		pm.ClickOnAddBtn();
	
		Thread.sleep(4000);
		pm.selectcountry(4);
		pm.selecttypeoftravel(4);
		pm.selectnooftrips(1);
		pm.selecttsd(3);
		pm.remarkbox();
		pm.ClickOnAddBtn();
		
		
		ScrollingPageCode.scrollpagedown(0,400);
		Thread.sleep(3000);
		ScreenShotCode.screenshotmethod(driver, "sc of 3 values");
		Thread.sleep(3000);
	*/
		
	for(int i=1;i<=3;i++)
	{
		for(int j=0;j<=3;j++)
		{
			Thread.sleep(3000);
			pm.selectcountry(FetchDataFromExcel.para(i, 0));
			pm.selecttypeoftravel(FetchDataFromExcel.para(i, 1));
			pm.selectnooftrips(FetchDataFromExcel.para(i, 2));
			pm.selecttsd(FetchDataFromExcel.para(i, 3));
			pm.remarkbox();
			pm.ClickOnAddBtn();
			Thread.sleep(2000);
			break;
		}
			
	}
	Thread.sleep(3000);
	ScrollingPageCode.scrollpagedown(0,400);
	ScreenShotCode.screenshotmethod(driver, "sc of 3 values");
	}
	
	@Test(priority=4)
	public void ClickOnRemoveIconMethodTest() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		pm.ClickOnRemoveicon();
		Alert a= driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		ScreenShotCode.screenshotmethod(driver, "sc of 2 values");
			
	}
	
	
	
	
}
