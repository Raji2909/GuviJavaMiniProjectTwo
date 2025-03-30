package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.Login_pageObjects;

public class Login_testCases {
	@Test
	public void login() {
			System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://thinking-tester-contact-list.herokuapp.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			PageFactory.initElements(driver, Login_pageObjects.class);
			System.out.println("Login Submit button is visible and clickable");
			Login_pageObjects.Email.sendKeys("Holy@gmail.com");
			Login_pageObjects.Password.sendKeys("Holy");
			Login_pageObjects.Submit.click();
			System.out.println("Invalid email and password are restricted");
			driver.navigate().refresh();
			Login_pageObjects.Email.sendKeys("Holy123@gmail.com");
			Login_pageObjects.Password.sendKeys("Holy123");
			Login_pageObjects.Submit.click();
			System.out.println("Login page redirects to the contact list by valid email and password");
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(1));
	        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logout\"]")));element.click();
			System.out.println("Logged out botton is visible and successfully Logged out");
			driver.close();
			}
}