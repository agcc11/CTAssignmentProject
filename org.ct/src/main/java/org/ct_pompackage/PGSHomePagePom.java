package org.ct_pompackage;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseClass;
public class PGSHomePagePom extends BaseClass {

	Actions a;
	String gh;
	
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
	
	public void hrisaction()
	{
		a=new Actions(driver);
		a.moveToElement(hristab).build().perform();
	}
	
	public void clickonemployeedetails()
	{
		a.moveToElement(employeedetailstab).click().build().perform();
		
	}
	public String capturewindowID()
	{
		String te=windowID.getText();
		System.out.println(te);
		return te;
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
			String e=allcountry.get(i).getText();
			if(e.contains(value))
			{
				gh=value;
				allcountry.get(i).click();
			}
			
		}
	//	sc.selectByIndex(a);
		
	}
	
	public void selecttypeoftravel(String value)
	{
		Select tt=new Select(typeoftravel);
		//tt.selectByIndex(b);
		List<WebElement>st=tt.getOptions();
		for(int i=0;i<st.size();i++)
		{
			String d=st.get(i).getText();
			if(d.contains(value))
			{
				st.get(i).click();
			}
		}
	}
	
	public void selectnooftrips(String value)
	{
		Select nt=new Select(nooftips);
		//nt.selectByIndex(c);
		List<WebElement>ntt=nt.getOptions();
		for(int i=0;i<ntt.size();i++)
		{
			String gg=ntt.get(i).getText();
			if(gg.contains(value))
			{
				ntt.get(i).click();
			}
		}
	}
	public void selecttsd(String value)
	{
		Select ts=new Select(tsd);
		//ts.selectByIndex(d);	
		List<WebElement>tss=ts.getOptions();
		for(int i=0;i<tss.size();i++)
		{
			String gg=tss.get(i).getText();
			if(gg.contains(value))
			{
				tss.get(i).click();
			}
		}
	}
	
	public void remarkbox()
	{
		remark.sendKeys(gh);
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
	
	public PGSHomePagePom()
	{
		PageFactory.initElements(driver, this);
	}

	
		
	}

