package handlingRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderButton 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement male=driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();
		System.out.println(male.isDisplayed());
		System.out.println(male.isEnabled());
		System.out.println(male.isSelected());
		
		Thread.sleep(1000);
		
		WebElement female=driver.findElement(By.xpath("//input[@value='Female']"));
		female.click();
		System.out.println(female.isDisplayed());
		System.out.println(female.isEnabled());
	    System.out.println(female.isSelected());
	    
	    Thread.sleep(1000);
	    
	    driver.close();
		
		
		
		

	}

}
