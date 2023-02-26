package com.javaproject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsAPI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");

		// Keyboard actions
		/*
		 * Keys- keyDown(Press), KeyUp(release)
		 */
		Actions act = new Actions(driver);
		// 1. sending capital letters from keyboard
		WebElement searchTxtbox = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));

		act.keyDown(Keys.SHIFT).sendKeys(searchTxtbox, "laptop").keyUp(Keys.SHIFT).perform();
		Thread.sleep(3000);
		System.out.println("LAPTOP text entered into search textbox using keyboard");

		// 2. clear text box using keyboard
		act.moveToElement(searchTxtbox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
				.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Text entered into search textbox cleared by using keyboard keys Ctrl+A, backspace");
		Thread.sleep(3000);
		// search for mobiles
		act.keyDown(Keys.SHIFT).sendKeys(searchTxtbox, "Mobiles").keyUp(Keys.SHIFT).perform();
		Thread.sleep(3000);
		
		System.out.println("MOBILE text entered into search textbox using keyboard");
		// 3. click on icon using keyboard
		act.moveToElement(searchIcon).sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		System.out.println("Clicked on search icon using keyboard");

	}

}
