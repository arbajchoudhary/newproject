package handlingRadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperations 
{

	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	   
	   driver.manage().window().maximize();
	   
	   Thread.sleep(2000);
	   
	   WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	   
	   firstname.click();
	   
	   firstname.sendKeys("Rahul Shetty");
	   
	   Thread.sleep(2000);
	   
	   firstname.sendKeys(Keys.CONTROL+"a");
	   Thread.sleep(2000);
	   firstname.sendKeys(Keys.CONTROL+"c");
	   
	   Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.click();
		Thread.sleep(1000);
		lastname.sendKeys(Keys.CONTROL+"v");

		Thread.sleep(1000);

		//lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.ARROW_LEFT);
		lastname.sendKeys(Keys.ARROW_LEFT);
		lastname.sendKeys(Keys.ARROW_LEFT);
		lastname.sendKeys(Keys.ARROW_LEFT);
		lastname.sendKeys(Keys.ARROW_LEFT);
		lastname.sendKeys(Keys.ARROW_LEFT);
		

		Thread.sleep(2000);

		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		lastname.sendKeys(Keys.BACK_SPACE);
		
		

		Thread.sleep(2000);

		lastname.sendKeys(Keys.CONTROL+"a");
		lastname.sendKeys(Keys.DELETE);

		Thread.sleep(2000);

		lastname.sendKeys(Keys.ARROW_UP);

		//firstname.sendKeys(Keys.ARROW_DOWN);


	}

}
