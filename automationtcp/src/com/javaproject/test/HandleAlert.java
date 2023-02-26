package com.javaproject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
		//Handling Simple alert
		driver.findElement(By.linkText("See an example alert")).click();
		Thread.sleep(5000);
		Alert alert=  driver.switchTo().alert();
		Thread.sleep(5000);
		String alertmsg = alert.getText();
		System.out.println("Alert message is ==>>> "+alertmsg);
		alert.accept();
		
		//Handling Confirmation alert
			driver.findElement(By.linkText("See a sample confirm")).click();
			Thread.sleep(5000);
			Alert alert1=  driver.switchTo().alert();
			Thread.sleep(5000);
			String alertmsg1 = alert1.getText();
			System.out.println("Alert message is ==>>> "+alertmsg1);
			alert.accept();
			driver.findElement(By.linkText("See a sample confirm")).click();
			Thread.sleep(5000);
			alert.dismiss();
			
			//Handling prompt alert
			driver.findElement(By.linkText("See a sample prompt")).click();
			Thread.sleep(5000);
			Alert alert2 = driver.switchTo().alert();
			String alertmsg2 = alert2.getText();
			System.out.println("Prompt alert message is ==>> "+alertmsg2);
			alert2.sendKeys("Selenium");
			Thread.sleep(5000);
			alert2.accept();
			driver.findElement(By.linkText("See a sample prompt")).click();
			Thread.sleep(5000);
			alert2.dismiss();
			
	}			
}
