package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTechnique 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		
		username.click();
		username.sendKeys("arbaj");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		
		password.click();
		password.sendKeys("arbaj@123");
		
		WebElement login=driver.findElement(By.cssSelector("input[id='Login']"));
		
		login.click();
		
		Thread.sleep(4000);
		
		WebElement forgotyourpassword=driver.findElement(By.cssSelector("a[id='forgot_password_link']"));
		
		forgotyourpassword.click();
		
		driver.quit();

	}

}
