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
		driver.get("https://www.aarpmedicareplans.com/");
		Set<Cookie>cs=driver.manage().getCookies();
		System.out.println(cs.size());
		
		for(Cookie cookies:cs)
		{
			System.out.println("cokkie name:" +cookies.getName()+" "+ "cokkie value:" +cookies.getValue());
		}
		
			
		
		
	
	
	
	
	}
}


