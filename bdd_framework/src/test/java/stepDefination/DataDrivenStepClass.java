package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pompack.DataDrivenPomClass;

public class DataDrivenStepClass {

	public WebDriver driver;
	public DataDrivenPomClass obj;
	
	@Given("user is on login page of app")
	public void user_is_on_login_page_of_app() {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		 ChromeOptions op=new ChromeOptions();
		 op.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(op);	
		 driver.get("https://parabank.parasoft.com/parabank/index.htm");
		 obj=new DataDrivenPomClass(driver);
	}

	@When("user valid login page of app")
	public void user_valid_login_page_of_app() {
		
		String actualtitle=driver.getTitle();
	   String expectedtitle="ParaBank | Welcome | Online Banking";
	   Assert.assertEquals(actualtitle, expectedtitle);
	   System.out.println("user is on correct page");
	}
	@Then("user enter Username as {string} and Password as {string}")
	public void user_enter_username_as_and_password_as(String username, String password) {
		obj.EnterUsername(username);
		obj.EnterPassword(password);
	    System.out.println("username and password is entered");
	}

	@Then("user click on login btn")
	public void user_click_on_login_btn() {
		obj.ClickOnLoginBtn();
	}
	
	@When("user enter valid user name and valid password")
	public void user_enter_valid_user_name_and_valid_password(DataTable dataTable) {
	    
		for(Map<String,String> data:dataTable.asMaps(String.class,String.class))
		{
		driver.findElement(By.name("username")).sendKeys(data.get("Username"));
		driver.findElement(By.name("password")).sendKeys(data.get("Password"));
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		}
	}




}
