package org.learnautomation.testcases;

import org.learnautomation.factory.DataProviderFactory;
import org.learnautomation.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FirstLoginFreeCRMTest extends BaseClass {

	LoginPage login;

	@Test
	public void loginCRM() 
	{	
		logger = report.createTest("CRM login Test");

		login = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Browser and Application is up and running");

		login.loginToApplication(DataProviderFactory.getExcel().getStringData("Login", 0, 0),
				DataProviderFactory.getExcel().getStringData("Login", 0, 1));

	}

}
