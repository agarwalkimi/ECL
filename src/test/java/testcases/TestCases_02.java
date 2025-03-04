package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestCases_02 extends BaseTest {
  @Test
  public void loginWithInvalidCredentials() {
		LoginPage lp= new LoginPage(driver); 
		lp.email("agarwal@tothenew.com");
		lp.password("1234567"); 
		lp.submit();
		System.out.println("Not logged In successfully");
  }
}
