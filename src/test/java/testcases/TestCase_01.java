package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestCase_01{
  @Test
  public void loginWithValidCredential() throws InterruptedException {
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("http://52.38.135.214/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  LoginPage lp = new LoginPage(driver);
	  lp.email("kimi.agarwal@tothenew.com");
	  lp.password("12345678");
	  lp.submit();
	  System.out.println("Logged In successfully");
	  
  }
}
