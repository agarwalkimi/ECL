package pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserListingPage {
	@Test
	 
	public void heading() {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://gateway-dev.ecaplabs.com/cms/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		LoginPage lp= new LoginPage(driver); lp.email("kimi.agarwal@tothenew.com");
		lp.password("12345678"); 
		lp.submit();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		String ab = driver.findElement(By.xpath("//*[@class='chakra-heading css-1dklj6k']")).getText();
		System.out.println("refer:"+ab);
		String expectedTitle = "User Listing";
		assertEquals(ab, expectedTitle, "Page title does not match the expected value");

	}
}
