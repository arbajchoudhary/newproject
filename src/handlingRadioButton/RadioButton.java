package handlingRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement r1=driver.findElement(By.xpath("//input[@value='radio1']"));
		
		r1.click();
		System.out.println(r1.isDisplayed());
		System.out.println(r1.isEnabled());
		System.out.println(r1.isSelected());
		
		
		WebElement r2=driver.findElement(By.xpath("//input[@value='radio2']"));
		
		r2.click();
		System.out.println(r2.isDisplayed());
		System.out.println(r2.isEnabled());
		System.out.println(r2.isSelected());
		
		
		WebElement r3=driver.findElement(By.xpath("//input[@value='radio3']"));
		
		r3.click();
		System.out.println(r3.isDisplayed());
		System.out.println(r3.isEnabled());
		System.out.println(r3.isSelected());
		
		driver.quit();
		
		
		
		
		

	}

}
