package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAp 
{

	public static void main(String[] args)throws InterruptedException 
	{
	
				WebDriver driver=new ChromeDriver();
				// to launch the browser.......

				driver.get("https://www.amazon.in/");
				// to launch the web page............

				driver.manage().window().maximize();
				// to maximize the web page

				Thread.sleep(3000);
				// to pause operation for some time

				driver.manage().window().minimize();
				// to minimize the web page

				driver.close();
				// to exit the web page
			}

		

	}


