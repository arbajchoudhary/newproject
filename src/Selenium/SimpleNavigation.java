package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleNavigation 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		                 //open or enter the url
		
		Thread.sleep(3000);
		             // pause
		
		driver.manage().window().maximize();
		             // to maximize the webpage
		
		System.out.println(driver.getTitle());
		             // to retrieve the title
		
		System.out.println(driver.getCurrentUrl());
		             // to retrieve the current url
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		

	}

}
