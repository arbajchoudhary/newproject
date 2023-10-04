package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement manualtester=driver.findElement(By.xpath("(//input[@name='profession'])[1]"));
		
		Thread.sleep(1000);
		manualtester.click();
		System.out.println(manualtester.isDisplayed());
		System.out.println(manualtester.isEnabled());
		System.out.println(manualtester.isSelected());
		Thread.sleep(1000);
		
        WebElement automationtester=driver.findElement(By.xpath("(//input[@name='profession'])[2]"));
		
		Thread.sleep(1000);
		automationtester.click();
		System.out.println(automationtester.isDisplayed());
		System.out.println(automationtester.isEnabled());
		System.out.println(automationtester.isSelected());
		Thread.sleep(1000);
		
		WebElement RC=driver.findElement(By.xpath("(//input[@name='tool'])[1]"));
		
		Thread.sleep(1000);
		RC.click();
		System.out.println(RC.isDisplayed());
		System.out.println(RC.isEnabled());
		System.out.println(RC.isSelected());
		Thread.sleep(1000);
		
		WebElement seleniumIDE=driver.findElement(By.xpath("(//input[@name='tool'])[2]"));
		Thread.sleep(1000);
		
		seleniumIDE.click();
		System.out.println(seleniumIDE.isDisplayed());
		System.out.println(seleniumIDE.isEnabled());
		System.out.println(seleniumIDE.isSelected());
		Thread.sleep(1000);
		
		WebElement seleniumwebdriver=driver.findElement(By.xpath("(//input[@name='tool'])[3]"));
		Thread.sleep(1000);
		seleniumwebdriver.click();
		System.out.println(seleniumwebdriver.isDisplayed());
		System.out.println(seleniumwebdriver.isEnabled());
		System.out.println(seleniumwebdriver.isSelected());
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
