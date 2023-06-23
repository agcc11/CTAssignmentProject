package stepDefination;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import pompack.CtAssignmentpom;
import pompack.CtAssignmentpom2;
import utilspackage.FetchDataCode;
import utilspackage.ScreenShotCode;

public class CtStepclass {

	public WebDriver driver;
	public CtAssignmentpom ctp;
	public CtAssignmentpom2 ctp2;
	
	@Given("open the edge browser")
	public void open_the_edge_browser() {
	   
	  System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers/msedgedriver.exe");
		driver=new EdgeDriver();
		ctp=new CtAssignmentpom(driver);
	    ctp2=new CtAssignmentpom2(driver);
		
	}

	@When("user open the url {string}")
	public void user_open_the_url(String string) {
	   
	driver.get("https://onlinect.sharepoint.com/sites/interct/Pages/Home.aspx");
	}

	@Then("user click on Tools icon")
	public void user_click_on_tools_icon() {
	  
		ctp.clickontoolsicon();
	}

	@Then("user click on PGS icon")
	public void user_click_on_pgs_icon() {
	  
		ctp.clickonpgssicon();
		System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(),"CitiusTech - Home Page");
	}

	//open employee details
	
	
	@Given("switch focus from main to new open window")
	public void switch_focus_from_main_to_new_open_window() {
	  
		ArrayList<String> alladd=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(alladd.get(1));
		
	}

	@When("click on HRIS Tab")
	public void click_on_hris_tab() {
	 
	  ctp2.hrisaction(driver);
		
	}

	@Then("click on employee details tab")
	public void click_on_employee_details_tab() {
	   ctp2.clickonemployeedetails();
	
	}

	@Then("capture window id")
	public void capture_window_id() {
	   ctp2.capturewindowID();
		
	}


	@Given("click on tavel tab")
	public void click_on_tavel_tab() {
	   
		ctp2.ClickOnTravelTab();
	}

	@When("select value from dropdown and add value")
	public void select_value_from_dropdown_and_add_value() throws EncryptedDocumentException, IOException, InterruptedException {
	  
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				Thread.sleep(3000);
				ctp2.selectcountry(FetchDataCode.paramethod(i, 0));
				ctp2.selecttypeoftravel(FetchDataCode.paramethod(i, 1));
				ctp2.selectnooftrips(FetchDataCode.paramethod(i, 2));
				ctp2.selecttsd(FetchDataCode.paramethod(i, 3));
				ctp2.remarkbox();
				ctp2.ClickOnAddBtn();
				Thread.sleep(2000);
				break;
			}
				
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
	}
	
	@Then("capture screenshot of selected values")
	public void capture_screenshot_of_selected_values() throws IOException {
	   
		ScreenShotCode.screenshotmethod(driver, "sc of 3 values");
	}
	

	@Then("deselect last value")
	public void deselect_last_value() throws InterruptedException {
	
		Thread.sleep(3000);
		ctp2.ClickOnRemoveicon();

		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
	}
	@Then("capture the screenshot agian")
	public void capture_the_screenshot_agian() throws IOException {
	
		ScreenShotCode.screenshotmethod(driver, "sc of 2 values");

	}

	







	
	
}
