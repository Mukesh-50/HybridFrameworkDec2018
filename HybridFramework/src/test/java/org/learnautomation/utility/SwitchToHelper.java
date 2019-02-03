package org.learnautomation.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToHelper {


	public void handleFrameUsingID(WebDriver driver,String id) {

		new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id(id)));
		
		//driver.switchTo().frame(id);
		
	}

	public void handleFrameUsingName() {

	}

	public void handleFrameUsingElement() {

	}

	public void acceptAlert(WebDriver driver) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent()).accept();
	}

	public static String getTextFromAlert(WebDriver driver) {

		return new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent()).getText();
		
	}

	public void dismissAlert(WebDriver driver) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent()).dismiss();
	}

	public void switchWindows() {

	}

}
