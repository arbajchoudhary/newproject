package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.amazon.in/?");
	   
	   driver.manage().window().maximize();
	   
	   System.out.println(driver.getCurrentUrl());
	   
	   System.out.println(driver.getTitle());
	   
	   Thread.sleep(3000);
	   
	   WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
	   
	   e.click();
	   e.sendKeys("watches");
	   
	   WebElement e1=driver.findElement(By.id("nav-search-submit-button"));
	   e1.click();
	   
	   Thread.sleep(4000);
	   
	   driver.quit();
	   
	   

	}

}
