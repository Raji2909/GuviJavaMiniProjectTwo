package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContact_pageObjects {
	@FindBy(xpath="//*[@id=\"add-contact\"]")
	 public static WebElement AddNewContact;
	@FindBy(xpath="//*[@id=\"firstName\"]")
	 public static WebElement FirstName;
	@FindBy(xpath="//*[@id=\"lastName\"]")
	public static WebElement LastName;
	@FindBy(xpath="//*[@id=\"birthdate\"]")
	public static WebElement DOB;
	@FindBy(xpath="//*[@id=\"email\"]")
	public static WebElement Email;
	@FindBy(xpath="//*[@id=\"phone\"]")
	public static WebElement Phone;
	@FindBy(xpath="//*[@id=\"street1\"]")
	public static WebElement Add1;
	@FindBy(xpath="//*[@id=\"street2\"]")
	public static WebElement Add2;
	@FindBy(xpath="//*[@id=\"city\"]")
	public static WebElement City;
	@FindBy(xpath="//*[@id=\"stateProvince\"]")
	public static WebElement State;
	@FindBy(xpath="//*[@id=\"postalCode\"]")
	public static WebElement Postcode;
	@FindBy(xpath="//*[@id=\"country\"]")
	public static WebElement Country;
	@FindBy(xpath="//*[@id=\"submit\"]")
	public static WebElement Submit;
	@FindBy(xpath="/html/body/div/div/table/tr[1]/td[2]")
	public static WebElement ContactDetails;
	@FindBy(xpath="//*[@id=\"edit-contact\"]")
	public static WebElement EditContact;
	@FindBy(xpath="//*[@id=\"delete\"]")
	public static WebElement DeleteContact;
}
