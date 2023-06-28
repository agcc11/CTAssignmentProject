package org.ct_pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.BaseClass;

public class HomePage  {

	
	@FindBy(xpath="//*[@id=\"s4-bodyContainer\"]/div[1]/div/div[2]/a")
	private WebElement toolsicon;
	
	@FindBy(xpath="//*[@id=\"s4-bodyContainer\"]/div[1]/div/div[1]/div/ul/li[1]/a/img")
	private WebElement pgsicon;

	
	public void clickontoolsicon() {
		toolsicon.click();
	}

	public void clickonpgssicon() {
		pgsicon.click();
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
