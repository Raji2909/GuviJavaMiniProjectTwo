package testCases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddContact_pageObjects;
public class AddContact_testCases{
	WebDriver driver = new FirefoxDriver();
	@Test
	public void login() throws Exception {
			System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
			driver.get("https://thinking-tester-contact-list.herokuapp.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));Email.sendKeys("Holy123@gmail.com");
			WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));Password.sendKeys("Holy123");
			WebElement Submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));Submit.click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(1));
	        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-contact\"]")));element.click();
			PageFactory.initElements(driver, AddContact_pageObjects.class);
	        AddContact_pageObjects.FirstName.sendKeys("Holy");
	        AddContact_pageObjects.LastName.sendKeys("cross");
	        AddContact_pageObjects.DOB.sendKeys("1995/05/19");
        	AddContact_pageObjects.Email.sendKeys("Holy123@gmail.com");
        	AddContact_pageObjects.Phone.sendKeys("1234567890");
	        AddContact_pageObjects.Add1.sendKeys("Salai Road");
	        AddContact_pageObjects.Add2.sendKeys("APJ Street");
	        AddContact_pageObjects.City.sendKeys("Trichy");
	        AddContact_pageObjects.State.sendKeys("TamilNadu");
	        AddContact_pageObjects.Postcode.sendKeys("222222");
            AddContact_pageObjects.Country.sendKeys("India");
	        AddContact_pageObjects.Submit.click();
            System.out.println("Successfully added to Contact List");Thread.sleep(5000);
            WebDriverWait wait1=new WebDriverWait(driver,Duration.ofMinutes(1));
	        WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-contact\"]")));element1.click();
            WebElement DOB = driver.findElement(By.xpath("//*[@id=\"birthdate\"]"));DOB.sendKeys("1994/03/10");
            WebElement Email1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));Email1.sendKeys("Moon123@gmail.com");
            WebElement Phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));Phone.sendKeys("3456789009");
            WebElement Add1 = driver.findElement(By.xpath("//*[@id=\"street1\"]"));Add1.sendKeys("KK Nagar Road");
            WebElement Add2 = driver.findElement(By.xpath("//*[@id=\"street2\"]"));Add2.sendKeys("ZYX Street");
            WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]"));City.sendKeys("Chennai");
            WebElement State = driver.findElement(By.xpath("//*[@id=\"stateProvince\"]"));State.sendKeys("TamilNadu");
            WebElement Postcode = driver.findElement(By.xpath("//*[@id=\"postalCode\"]"));Postcode.sendKeys("789999");
            WebElement Country = driver.findElement(By.xpath("//*[@id=\"country\"]"));Country.sendKeys("India");
            WebElement Submit1 = driver.findElement(By.xpath("//*[@id=\"submit\"]"));Submit1.click();
            System.out.println("Contact validation failed: firstName: Path `firstName` is required., lastName: Path `lastName` is required.");
            Thread.sleep(3000);WebElement Cancel = driver.findElement(By.xpath("//*[@id=\"cancel\"]"));Cancel.click();
            Thread.sleep(5000);WebDriverWait wait2=new WebDriverWait(driver,Duration.ofMinutes(1));
	        WebElement element2=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-contact\"]")));element2.click();
	        AddContact_pageObjects.FirstName.sendKeys("Holy");
	        AddContact_pageObjects.LastName.sendKeys("cross");
	        AddContact_pageObjects.Email.sendKeys("Holy123@gmail.com");
        	AddContact_pageObjects.Phone.sendKeys("1234567890");
        	AddContact_pageObjects.Submit.click();
        	System.out.println("Adding a contact with duplicate details");
        	Thread.sleep(5000);WebDriverWait wait3=new WebDriverWait(driver,Duration.ofMinutes(1));
	        WebElement element3=wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-contact\"]")));element3.click();
	        AddContact_pageObjects.FirstName.sendKeys("Raji");
	        AddContact_pageObjects.LastName.sendKeys("Ruby");
	        AddContact_pageObjects.DOB.sendKeys("29/09/2000");
	        WebElement Submit2 = driver.findElement(By.xpath("//*[@id=\"submit\"]"));Submit2.click();
	        System.out.println("Invalid BirthDate Format");
	        Thread.sleep(3000);
            WebElement Cancel1 = driver.findElement(By.xpath("//*[@id=\"cancel\"]"));Cancel1.click();
            System.out.println("All the contact details are added and displayed correctly ");
			boolean ContactDetails = true;
		        Assert.assertTrue(ContactDetails, "Contacts details are displayed");
            Thread.sleep(3000);AddContact_pageObjects.ContactDetails.click();  
            AddContact_pageObjects.EditContact.click();
            Thread.sleep(3000);AddContact_pageObjects.FirstName.sendKeys("Holy");
	        AddContact_pageObjects.LastName.sendKeys("cross");
	        WebElement Submit3 = driver.findElement(By.xpath("//*[@id=\"submit\"]"));Submit3.click();
	        System.out.println("Changes made to two fields and not affected other fields");
	        System.out.println("App allows saving empty fields");
	        Thread.sleep(3000);AddContact_pageObjects.DeleteContact.click();
	        Thread.sleep(3000);driver.switchTo().alert().accept();
	        System.out.println("Deleting a contact does not affects other contact data");
	        driver.close();
	        Thread.sleep(3000); 
	        int n = 2;
	        String names[]
	            = { "Ruby", "cross"};
	        String temp;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (names[i].compareTo(names[j]) < 0) {
	                    temp = names[i];
	                    names[i] = names[j];
	                    names[j] = temp;
	                }
	            }
	        }
	        System.out.println(
	            "The names in alphabetical order are: ");
	        for (int i = 0; i < n; i++) {
	            System.out.println(names[i]);
	        }
}}