package com.javaproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Context_RightClick extends MouseActions {

	public Context_RightClick(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) {
		MouseActions action = new MouseActions(driver);
		try {
			action.initializeBrowser();
			/*
			 * your code
			 */
			WebElement element = driver.findElement(By.linkText("Best Sellers"));
			Actions act = new Actions(driver);
			act.contextClick(element).build().perform();
			Thread.sleep(3000);
			System.out.println("Performed right Click on link text ::: " + element.getText());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			action.closingBrowser();
		}

	}

}
