package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover 
{

	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver= new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
			
			//first create an object for Actions class
			
			Actions a=new Actions(driver);
			
			Thread.sleep(1000);
			
			a.moveToElement(mouseHover).build().perform();
			
			Thread.sleep(2000);
			
			//WebElement top=driver.findElement(By.xpath("//a[@href='#top']"));
			
			//top.click();
			
			WebElement reload=driver.findElement(By.xpath("(//div[@class='mouse-hover-content']/a)[2]"));
			
			Thread.sleep(2000);
			
			reload.click();
			

	}

}
