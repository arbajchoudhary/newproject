package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		        WebDriver driver=new ChromeDriver();
		
		        driver.get("https://jqueryui.com/slider/");
		
		        driver.manage().window().maximize();
		
		        Thread.sleep(2000);
		
		        //to enter inside a frame
		
				//driver.switchTo().frame(0);
				
				//another approach to locate frame.....
				
				WebElement f=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				
				driver.switchTo().frame(f);
				
				Thread.sleep(1000);
				
				WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
				
				Thread.sleep(2000);
				
				//1st...compusory
				
				Actions a=new Actions(driver);
				
				Thread.sleep(1000);
				
				/*
				a.clickAndHold(slider).build().perform();
				
				Thread.sleep(1000);
				
				a.moveByOffset(100, 0).build().perform();
				
				Thread.sleep(1000);
				
			    a.release().build().perform();
				*/
				
				a.clickAndHold(slider).moveByOffset(200, 0).release().build().perform();
				
			    Thread.sleep(2000);
			    
			    a.clickAndHold(slider).moveByOffset(-100, 0).release().build().perform();
			    

	}

}
