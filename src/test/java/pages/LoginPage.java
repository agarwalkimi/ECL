package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
	public void email(String email) {
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys(email);
	}

	public void password(String password) {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
	}

	public void submit() {
		WebElement button = driver.findElement(By.xpath(" //button[@type='submit']"));
		button.click();
	}
}
