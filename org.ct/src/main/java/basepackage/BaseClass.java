package basepackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	
	
	public static WebDriver driver;
	public static Properties pro;
	
	@BeforeClass
	@Parameters("browser")
	public void openbrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(pro.getProperty("url"));
			
		}
		
		
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
			EdgeOptions op = new EdgeOptions();
			op.addArguments("--remote-allow-origins=*");
			driver=new EdgeDriver(op);
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(pro.getProperty("url"));
	
		}
	}
	
	/*@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	*/
	public BaseClass()
	{
		try
		{
			pro=new Properties();
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//configuration//Properties");
			pro.load(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//url=https://onlinect.sharepoint.com/sites/interct/Pages/Home.aspx
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
}
