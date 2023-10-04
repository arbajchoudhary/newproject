package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		        WebDriver driver=new ChromeDriver();
		
		        driver.get("https://jqueryui.com/droppable/");
		
		        driver.manage().window().maximize();
		
		        Thread.sleep(2000);
		
		        //to create actions class
				Actions a=new Actions(driver);
				
				driver.switchTo().frame(0);
				// to enter into the frame.......
				
				WebElement target=driver.findElement(By.xpath("//div[@id='draggable']"));
				Thread.sleep(1000);
				
				WebElement source=driver.findElement(By.xpath("//div[@id='droppable']"));
				Thread.sleep(1000);
				
				//a.clickAndHold(target).moveToElement(source).release().build().perform();
				
				/*
				a.clickAndHold(target).build().perform();
				
				a.moveToElement(source).build().perform();
				
				a.release().build().perform();

		       */
				
				a.dragAndDrop(target, source).build().perform();
				
		

	}

}
