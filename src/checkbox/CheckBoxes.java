package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes 
{

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement c1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		c1.click();
		System.out.println(c1.isDisplayed());
		System.out.println(c1.isEnabled());
		System.out.println(c1.isSelected());
		
		Thread.sleep(1000);
		
		WebElement c2=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		
		c2.click();
		System.out.println(c2.isDisplayed());
		System.out.println(c2.isEnabled());
		System.out.println(c2.isSelected());
		
		Thread.sleep(1000);
		
		WebElement c3=driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		
		c3.click();
		System.out.println(c2.isDisplayed());
		System.out.println(c2.isEnabled());
		System.out.println(c2.isSelected());
		
		Thread.sleep(1000);
		
		List<WebElement> o=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<o.size(); i++)
		{
			o.get(i).click();
		}
		
		
		System.out.println(c1.getAttribute("value"));
		System.out.println(c2.getAttribute("value"));
		System.out.println(c3.getAttribute("value"));
		
		Thread.sleep(1000);
		driver.quit();
		
		
		
		

	}

}
