package pompack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewuserpom {

	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	private WebElement Admin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	private WebElement Addbtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	private WebElement userrole;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	private WebElement employeename;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
	private WebElement status;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	private WebElement usname;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	private WebElement pass;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	private WebElement confirmpass;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	private WebElement savebtn;
	
	@FindBy(xpath="//div[@role='listbox']//div")
	private List<WebElement> userroleop;
	
	@FindBy(xpath="//div[@role='listbox']//div")
	private List<WebElement> statusop;
	
	@FindBy(xpath="//div[@role='listbox']//span")
	private List<WebElement> employeenameop;
	
	
	
	public void clickonadminbtn()
	{
		Admin.click();
	}
	
	public void clickonaddbtn()
	{
		Addbtn.click();
	}
	
	public void selectuserrole(String userr) throws InterruptedException
	{
		userrole.click();
		Thread.sleep(3000);
		for(int i=0;i<userroleop.size();i++)
		{
			String te=userroleop.get(i).getText();
			if(te.equals(userr))
			{
				userrole.click();
			}
		}
			
	}
	
	public void selectemployeename(String emname) throws InterruptedException
	{
		employeename.sendKeys("li");
		Thread.sleep(3000);
		
		for(int i=0;i<employeenameop.size();i++)
		{
			WebElement we=employeenameop.get(i);
			String t=we.getText();
			if(t.equals(emname))
			{
				we.click();
				break;
			}
		}
			
	}
	public void selectstatus(String st) throws InterruptedException
	{
		status.click();
		Thread.sleep(3000);
		for(int i=0;i<statusop.size();i++)
		{
			String te=statusop.get(i).getText();
			if(te.equals(st))
			{
				((WebElement) statusop).click();
			}
		}
	}
	
	public void selectusername(String te)
	{
		usname.sendKeys(te);
	}
	
	public void selectpassword(String te)
	{
		pass.sendKeys(te);
	}
	public void selectconfirmpass(String te)
	{
		confirmpass.sendKeys(te);
	}
	public void clickonsavebtn()
	{
		savebtn.click();
	}
	
	public Addnewuserpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
