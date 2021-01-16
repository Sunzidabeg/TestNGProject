package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class OpenBrowser {
	
	static WebDriver driver;
	
	@BeforeMethod
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\eclipse-workspaceTF\\Selenium\\pracDemo\\driver86\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();
		return driver;
		

}
	
	
}