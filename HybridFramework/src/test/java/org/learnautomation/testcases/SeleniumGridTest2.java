package org.learnautomation.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest2 {


	@Test
	public void testOnCloud() throws MalformedURLException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "72.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1024x768");
	    
	    URL url=new URL("http://mukeshotwani3:s4GTbs4fFzQxJxzpzp2f@hub-cloud.browserstack.com/wd/hub");
	    
	    WebDriver driver=new RemoteWebDriver(url, caps);
	    driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Selenium  Webdriver Tutorials");
	    driver.quit();
	    
	}
	
	

}
