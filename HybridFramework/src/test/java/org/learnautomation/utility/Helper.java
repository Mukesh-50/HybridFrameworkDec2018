package org.learnautomation.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver) {

		String path=System.getProperty("user.dir")+"/Screenshots/FreeCRM"+System.currentTimeMillis()+".png";
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File(path));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return path;
	}
	
	public static void verifyTitleContains(WebDriver driver,String expectedTitle)
	{
		Assert.assertTrue(new WebDriverWait(driver, 30)
				.until(ExpectedConditions.titleContains(expectedTitle)));
	}
	
	public static void verifyUrlContains(WebDriver driver,String expectedURL)
	{
		Assert.assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.urlContains(expectedURL)));
	}
	
	public static void verifyUrlContainsSoftAssert(WebDriver driver,String expectedURL)
	{
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.urlContains(expectedURL)));
		softAssert.assertAll();
	}
	
	public static WebElement waitForWebElement(WebDriver driver, String xpath,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	public static WebElement waitForWebElementUsingCSS(WebDriver driver, String css,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
	}

	public static WebElement waitForWebElement(WebDriver driver, By by,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	// This is only required when you want to highlight the webelement
	public static WebElement syncWebElement(WebDriver driver,WebElement element)
	{
	
	 WebElement ele= waitForWebElement(driver, element, 20);
		
	 WebElement ele1=highLightElement(driver, ele);
	 
	 return ele1;
	 
	}
	
	// use this always if you dont want to highlight the elements
	public static WebElement waitForWebElement(WebDriver driver, WebElement element,int time)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement highLightElement(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

		return element;
	}

	
	public void getCurrentDateAndTime() {

	}


}
