package org.learnautomation.pages;

import org.learnautomation.utility.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(how = How.ID_OR_NAME, using="username") WebElement uname;
	
	@FindBy(xpath="//input[@name='password']") WebElement pass;

	@FindBy(how = How.XPATH, using = "//input[@value='Login']") WebElement loginButton;
	
	
	
	public void loginToApplication(String luname,String lpass)
	{
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Helper.syncWebElement(driver, uname).sendKeys(luname);
		Helper.syncWebElement(driver, pass).sendKeys(lpass);
		Helper.waitForWebElement(driver, loginButton, 20).click();
		
	
	}
	

	public void enterUserName()
	{
		uname.sendKeys("Selenium_50");
		
	
	}
	

	public void entePassword()
	{
		uname.sendKeys("Selenium_50");
	
	
	}
	
	public void clickOnLoginButton()
	{
		uname.sendKeys("Selenium_50");
	
	}
	
	public void verifySuccessLogin()
	{
		uname.sendKeys("Selenium_50");
	
	}


}
