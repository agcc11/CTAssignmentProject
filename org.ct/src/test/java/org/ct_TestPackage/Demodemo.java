package org.ct_TestPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demodemo {
	
	
	@Test(dataProvider="mydata",dataProviderClass=DataProviderClass.class)
	public void dataprovidertest(String un,String pass)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.odoo.com/web/login");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);

		
		
	}
	
	

//	public static void main(String[] args) throws InterruptedException {
		
		
//		System.setProperty("webdriver.edge.driver",".//Drivers/msedgedriver.exe/");
//		WebDriver driver=new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://www.makemytrip.com/");
//		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
//		WebElement from=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
//		from.sendKeys("pune");
//		Thread.sleep(3000);
//		List<WebElement>a=driver.findElements(By.xpath("//ul[@role='listbox']//child::li"));
//		System.out.println(a.size());
//		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
//		for(int i=0;i<a.size();i++)
//		{
//			String s=a.get(i).getText();
//			if(s.contains("Pune"))
//			{
//				a.get(i).click();
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//a[text()='Search']")).click();
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();
//		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//		List<WebElement>aa=driver.findElements(By.xpath("//div[@class='textRight flexOne']//p"));
//		
//		ArrayList t=new ArrayList();
//		ArrayList p=new ArrayList();
//		
//		for(int i=0;i<aa.size();i++)
//		{
//			
//		}
//		
//		Collections.sort(p);
//		
//		if(p.equals(t))
//		{
//			System.out.println("sorted");
//		}
//		else
//			System.out.println("not sorted");
//		
		
		
	
	

}
