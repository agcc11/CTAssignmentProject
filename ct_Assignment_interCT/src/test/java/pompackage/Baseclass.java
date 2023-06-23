package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilitiesPackage.ReadConfig;

public class Baseclass {

	
	ReadConfig rr=new ReadConfig();
	public static WebDriver driver;
	public String url=rr.geturl();
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+rr.getchromepath());
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+rr.getedgepath());
			driver=new EdgeDriver();
		}
	}
	
	/*@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	*/
}
