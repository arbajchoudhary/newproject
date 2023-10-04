package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement rightslider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		Thread.sleep(1000);
		
		WebElement leftslider=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		
		a.clickAndHold(rightslider).moveByOffset(100, 0).release().build().perform();
		Thread.sleep(1000);
		a.clickAndHold(rightslider).moveByOffset(-100, 0).release().build().perform();
		Thread.sleep(1000);
		
		a.clickAndHold(leftslider).moveByOffset(100, 0).release().build().perform();
		Thread.sleep(1000);
		a.clickAndHold(leftslider).moveByOffset(-100, 0).release().build().perform();
		
		driver.quit();
		
		
		
		
		

	}

}
