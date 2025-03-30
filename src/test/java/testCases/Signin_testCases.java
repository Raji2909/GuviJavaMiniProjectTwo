package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.Signin_pageObjects;

public class Signin_testCases {
	@Test
	public void signin() {
    System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Mozilla Firefox");
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	PageFactory.initElements(driver, Signin_pageObjects.class);
	Signin_pageObjects.signup.click();
	System.out.println("SignUp botton is visible,clickable and the page redirects to Add User Page");
	Signin_pageObjects.Firstname.sendKeys("Holy");
	Signin_pageObjects.Lastname.sendKeys("cross");
	Signin_pageObjects.Email.sendKeys("Holy123@gmail.com");
	Signin_pageObjects.Password.sendKeys("Holy123");
	Signin_pageObjects.Submit.click();
	System.out.println("SignUp Successfully");
	driver.close();

}
}
