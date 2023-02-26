package com.javaproject.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindingWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		//Locating webelement - Dropdown list with <select> tag
		driver.findElement(By.id("searchDropdownBox")).click();
		WebElement list = driver.findElement(By.id("searchDropdownBox"));
		// create a new object for select class
		Select selectOption = new Select(list);
		// read all options from dropdownlist
		List <WebElement> options = selectOption.getOptions();
		
		for (WebElement element : options) {
			System.out.println("All options in DDL are "+element.getText());
		}
		System.out.println();
		//Selecting ddl by name
//		selectOption.selectByIndex(2);
		selectOption.selectByVisibleText("Apps & Games");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
