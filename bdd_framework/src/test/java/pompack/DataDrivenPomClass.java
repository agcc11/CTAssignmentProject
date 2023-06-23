package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataDrivenPomClass {

	
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[1]/input")
	private WebElement Username;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[2]/input")
	private WebElement Password;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input")
	private WebElement LoginBtn;
	
	
	
	public void EnterUsername(String username)
	{
		Username.sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void ClickOnLoginBtn()
	{
		LoginBtn.click();
	}
	
	public DataDrivenPomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
