package org.learnautomation.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

		
	public static WebDriver startApplication(String appUrl,String browserName)
	{
		
	WebDriver driver=null;	
		
	if(browserName.equalsIgnoreCase("Chrome"))
	{
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver(option);
	}
	else if(browserName.equalsIgnoreCase("Firefox"))
	{
	 
		 
	}
	else if(browserName.equalsIgnoreCase("IE"))
	{
		
	}
	else 
	{
		System.out.println("We only Support Chrome, FF, IE Browser for testing");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get(appUrl);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	return driver;
	
	}
	
	
	public static void closeApplication(WebDriver driver)
	{
		driver.quit();
	}
	
}
