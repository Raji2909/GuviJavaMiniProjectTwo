package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin_pageObjects {
	@FindBy(xpath="//*[@id=\"signup\"]")
	 public static WebElement signup;
	@FindBy(xpath="//*[@id=\"firstName\"]")
	 public static WebElement Firstname;
	@FindBy(xpath="//*[@id=\"lastName\"]")
	public static WebElement Lastname;
	@FindBy(xpath="//*[@id=\"email\"]")
	public static WebElement Email;
	@FindBy(xpath="//*[@id=\"password\"]")
	public static WebElement Password;
	@FindBy(xpath="//*[@id=\"submit\"]")
	public static WebElement Submit;
}
