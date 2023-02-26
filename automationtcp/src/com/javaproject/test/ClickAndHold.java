package com.javaproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold extends MouseActions{
	public ClickAndHold(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {
		MouseActions obj = new MouseActions(driver);
		obj.initializeBrowser();
		
		/*
		 * Write your code here for clickAndHold action
		 */
		WebElement element=  driver.findElement(By.linkText("Best Sellers"));
		Actions act = new Actions(driver);
		act.clickAndHold(element).build().perform();
		Thread.sleep(5000);
		
//		
//		
		obj.closingBrowser();
	}


}
