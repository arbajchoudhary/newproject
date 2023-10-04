package otherwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_operation2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver=new ChromeDriver();
		
		    driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		    driver.manage().window().maximize();
		
		    Thread.sleep(2000);
		
		    JavascriptExecutor js=(JavascriptExecutor)driver;
			
			Thread.sleep(2000);
			
			//first approach
			//js.executeScript("window.scrollBy(0,500)","");
			
			//second approach
			WebElement button=driver.findElement(By.xpath("//button[@name='submit']"));
			
			//js.executeScript("arguments[0].scrollIntoView();",button);

			//third approach
			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			

	}

}
