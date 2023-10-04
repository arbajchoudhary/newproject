package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDDL2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement from=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		
		from.click();
		
		WebElement bang=driver.findElement(By.xpath("//a[@value='BLR']"));
		bang.click();
		Thread.sleep(2000);
		
		WebElement jai=driver.findElement(By.xpath("(//a[@value='JAI'])[2]"));
		jai.click();
		

	}

}
