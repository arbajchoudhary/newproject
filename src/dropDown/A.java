package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
        WebElement Continents=driver.findElement(By.xpath("//select[@name='continents']"));
		
		Continents.click();
		
		Select s=new Select(Continents);
		
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		//s.selectByVisibleText("Antartica");
		//Thread.sleep(2000);
		
		//to print all option on console window
		
				List<WebElement> e=s.getOptions();
				
				for(int i=0; i<e.size(); i++)
				{
					System.out.println(e.get(i).getText());
				}
				
				//2nd approach...
				//for each loop...
				
				for(WebElement k:e)
				{
					System.out.println(k.getText());
				}
				
				driver.quit();

	}

}
