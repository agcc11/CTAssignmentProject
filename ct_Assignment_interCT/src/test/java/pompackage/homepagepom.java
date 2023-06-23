package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagepom extends Baseclass{

	
	WebDriver ldriver;
	
	@FindBy(xpath="//*[@id=\"s4-bodyContainer\"]/div[1]/div/div[2]/a")
	WebElement toolsicon;
	
	@FindBy(xpath="//*[@id=\"s4-bodyContainer\"]/div[1]/div/div[1]/div/ul/li[1]/a/img")
	WebElement pgsicon;
	
	
	public void clickontoolsicon() {
		toolsicon.click();
	}
	
	
	public void clickonpgssicon() {
		pgsicon.click();
	}
	

	public homepagepom(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
}
