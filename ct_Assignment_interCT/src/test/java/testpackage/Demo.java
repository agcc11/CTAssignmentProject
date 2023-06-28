package testpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.WatchManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class Demo implements ITestListener{
	
	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe/");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rr=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int cc=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println(rr);
		System.out.println(cc);
		Thread.sleep(3000);
		boolean r=false;
		for(int i=1;i<rr;i++)
		{
			for(int j=1;j<=cc;j++)
			{
				String te=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				if(te.equals("Roland Mendel"))
				{
					r=true;
					break;
				}
			}
		}

		if(r)
			System.out.println("present");
			
		else
			System.out.println("not present");
			
		
		
	
	
	
	
	}
}


