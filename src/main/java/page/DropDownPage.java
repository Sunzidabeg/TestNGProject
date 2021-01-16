package page;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DropDownPage {
	
	static WebDriver driver;
	

	 public void DropDown() {
		
		
		WebElement element = driver.findElement(By.name("due_month"));
		Select sel1 = new Select (element);
		sel1.selectByVisibleText("Jan");
		
		WebElement firstele = sel1.getFirstSelectedOption();
		System.out.println("first element = "+firstele.getText());
		
		List<WebElement> listoptions = sel1.getOptions();
		for(WebElement WebElement : listoptions) {
			
			System.out.println("Options - " + WebElement.getText());
		}
		
		
		
		
		
			
		}
		
		
	}

	
	

	

	


