package otherwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passenger {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	     
		WebElement passenger=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		
		passenger.click();
		
		Thread.sleep(2000);
		
		WebElement e=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		Thread.sleep(2000);
		/*
		 * for(int i=0; i<=4; i++) { e.click(); }
		 */
		e.click();
		e.click();
		e.click();
		e.click();
		e.click();
		e.click();
		e.click();
		e.click();
		e.click();
		Thread.sleep(1000);
		driver.switchTo().alert();
		//to shift focus on alert
		
		Thread.sleep(2000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		//to accept the alert
		
		//driver.switchTo().alert().dismiss();
		//to reject the alert
		Thread.sleep(2000);
		System.out.println("handled alert successfully");
		driver.quit();
		

	}

}
