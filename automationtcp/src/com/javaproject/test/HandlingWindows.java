package com.javaproject.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Browser launched successfully.");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		System.out.println("Navigated to Amazon.in");
		
		 ///searching for mobiles
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on search textbox");
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		System.out.println("Cleared content of search textbox");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		System.out.println("Entered \"Mobiles\" into search textbox");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("Clicked on search icon");
		Thread.sleep(3000);
						//read current url
						String moburl = driver.getCurrentUrl();
						System.out.println("Current url "+moburl);
						//Read first window title
						String firstPageTitle = driver.getTitle();
						System.out.println("1st page title ::: "+firstPageTitle);
						//switching to new window tab
						driver.switchTo().newWindow(WindowType.TAB);
						//Navigate to mobile searched url directly by passing current url
						driver.get(moburl);
						String secondPageTitle = driver.getTitle();
						System.out.println("2nd page title ::: "+secondPageTitle);
						// content comparision .equals() method
						if(firstPageTitle.equals(secondPageTitle)) {
							System.out.println("Both pages titles are identical");
						}else {
							System.out.println("!!!!!!!!!Not identical");
						}
						
						driver.switchTo().newWindow(WindowType.WINDOW);
						Thread.sleep(3000);
						driver.get(moburl);
						
						driver.close(); //new window close
						driver.quit(); // all window close
		//		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
//		System.out.println("Clicked on first mobile displayed");
//		Thread.sleep(3000);
//		//Switching to new window/tab
//		String originalWindow = driver.getWindowHandle();// returns Alphanumeric String type is Webelement
//		System.out.println("Original window name == "+originalWindow);
//		Set<String> windows =driver.getWindowHandles();// returns Set of Alphanumeric String type is Webelement
//		//For each loop for iteration of set
//		for (String i:windows) {
//			System.out.println("windows name are "+ i);
//			if(!(originalWindow==i)) {
//				driver.switchTo().window(i);
//				System.out.println("Switched second window");
//			}
//		}
//		String mobModelName = driver.findElement(By.id("productTitle")).getText();
//		System.out.println("Mobile model name is "+mobModelName);
//		Thread.sleep(3000);
//		driver.close();
//		// switching to original window
//		driver.switchTo().window(originalWindow);
//		//click on amazon logo
//		driver.findElement(By.id("nav-logo-sprites")).click();
//		Thread.sleep(3000);
//		System.out.println("Clicked on Amazon logo/homepage");
//		Thread.sleep(3000);
//		driver.quit();
						
						}
	

}
