package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parellel {
public 	WebDriver driver;

	@Parameters({"browser"})
	@Test
	public void tc1(String s1) {
		System.out.println(Thread.currentThread().getId()+s1);

		if(s1.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\dev\\Firstday\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
			if(s1.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver","C:\\Users\\user\\Desktop\\dev\\Firstday\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else
				
			{
			
				
			}
				
		driver.get("https://www.google.com");
	}
	@Test
	public void tcs() {
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("painting");

	}
	
	
}
