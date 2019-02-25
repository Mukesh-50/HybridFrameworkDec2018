package org.learnautomation.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest {


	@Test
	public void testOnCloud() throws MalformedURLException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browserName", "android");
	    caps.setCapability("device", "Samsung Galaxy Note 9");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "8.1");
	    caps.setCapability("browserstack.debug","true");
	    caps.setCapability("browserstack.networkLogs","true");
	    
	    URL url=new URL("http://mukeshotwani3:s4GTbs4fFzQxJxzpzp2f@hub-cloud.browserstack.com/wd/hub");
	    
	    WebDriver driver=new RemoteWebDriver(url, caps);
	    driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Selenium  Webdriver Tutorials");
	    driver.quit();
	    
	}
	
	

}
