package org.learnautomation.stepDefination;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginHRM {

	WebDriver driver;

	@Given("^Open Chrome and open application$")
	public void open_Chrome_and_open_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chandani_50\\Desktop\\Selenium Jar\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
	
		HashMap<String, Object> mypreference=new HashMap<String, Object>();
		mypreference.put("profile.default_content_setting_values.notifications",2);
		
		option.setExperimentalOption("prefs", mypreference);
		
		driver = new ChromeDriver(option);
	
		driver.get("https://www.redbus.in/");

	}

	@When("^I enter admin and admin(\\d+)$")
	public void i_enter_admin_and_admin(int arg1) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();

	}

}
