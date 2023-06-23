package stepDefination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

public class aarpStepDefClass {

	public WebDriver driver;

	@Given("user open application")
	public void user_open_application() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		driver.get("https://www.aarpmedicareplans.com/");
		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//			if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
//				System.out.println("alert is not present");
//			} else {
//				driver.switchTo().alert().dismiss();
//			}
			ArrayList<String>win=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(win.get(1));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Your opinion matters!']/following::div[3]"))).click();
			//driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[4]/div[6]")).click();
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("pop up not displayed");
		}
		
	}

	@Then("user enter zip code")
	public void user_enter_zip_code(DataTable dataTable) {

		List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);
		String zipcode = userlist.get(0).get("zip code");
		driver.findElement(By.xpath("//*[@id=\"zipcodemeded-0\"]")).sendKeys(zipcode);
		driver.findElement(By.xpath(
				"//*[@id=\"globalContentIdForSkipLink\"]/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/div/form/div[1]/button/span"))
				.click();
	}

	@When("user click on medicare supp plans and fill macra form")
	public void user_click_on_medicare_supp_plans_and_fill_macra_form(DataTable dataTable) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tab-ms\"]")).click();
		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//			if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
//				System.out.println("alert is not present");
//			} else {
//				driver.switchTo().alert().dismiss();
//			}
//			ArrayList<String>win=new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(win.get(1));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Your opinion matters!']/following::div[3]"))).click();
			//driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[4]/div[6]")).click();
			driver.switchTo().parentFrame();
	    	}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("alert is not present");
		}

		List<Map<String, String>> userlist = dataTable.asMaps(String.class, String.class);
		String dob = userlist.get(0).get("DOB");
		String gender = userlist.get(0).get("Gender");
		String partAMonth = userlist.get(0).get("Part A Month");
		String partAYear = userlist.get(0).get("Part A Year");
		String partBMonth = userlist.get(0).get("Part B Month");
		String partBYear = userlist.get(0).get("Part B Year");
		String planToStart = userlist.get(0).get("Plan To Start");
		driver.findElement(By.xpath("//input[@id='msVppDOB']")).sendKeys(dob);
//		List<WebElement> gendersel=driver.findElements(By.xpath("//input[contains(@id,'Gender_')]"));
//		for(int i=0;i<gendersel.size();i++)
//		{
//			String te=gendersel.get(i).getText();
//			System.out.println(te);
//			if(te.equals(gender))
//			{
//				gendersel.get(i).click();
//			}
//		}
		// driver.findElement(By.xpath("//input[@id='Gender_11'][@value='M']")).click();
		WebElement l = driver.findElement(By.xpath("//input[@id='Gender_11'][@value='M']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", l);

		WebElement partAmonth = driver.findElement(By.xpath("//*[@id=\"mpaed-month\"]"));
		Select s = new Select(partAmonth);
		List<WebElement> AMonth = s.getOptions();

		for (int i = 0; i < AMonth.size(); i++) {
			String t = AMonth.get(i).getText();
			if (t.equals(partAMonth)) {
				AMonth.get(i).click();
			}
		}

		WebElement partAyear = driver.findElement(By.xpath("//*[@id=\"mpaed-year\"]"));
		Select s1 = new Select(partAyear);
		List<WebElement> Ayear = s1.getOptions();

		for (int i = 0; i < Ayear.size(); i++) {
			String t = Ayear.get(i).getText();
			if (t.equals(partAYear)) {
				Ayear.get(i).click();
			}
		}

		WebElement partBmonth = driver.findElement(By.xpath("//*[@id=\"mpbed-month\"]"));
		Select s2 = new Select(partBmonth);
		List<WebElement> Bmonth = s2.getOptions();

		for (int i = 0; i < Bmonth.size(); i++) {
			String t = Bmonth.get(i).getText();
			if (t.equals(partBMonth)) {
				Bmonth.get(i).click();
			}
		}

		WebElement partByear = driver.findElement(By.xpath("//*[@id=\"mpbed-year\"]"));
		Select s3 = new Select(partByear);
		List<WebElement> Byear = s3.getOptions();

		for (int i = 0; i < Byear.size(); i++) {
			String t = Byear.get(i).getText();
			if (t.equals(partBYear)) {
				Byear.get(i).click();
			}
		}
		System.out.println(planToStart);
		WebElement plantostart = driver.findElement(By.xpath("//select[@id='msVppdpsd']"));
		plantostart.click();
		Select s4 = new Select(plantostart);
		List<WebElement> pts = s4.getOptions();

		for (int i = 0; i < pts.size(); i++) {
			String t = pts.get(i).getText();
			if (t.equals(planToStart)) {
				pts.get(i).click();
			}
		}
		Thread.sleep(3000);
		//*[@id="rate-calculator"]/form/div/div[17]/div/p[1]/button
		driver.findElement(By.xpath("//*[@id=\"rate-calculator\"]/form/div/div[17]/div/p[1]/button")).click();
	}
}
