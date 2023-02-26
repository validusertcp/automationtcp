package com.javaproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement extends MouseActions{

	public MoveToElement(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {
		MouseActions obj = new MouseActions(driver);
		try {
			obj.initializeBrowser();
			WebElement ele = driver.findElement(By.linkText("Fashion"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			Thread.sleep(3000);
		} finally {
			obj.closingBrowser();
		}
	}

}
