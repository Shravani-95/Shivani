package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Login {
	public WebDriver driver;
	
	@BeforeMethod
	
	public void openappl()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
	}
	
	@AfterMethod
	public void closeappln()
	{
		driver.quit();
	}

}
