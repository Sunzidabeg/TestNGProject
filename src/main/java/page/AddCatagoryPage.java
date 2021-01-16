package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class AddCatagoryPage {

	static WebDriver driver;
	
	

	public void Add_Catagory() {

		driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("June2020Batch");
		
		String x = "June2020Batch";
		
		
		Assert.assertEquals("June2020Batch", x);
		
		System.out.println("added catagory:" + "June2020Batch");
		}
	}


