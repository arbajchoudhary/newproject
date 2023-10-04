package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement link1=driver.findElement(By.linkText("Forgot Your Password?"));
		
		//link1.click();
		
		
		System.out.println(link1.isDisplayed());
		System.out.println(link1.isEnabled());
		System.out.println(link1.getText());
		
		Thread.sleep(2000);
		
		WebElement link2=driver.findElement(By.partialLinkText("Use Custom"));
		
		//link2.click();
		
		
		
		System.out.println(link2.isDisplayed());
		System.out.println(link2.isEnabled());
		System.out.println(link2.getText());
		
		Thread.sleep(2000);
		
		
		
		WebElement link3=driver.findElement(By.linkText("Try for Free"));
		
		//link3.click();
		
		
		
		System.out.println(link3.isDisplayed());
		System.out.println(link3.isEnabled());
		System.out.println(link3.getText());
		
		Thread.sleep(2000);
		
		
		
		WebElement link4=driver.findElement(By.partialLinkText("Priva"));
		
		//link4.click();
		
		
		
		System.out.println(link4.isDisplayed());
		System.out.println(link4.isEnabled());
		System.out.println(link4.getText());
		
		
		//Thread.sleep(3000);
		
		driver.quit();
		

	}

}
