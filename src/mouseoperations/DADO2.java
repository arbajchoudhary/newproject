package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DADO2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		WebElement target=driver.findElement(By.xpath("//div[@id='box3']"));
		Thread.sleep(1000);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='box103']"));
		Thread.sleep(1000);
		
		WebElement target2=driver.findElement(By.xpath("//div[@id='box7']"));
		Thread.sleep(1000);
		
		WebElement source2=driver.findElement(By.xpath("//div[@id='box107']"));
		Thread.sleep(1000);
		/*
		a.clickAndHold(target).moveToElement(source).release().build().perform();
		
		a.clickAndHold(target2).moveToElement(source2).release().build().perform();
		*/
		
		a.dragAndDrop(target, source).build().perform();
		a.dragAndDrop(target2,source2).build().perform();
		Thread.sleep(4000);
		
		
		driver.quit();
		
		
		
		

	}

}
