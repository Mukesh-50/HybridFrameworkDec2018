package org.learnautomation.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() {
		
		try {
			FileInputStream fis=new FileInputStream(new File(System.getProperty("user.dir")+"/Config/ProjectConfig.properties"));
			
			pro=new Properties();
			
			pro.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	public String getValue(String key)
	{
		return pro.getProperty(key);
	}
	
	
	public String getStagingURL()
	{
		return pro.getProperty("staginURL");
	}
	

	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	


}
