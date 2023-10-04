package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		WebElement e=driver.findElement(By.id("username"));
		
		e.click();
		e.sendKeys("arbajchoudhary7776");
		
		WebElement e1=driver.findElement(By.id("password"));
		
		e1.click();
		e1.sendKeys("7020515030");
		
		WebElement e2=driver.findElement(By.id("Login"));
		
		e2.click();
		
		Thread.sleep(4000);
		
		driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
