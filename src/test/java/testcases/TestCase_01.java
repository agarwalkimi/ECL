package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TestCase_01 extends BaseTest {
	@Test
	public void loginWithValidCredential() throws InterruptedException {
		LoginPage lp= new LoginPage(driver); 
		lp.email("kimi.agarwal@tothenew.com");
		lp.password("12345678"); 
		lp.submit();
		System.out.println("Logged In successfully");
		
	}
}
