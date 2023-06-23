package pompack;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CtAssignmentpom2 {

	Actions a;
	String e;
	
	@FindBy(xpath="//*[@id=\"ctl00_mnuList_rmMenu_m0\"]/span")
	private WebElement hristab;
	
	@FindBy(xpath="//*[@id=\"ctl00_mnuList_rmMenu_m0_m0\"]/span")
	private WebElement employeedetailstab;
	
	@FindBy(xpath="//span[text()='CentriCT']")
	private WebElement windowID;
	
	@FindBy(xpath="//*[@id=\"tdTravel\"]")
	private WebElement traveltab;
	
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_cboTravelCountry\"]")
	private WebElement countrydropdown;
		
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_cboTypeOfTravel\"]")
	private WebElement typeoftravel;
	
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_cboTravelNoOfTrips\"]")
	private WebElement nooftips;
	
	@FindBy(xpath="//*[@id=\"ctl00_ContentPlaceHolder1_cboTravelEstDuration\"]")
	private WebElement tsd;
	
	@FindBy(xpath="//*[@id=\"txtTravelRemarks\"]")
	private WebElement remark;
	
	@FindBy(xpath="//*[@id=\"btnTravelAdd\"]")
	private WebElement addbtn;
	
	@FindBy(xpath="//table[@tabindex='133']//tr//td[7]//img")
	private List<WebElement> removeicons;	
	
	public void hrisaction(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(hristab).build().perform();
	}
	
	public void clickonemployeedetails()
	{
		a.moveToElement(employeedetailstab).click().build().perform();
		
	}
	public void capturewindowID()
	{
		String te=windowID.getText();
		System.out.println(te);
		
	}
	
	
	public void ClickOnTravelTab()
	{
		traveltab.click();
	}
	
	public void selectcountry(String value)
	{
		Select sc=new Select(countrydropdown);
		List<WebElement>allcountry=sc.getOptions();
		for(int i=0;i<allcountry.size();i++)
		{
			 String h=allcountry.get(i).getText();
			 if(h.equals(value))
			 {
				  e=allcountry.get(i).getText();
				 allcountry.get(i).click();
			 }
				
		}
		//sc.selectByIndex(a);
		
	}
	
	public void selecttypeoftravel(String value)
	{
		Select tt=new Select(typeoftravel);
		List<WebElement>ta=tt.getOptions();
		for(int i=0;i<ta.size();i++)
		{
			String sa=ta.get(i).getText();
			if(sa.equals(value))
			{
				ta.get(i).click();
			}
		}
		
		
	}
	
	public void selectnooftrips(String value)
	{
		Select nt=new Select(nooftips);
		List<WebElement>ta=nt.getOptions();
		for(int i=0;i<ta.size();i++)
		{
			String sa=ta.get(i).getText();
			if(sa.equals(value))
			{
				ta.get(i).click();
			}
		}	
	}
	public void selecttsd(String value)
	{
		Select ts=new Select(tsd);
		List<WebElement>ta=ts.getOptions();
		for(int i=0;i<ta.size();i++)
		{
			String sa=ta.get(i).getText();
			if(sa.equals(value))
			{
				ta.get(i).click();
			}
		}	
	}
	
	public void remarkbox()
	{
		remark.sendKeys(e);
	}
	
	public void ClickOnAddBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		addbtn.click();
	}
	
	public void ClickOnRemoveicon()
	{
		/*for(int i=removeicons.size()-1;i<removeicons.size();i++)
		{
			WebElement we=removeicons.get(i);
			we.click();
			break;
		}
		*/
		
		LinkedList<WebElement> ll=new LinkedList();
		ll.addAll(removeicons);
		ll.getLast().click();
		
	}
	
	
	
	
	
	public CtAssignmentpom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
