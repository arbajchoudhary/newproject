package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.unipune.ac.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement e=driver.findElement(By.xpath("//span[@id='stUI5_txt']"));
		
		WebElement e1=driver.findElement(By.xpath("//span[@id='stUI42_txt']"));
		
		WebElement e2=driver.findElement(By.xpath("//span[@id='stUI184_txt']"));
		
		WebElement e3=driver.findElement(By.xpath("//span[@id='stUI194_txt']"));
		
		WebElement e4=driver.findElement(By.xpath("//span[@id='stUI215_txt']"));
		
		WebElement e5=driver.findElement(By.xpath("//span[@id='stUI229_txt']"));
		
		WebElement e6=driver.findElement(By.xpath("//span[@id='stUI253_txt']"));
		
		WebElement e7=driver.findElement(By.xpath("//span[@id='stUI277_txt']"));
		
		//first create an object for Actions class
		
		Actions a=new Actions(driver);
		
		Thread.sleep(1000);
		
		a.moveToElement(e).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e1).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e2).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e3).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e4).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e4).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e5).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e6).build().perform();
		Thread.sleep(2000);
		a.moveToElement(e7).build().perform();
		Thread.sleep(2000);
		
		WebElement studymaterials=driver.findElement(By.xpath("//span[@id='stUI284_txt']"));
		Thread.sleep(2000);
		
		
		studymaterials.click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
