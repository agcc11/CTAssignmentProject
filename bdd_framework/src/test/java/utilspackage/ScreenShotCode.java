package utilspackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotCode {

	
	public static String Timestamp()
	{
		String t=new SimpleDateFormat("MM dd HH.mm.ss").format(Calendar.getInstance().getTime());
		return t;	
	}
	
	public static void screenshotmethod(WebDriver driver,String Filename) throws IOException
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File(".//ScreenShots/"+Filename+Timestamp()+".jpg");
		FileUtils.copyFile(s, d);
	}
	
}
