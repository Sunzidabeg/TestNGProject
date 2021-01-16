package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.AddCatagoryPage;


public class AddCatagoryTest extends AddCatagoryPage {
	WebDriver driver;
	
	
	@BeforeTest
	public void setUP() {
		driver = util.OpenBrowser.init();
		
	}

	@Test
	public void AddCatagory() throws Exception {
			
		driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("June2020Batch");

		Thread.sleep(2000);

				
		}
	

	@AfterTest
	public void teadDown() {

		driver.close();
		driver.quit();
	}
}
