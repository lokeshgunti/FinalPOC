package testNG;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest 
{		
	    private WebDriver driver;	
	    
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "D:\\ADS40-As on 01-Dec-2016\\Trainings\\Selenium Training by Bolla & Smitha\\Softwars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();  
		}
		
		@Test				
		public void testEasy() {	
			driver.get("http://newtours.demoaut.com/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Welcome: Mercury Tours")); 	
			System.out.println("Execution is completed successfully");	
		}
		
		@AfterTest
		public void afterTest() {
			//driver.quit();			
		}		
		}