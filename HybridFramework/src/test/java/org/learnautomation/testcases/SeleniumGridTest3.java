package org.learnautomation.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest3 {


	@Test
	public void testOnCloud() throws MalformedURLException
	{
		DesiredCapabilities caps=DesiredCapabilities.chrome();
	
		caps.setPlatform(Platform.WINDOWS);
		      
	    URL url=new URL("http://192.168.1.4:4444/wd/hub");
	    
	    WebDriver driver=new RemoteWebDriver(url, caps);
	    
	    driver.get("http://www.google.com");
	    
	    driver.findElement(By.name("q")).sendKeys("Selenium  Webdriver Tutorials");
	    
	    driver.quit();
	    
	}
	
	

}
