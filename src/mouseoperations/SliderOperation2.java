package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://jqueryui.com/slider/#colorpicker");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame(0);
	    
	    Thread.sleep(1000);
	    
  WebElement redslider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
  Thread.sleep(1000);
  WebElement greenslider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
  Thread.sleep(1000);
  WebElement blueslider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]"));
  Thread.sleep(1000);
  
   Actions a=new Actions(driver);
   Thread.sleep(3000);
   
   a.clickAndHold(redslider).moveByOffset(200, 0).release().build().perform();
   Thread.sleep(1000);
   a.clickAndHold(greenslider).moveByOffset(200, 0).release().build().perform();
   Thread.sleep(1000);
   a.clickAndHold(blueslider).moveByOffset(200, 0).release().build().perform();
   Thread.sleep(1000);
   a.clickAndHold(redslider).moveByOffset(-100, 0).release().build().perform();
   Thread.sleep(1000);
   a.clickAndHold(greenslider).moveByOffset(-100, 0).release().build().perform();
   Thread.sleep(1000);
   a.clickAndHold(blueslider).moveByOffset(-100, 0).release().build().perform();
       
   
   
   
   
   
   
   
  
	
	
	
	
	}

}
