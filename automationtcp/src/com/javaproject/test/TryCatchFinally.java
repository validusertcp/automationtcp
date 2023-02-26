package com.javaproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCatchFinally {
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			/**
			 * Launch browser 
			 */
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			/*
			 * Quit browser
			 */
			driver.quit();
			
		}

	}

}
