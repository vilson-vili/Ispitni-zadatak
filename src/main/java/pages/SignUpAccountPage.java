package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUpAccountPage {
private WebDriver driver;

private By signinLocator = By.className("login");
private By emailLocator = By.id("email_create");
private By accountBtnLocator = By.id("SubmitCreate");

private By mrsLocator = By.id("id_gender2");
private By firstNameLocator = By.id("customer_firstname");
private By lastNameLocator = By.id("customer_lastname");
private By passwordLocator = By.id("passwd");
private By DOBdaysLocator = By.id("days");
private By DOBmonthLocator = By.id("months");
private By DOByearLocator = By.id("years");

private By signUpForNewsletterLocator = By.id("newsletter");
private By specialOffersLocator = By.id("optin");

private By companyLocator = By.id("company");
private By addressLocator = By.id("address1");
private By secondAddressLocator = By.id("company");
private By cityLocator = By.id("city");


private By stateLocator = By.id("id_state"); 
private By zipCodeLocator = By.id("postcode");
private By countryLocator = By.id("id_country");

private By AdditionalinformationLocator = By.id("other"); 
private By mobilephoneLocator = By.id("phone_mobile");
private By AssignanAddressLocator = By.id("alias");
private By RegisterBtnLocator = By.id("submitAccount");  
private By logOutLocator = By.xpath("//a[@href=\"http://automationpractice.com/index.php?mylogout=\"]"); 



public String email = "lili.vanili@hotmail.com";
private String password = "SemsaSuljakovic123";

private String firstname = "Vila";
private String lastName = "Lila";
private String company = "Ernest and Young";
private String address = "Zmaja od Bosne 1";
private String city = "New York";
private String zipcode = "12345";
private String AdditionalInf = "Nesto";
private String mobileNo = "123456";
private String AssignanAddress = "Zmaja od Bosne 2";


//constructor 
    public SignUpAccountPage(WebDriver driver) {
	this.driver = driver;
}
//click sign in Link
public void SignInLink() {
	driver.findElement(signinLocator).click();
}
//Check that user in on Login page
public String verifyUrl() {
	return driver.getCurrentUrl(); 
}
//Enter email in "Create an account"  section
public void enterEmail() {
	driver.findElement(emailLocator).sendKeys(email);		
} 
//Click on "Create and account" button
public void createAnAccountBtn() {
	driver.findElement(accountBtnLocator).click();
}
//For Title check MRS
public void checkMrs() {
	driver.findElement(mrsLocator).click();
	System.out.println("Mrs button is selected");
}
public void clickMrsBtn(String string) {
	// TODO Auto-generated method stub	
}
//Enter first name 
public void enterFirstName() {
	driver.findElement(firstNameLocator).sendKeys(firstname);
}
//Enter last name
public void enterLastName() {
	driver.findElement(lastNameLocator).sendKeys(lastName);
}/*
//Verify that displayed email is the same as one user enter in step 4
public String getEmail() {
	WebElement EM = driver.findElement(emailLocator);
	String emailValue = EM.getAttribute("value");
	System.out.println("Email: "  + emailValue);
	return emailValue;
}*/

//Enter password
public void enterPassword() {
	driver.findElement(passwordLocator).sendKeys(password);
}
//Select Date of Birth
public String selectDay() {
	Select dayDropdown = new Select(driver.findElement(DOBdaysLocator));
			dayDropdown.selectByValue("19");
			WebElement option = dayDropdown.getFirstSelectedOption();
			return option.getText();
}
public String selectMonth() {
	Select monthDropdown = new Select(driver.findElement(DOBmonthLocator));
	monthDropdown.selectByValue("7");
			WebElement option = monthDropdown.getFirstSelectedOption();
			return option.getText();
	
}
public String selectYear() {
	Select yearDropdown = new Select(driver.findElement(DOByearLocator));
	yearDropdown.selectByValue("1990");
			WebElement option = yearDropdown.getFirstSelectedOption();
			return option.getText();
}


//Check - Sign up for our Newsletter
//Validate that Sign up for … is checked //is selected
public boolean isSignUpForNewsletterSelected() {
	driver.findElement(signUpForNewsletterLocator).click();
	return driver.findElement(signUpForNewsletterLocator).isSelected();
}
//Validate that Received special off… is unchecked  locator id="optin"
public boolean isReceivedspecialOfferUnchecked() {
	driver.findElement(specialOffersLocator).isSelected();
	//System.out.println("Received special off… is unchecked");
	return driver.findElement(specialOffersLocator).isSelected();
	
}
//Enter company
public void enterCompany() {
	driver.findElement(companyLocator).sendKeys(company);
	
}
//Fill in address
public void enterAddress() {
	driver.findElement(addressLocator).sendKeys(address);
}
 
//Leave Addess (Line 2) empty
public void enterSecondAddress() {
	driver.findElement(secondAddressLocator).sendKeys("   ");
}
//city enter New York
public void enterCityNY() {
	driver.findElement(cityLocator).sendKeys(city);
}

//For state select Alabama locator id="id_state" 
public String isAlabamaSelected() {
	Select stateDropDown = new Select(driver.findElement(stateLocator));
	stateDropDown.selectByVisibleText("Alabama");
	WebElement option = stateDropDown.getFirstSelectedOption();
	return option.getText();
}
//Enter zip code  
public void enterZipCode() {
	driver.findElement(zipCodeLocator).sendKeys(zipcode);
}
//For country select United States locator id="id_country" 
public String IsUSAChecked() {
	Select countryDropDown = new Select(driver.findElement(countryLocator));
	countryDropDown.selectByVisibleText("United States");
	WebElement country = countryDropDown.getFirstSelectedOption();
	return country.getText();
}
//Fill in Additional information  
public void enterAdditionalInf() {
	driver.findElement(AdditionalinformationLocator).sendKeys(AdditionalInf);
}
//Fill in mobile phone locator 
public void enterMobilePhone() {
	driver.findElement(mobilephoneLocator).sendKeys(mobileNo);
}
//Fill in Assign and address alias
public void enterAssignAndAddress() {
	driver.findElement(AssignanAddressLocator).sendKeys(AssignanAddress);
}
//Click on Register button
public void clickRegisterBtn() {
	driver.findElement(RegisterBtnLocator).click();
}
//Verify that user is on Account page
public String verifyAccountPage() {
	return driver.getCurrentUrl();
	}
//Log out
public void logOut() {
	driver.findElement(logOutLocator).click();
}
//Verify that user is on Login page
public String verifyLoginPage() {
	return driver.getCurrentUrl();

	
}

public void tearDown () {
	driver.quit();
}
}
