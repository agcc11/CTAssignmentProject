package utilitiesPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	
	Properties pro;
	 
	 public ReadConfig()
	 {
		 File src=new File("./Configuration/config.properties");
		 
		 try
		 {
			 FileInputStream file=new FileInputStream(src);
			 pro=new Properties();
			 pro.load(file);		
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 public String geturl()
	 {
		String url=pro.getProperty("baseurl");
		 return url; 
	 }
	 
	 public String getchromepath()
	 {
		String chromepath=pro.getProperty("chromepath");
		 return chromepath; 
	 }
	 
	 public String getedgepath()
	 {
		String edgepath=pro.getProperty("edgepath");
		 return edgepath; 
	 }
	
	
	
	
}
