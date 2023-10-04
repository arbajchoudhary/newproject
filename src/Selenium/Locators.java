package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.firstcry.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
         
		WebElement e=driver.findElement(By.id("search_box"));
		
		e.click();
		e.sendKeys("clothes");
		
		WebElement e1=driver.findElement(By.className("search-button"));
		
		e1.click();
		
		Thread.sleep(4000);
		driver.quit();
	}

}
