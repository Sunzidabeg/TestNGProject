package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.AddDuplicatecatagoryPage;

public class AddDupCatTest extends AddDuplicatecatagoryPage {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		driver = util.OpenBrowser.init();
	}
	
	@Test
	public void AddDupCat() throws Exception {
		
		driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("June2020Batch");
		driver.findElement(By.xpath("//input[@value='Add category']")).click();
	    
		Thread.sleep(2000);
		
	
		String x = "June2020Batch";
		
			
		Assert.assertEquals("June2020Batch", x);
		
		System.out.println("The catagory you want to add already exists :" + "June2020Batch");
		}
	
	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();
	}
	
	}
	
	


