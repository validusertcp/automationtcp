package com.javaproject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerCmds {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// Q. 1. How to launch browser in selenium?
		// Browser launch
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Navigate to url
		driver.get("https://www.google.com");
//		

		// click on link -gmail
//		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
//		driver.findElement(By.id("gmail")).click;
//		driver.findElement(By.tagName("a"));
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Gmail")).click();
//		driver.findElement(By.name("Gmail"));
		driver.findElement(By.partialLinkText("mail")).click();
//		driver.findElement(By.cssSelector("a.gb_d")).click();

		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		driver.get(currentURL); // refresh browser
		Thread.sleep(5000);
		driver.navigate().to(currentURL);

//		driver.close();// Current handling window closes by webdriver
		driver.quit();// All windows and process started by webdriver closes by webdriver

	}

}
