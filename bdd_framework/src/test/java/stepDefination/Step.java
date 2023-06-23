package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pompack.Addnewuserpom;
import pompack.loginpagepom;

public class Step {

	public WebDriver driver;
	public loginpagepom lp;
	public Addnewuserpom add;
	
	@Given("launch browser")
	public void launch_browser() {
	  
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe" );
	   driver=new ChromeDriver();
	   lp=new loginpagepom(driver);
	   add=new Addnewuserpom(driver);
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
	   driver.get(url);
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws InterruptedException {
	   lp.enterusername(email);
	   lp.enterpassword(password);
	   lp.clickonloginbtn();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
	   if(driver.getPageSource().contains("Invalid credentials"))
	   {
		   driver.close();
		   Assert.assertTrue(false);
	   }
	   else
	   {
		   Assert.assertEquals(title,driver.getTitle());
	   }
	}

	@When("user click on logout")
	public void user_click_on_logout() throws InterruptedException {
		Thread.sleep(3000);
		lp.clickonlogout();
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException {
	   Thread.sleep(3000);
		driver.close();
		  Thread.sleep(3000);
	}


	//AddNewUser steps
	
	

	@Then("user enter username {string} and password as {string}")
	public void user_enter_username_and_password_as(String username, String password) throws InterruptedException {
	   
		lp.enterusername(username);
		lp.enterpassword(password);
		
		
	}
	@Then("user click on loginbtn")
	public void user_click_on_loginbtn() throws InterruptedException {
	   lp.clickonloginbtn();
	   Thread.sleep(3000);
		
	}
	@Then("user click on admin tab")
	public void user_click_on_admin_tab() throws InterruptedException {
	   add.clickonadminbtn();
	   Thread.sleep(3000);
	}
	@Then("click on Addbtn")
	public void click_on_addbtn() throws InterruptedException {
	  add.clickonaddbtn();
	  Thread.sleep(3000);
	}
	@Then("select user role as {string}")
	public void select_user_role_as_ess(String te) throws InterruptedException {
	   add.selectuserrole(te);
	}
	@Then("enter employee name as {string}")
	public void enter_employee_name_as(String string) throws InterruptedException {
	   add.selectemployeename(string);
	   
	}
	@Then("select status as {string}")
	public void select_status_as_enabled(String st) throws InterruptedException {
	    add.selectstatus(st);
	}
	@Then("enter username as {string}")
	public void enter_username_as(String string) {
	   add.selectusername(string);
	}
	@Then("enter password as {string}")
	public void enter_password_as(String string) {
	   add.selectpassword(string);
	}
	@Then("enter confirm password as {string}")
	public void enter_confirm_password_as(String string) {
	   add.selectconfirmpass(string);
	}
	@Then("click on savebtn")
	public void click_on_savebtn() {
	   add.clickonsavebtn();
	}



	
}
