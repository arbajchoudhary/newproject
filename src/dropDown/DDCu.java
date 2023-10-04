package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDCu 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement currency =driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
        currency.click();
		
		Select s=new Select(currency);
		//s.selectByIndex(1);
		
		List<WebElement> e=s.getOptions();
		/*
		for(int i=0; i<e.size(); i++)
		{
			System.out.println(e.get(i).getText());
			{
				if(e.get(i).getText().equalsIgnoreCase("ind"));
				{
					System.out.println(e.get(i).click());
					break;
				}
			}
		}
		*/
		for(WebElement k:e)
		{
			System.out.println(k.getText());
			{
				if(k.getText().equalsIgnoreCase("usd"));
				{
					k.click();
					break;
				}
			}
		}
		Thread.sleep(2000);
		
		
	}

}
