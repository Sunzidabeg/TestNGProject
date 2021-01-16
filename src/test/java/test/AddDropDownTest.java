package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.DropDownPage;

public class AddDropDownTest extends DropDownPage {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = util.OpenBrowser.init();
		
	}
	
	@Test
	public void test() throws Exception {
		
		WebElement element = driver.findElement(By.name("due_month"));
		Select sel1 = new Select (element);
		sel1.selectByVisibleText("Jan");
		
		Thread.sleep(2000);
		
		WebElement firstele = sel1.getFirstSelectedOption();
		System.out.println("first element = "+firstele.getText());
		
		List<WebElement> listoptions = sel1.getOptions();
		for(WebElement WebElement : listoptions) {
			
			System.out.println("Options - " + WebElement.getText());
		}
		
		
	}
	
	
	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();
	}
		
	}


