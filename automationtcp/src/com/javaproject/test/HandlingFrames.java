package com.javaproject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		// Click on amazon homepage/logo
		driver.findElement(By.id("nav-logo-sprites")).click();
		Thread.sleep(3000);
		//handling frame
//		driver.switchTo().frame(1);
		driver.switchTo().frame("ape_Gateway_right-2_desktop_iframe");
//		WebElement frame = driver.findElement(By.cssSelector("#nav-logo-sprites"));
//		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//img[@alt='Laptops']")).click();// Fail=> Element present inside a frame <iframe> tag
		Thread.sleep(3000);
		driver.findElement(By.id("nav-logo-sprites")).click();
		
	}

}
