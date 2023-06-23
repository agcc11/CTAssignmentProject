package testpackage;

import org.testng.annotations.Test;

import pompackage.Baseclass;
import pompackage.homepagepom;

public class HomePageTestClass extends Baseclass {

	

	@Test
	public void homepagetest() throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		homepagepom hm=new homepagepom(driver);
		hm.clickontoolsicon();
		Thread.sleep(3000);
		hm.clickonpgssicon();
		
	}
}
