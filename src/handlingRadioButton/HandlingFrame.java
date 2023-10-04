package handlingRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		//to enter into a specific frame
		
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("/html/body/main/ul/li[3]/a"));
		
		e.click();
	    Thread.sleep(4000);
	    System.out.println(e.getText());
	    Thread.sleep(1000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(1000);
	    
	    driver.switchTo().frame("classFrame");
	    Thread.sleep(1000);
	    
	    WebElement e1=driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[5]/a"));
	    Thread.sleep(1000);
	    System.out.println(e1.getText());
	    Thread.sleep(1000);
	    e1.click();
	   
	   
	    
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	    
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame(1);
	    Thread.sleep(2000);
	    
	    WebElement e2=driver.findElement(By.xpath("/html/body/main/ul/li[1]/a"));
	   
	    
	    System.out.println(e2.getText());
	    e2.click();
	    Thread.sleep(1000);
	    
	    driver.quit();
		

	}

}
