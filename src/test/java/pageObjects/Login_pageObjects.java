package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pageObjects {
	@FindBy(xpath="//*[@id=\"email\"]")
	 public static WebElement Email;
	@FindBy(xpath="//*[@id=\"password\"]")
	 public static WebElement Password;
	@FindBy(xpath="//*[@id=\"submit\"]")
	public static WebElement Submit;
}
