package com.javaproject.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// Navigate to application homepage
		driver.get("https://www.amazon.in");
		//Waits in selenium
		// 1. implicitlyWait- TimeUnit.SECONDS/MILLISECONDS/MINUTES
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//=============================================================
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8149440514");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("J@rvis007");
		driver.findElement(By.id("signInSubmit")).click();

		// 2. ExplicitlyWait- Specific Conditions
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("(.clickthrough)[1]"))));
//		driver.findElement(By.cssSelector("(.clickthrough)[1]")).click();
//		
		// FluentWait
		FluentWait wait1 = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("(.clickthrough)[1]")));
		driver.findElement(By.cssSelector("(.clickthrough)[1]")).click();
	}

}
