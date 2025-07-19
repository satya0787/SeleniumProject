package FirstProject.FirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {

	
	
	@Test
	public void firstTest() {
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com");
	
	System.out.println(driver.getTitle());
	
	driver.quit();

	}
	
}
