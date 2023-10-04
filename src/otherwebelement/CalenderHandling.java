package otherwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        WebElement calButton=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		
		calButton.click();
		
		Thread.sleep(1000);
		
		List<WebElement> e1=driver.findElements(By.xpath("//td[@data-month='7']"));

		Thread.sleep(1000);
		
		/*
		for(int i=0; i<e1.size(); i++)
		{
			System.out.println(e1.get(i).getText());
			{
				if(e1.get(i).getText().equalsIgnoreCase("24"))
				{
					e1.get(i).click();
					break;
				}
			}
		}
		*/
		
		//2nd approach
		//for each loop
		
		
		for(WebElement k:e1)
		{
			System.out.println(k.getText());
			{
				if(k.getText().equalsIgnoreCase("31"))
				{
					k.click();
					break;
				}
			}
		}
		
		
		//System.out.println(e1.get(2).getText());
		
		

	}

}
