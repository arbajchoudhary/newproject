package otherwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_operation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		//first approach
		//js.executeScript("window.scrollBy(0,500)","");
		
		//second approach
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		//js.executeScript("arguments[0].scrollIntoView();",mouseHover);

		//third approach
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

	}

}
