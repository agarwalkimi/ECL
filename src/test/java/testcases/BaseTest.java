package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	public ChromeDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	   driver = new ChromeDriver();
		driver.get("https://gateway-dev.ecaplabs.com/cms/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
