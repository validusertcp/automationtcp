package com.javaproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends MouseActions {

	public DragAndDrop(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {
		MouseActions obj = new MouseActions(driver);
		try {
			obj.initializeBrowser();
			WebElement sourceElement = driver.findElement(By.linkText("Fashion"));
			WebElement destinationElement = driver.findElement(By.id("twotabsearchtextbox"));
			Actions act = new Actions(driver);
			act.dragAndDrop(sourceElement, destinationElement).build().perform();
			Thread.sleep(1000);
			
			// Window scrolling
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1600)", "");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-800)", "");
			Thread.sleep(3000);
		} finally {
			obj.closingBrowser();
		}

	}

}
