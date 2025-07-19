package FirstProject.FirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second {
	
	public WebDriver driver;
	
	@BeforeTest
	public void DriverSetup() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void SecondTest() {
		driver.get("https://www.google.com");
	}
	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
