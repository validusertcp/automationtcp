package com.javaproject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	
	public static WebDriver driver;
	public MouseActions(WebDriver driver) {
		this.driver=driver;
	}
	@SuppressWarnings("deprecation")
	public void initializeBrowser() {
		// to bypass system.setProperty()
		//System.setProperty("webdriver.chrome.driver" , ".exe file path");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	
	public void closingBrowser() {
		driver.quit();
	}
	
//	 //see class file = ClickAndHold.class to understand inheritance concept
//	
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
