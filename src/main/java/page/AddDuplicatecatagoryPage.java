package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddDuplicatecatagoryPage {

	static WebDriver driver;

	
	public void AddDuplicatecatagory() {

	
		driver.findElement(By.xpath("//input[@name='categorydata']")).sendKeys("June2020Batch");
		driver.findElement(By.xpath("//input[@value='Add category']")).click();
	

	
	}

}
