package org.learnautomation.unitTest;

import org.learnautomation.factory.BrowserFactory;
import org.learnautomation.factory.DataProviderFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrowserFactory {

	@Test
	public void testBrowsers() {

		WebDriver driver = BrowserFactory.startApplication(DataProviderFactory.getConfig().getStagingURL(),
				DataProviderFactory.getConfig().getBrowser());
		System.out.println(driver);
		Assert.assertTrue(!(driver==null));
	}

}
