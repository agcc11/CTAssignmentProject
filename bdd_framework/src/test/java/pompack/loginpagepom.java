package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagepom {

	//public WebDriver driver;
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
	private WebElement logdrop;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	private WebElement logout;
	
	public void enterusername(String user) throws InterruptedException
	{
		Thread.sleep(3000);
		username.sendKeys(user);
	}
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickonloginbtn()
	{
		loginbtn.click();
	}
	
	public void clickonlogout()
	{
		logdrop.click();
		logout.click();
	}
	
	public loginpagepom(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
}
