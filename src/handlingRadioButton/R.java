package handlingRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		 
		WebElement a=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']"));
		
		a.click();
		System.out.println(a.isDisplayed());
		System.out.println(a.isEnabled());
		System.out.println(a.isSelected());
		
		WebElement b=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
		
		b.click();
		System.out.println(b.isDisplayed());
		System.out.println(b.isEnabled());
		System.out.println(b.isSelected());
		
		WebElement c=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_IndArm']"));
		
		c.click();
		System.out.println(c.isDisplayed());
		System.out.println(c.isEnabled());
		System.out.println(c.isSelected());
		
		WebElement d=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_StudentDiscount']"));
		
		d.click();
		System.out.println(d.isDisplayed());
		System.out.println(d.isEnabled());
		System.out.println(d.isSelected());
		
		WebElement e=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Unmr']"));
		
		e.click();
		System.out.println(e.isDisplayed());
		System.out.println(e.isEnabled());
		System.out.println(e.isSelected());
		
        WebElement f=driver.findElement(By.linkText("Special Assistance"));
        Thread.sleep(2000);
        
        
        f.click();
        System.out.println(f.isDisplayed());
        System.out.println(f.isEnabled());
        System.out.println(f.isSelected());
        
        
        
        driver.quit();
        
        
		
		
		

	}

}
