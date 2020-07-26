package test;

import static org.testng.Assert.assertTrue;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.SignUpAccountPage;
import pages.CreateWishListPage;
import pages.DeleteCreatedWishListPage;
public class SignUpAccountTest {
	
	private static WebDriver driver = null;
	
	
	@BeforeClass
	public static void SignIn() {
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", dir + "\\executable\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php"); 
		//CreateWishListPage CWP = new CreateWishListPage(driver);
		//CWP.LogInAsUser();
		
	}
	//click sign in Link
	@Test(priority=1)
	public void clickSignInLink() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.SignInLink();
		
	}
	//Check that user in on Login page
	@Test(priority=2)
	public void getPageURL() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		Assert.assertEquals(home.verifyUrl(), "http://automationpractice.com/index.php?controller=authentication&back=my-account", "User is not on the Login page.");
	}
	@Test(priority=3)
	//Enter email in "Create an account"  section
	
	public void enterEmailInCreateAccount() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterEmail();
		
	}
	//Click on "Create and account" button
	@Test(priority=4)
	public void clickCreateAnAccountBtn() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.createAnAccountBtn();
	}
	//For Title check MRS
	@Test(priority=5)
	public void clickMrsRadioBtn() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.checkMrs();
		home.clickMrsBtn("Mrs");
	
	}
	@Test(priority=6)
	//Enter first name 
	public void fillFirstName() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterFirstName();
	}
	@Test(priority=7)
	//Enter last name
	public void fillLastName() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterLastName();
}/*
	@Test(priority=8)
	//Verify that displayed email is the same as one user enter in step 4 
	public void verifyEmail() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.getEmail();
		String emailValue = home.getEmail();
		Assert.assertEquals(emailValue, home.email, "Emails are not equal.");

	}*/
	
	
	@Test(priority=9)
	//Enter password
	public void fillPassword() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterPassword();
		
}
	@Test(priority=10)
	//Select Date of Birth
	public void selectDayTest() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.selectDay();
	}
	@Test(priority=11)
	public void selectMonthTest() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.selectMonth();
		
	}
	@Test(priority=12)
	public void selectYearTest() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.selectYear();
	}
	
	//Validate that Sign up for … is checked //is selected
	@Test(priority=13)
	public void CheckIsSignUpForNewsletterSelected() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		Assert.assertTrue(home.isSignUpForNewsletterSelected(),"Sign up for our newsletter is not selected");
		
	}
	@Test(priority=14)
	//Validate that Received special off… is unchecked  locator id="optin"
public void checkisReceivedspecialOfferUnchecked() {
	SignUpAccountPage home = new SignUpAccountPage(driver);
	//home.isReceivedspecialOfferUnchecked();
	Assert.assertFalse(home.isReceivedspecialOfferUnchecked(), "Received special off… is unchecked");
	}
	@Test(priority=15)
	public void fillInCompany() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterCompany();
	}
	@Test(priority=16)
	public void fillInAddress() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterAddress();
}

	@Test(priority=17)
	public void fillInSecondAddress() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterSecondAddress();
}
	@Test(priority=18)
	public void fillInCityNY() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterCityNY();
}

	@Test(priority=19)
	//For state select Alabama locator id="id_state"
	public void IsAlabamaSelected() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		Assert.assertEquals(home.isAlabamaSelected(), "Alabama", "Alabama is not selected in dropdown menu");
	}
	@Test(priority=20)
	public void fillInZipCode() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterZipCode();
	}

	@Test(priority=21)
	//For country select United States
	public void isUSASelected() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		Assert.assertEquals(home.IsUSAChecked(), "United States", "United States is not selected in dropdown menu");
	}
	@Test(priority=22)
	public void fillInAdditionalInf() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterAdditionalInf();
}
	@Test(priority=23)
	//enterMobilePhone
	public void fillInMobilePhone() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterMobilePhone();
}
	@Test(priority=24)
	//enterAssignAndAddress
	public void fillInAssignAndAddress() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.enterAssignAndAddress();
}
	@Test(priority=25)
	public void clickRegisterButton() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.clickRegisterBtn();
	}
	@Test(priority=26)
	public void verifyAccountUrl() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		Assert.assertEquals(home.verifyAccountPage(), "http://automationpractice.com/index.php?controller=my-account", "User is not on Account page.");
	}
	@Test(priority=27)
	public void clickLogOutBtn() {
	SignUpAccountPage home = new SignUpAccountPage(driver);
	home.logOut();
	}
	@Test(priority=28)
	public void verifyLoginPageUrl() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		Assert.assertEquals(home.verifyLoginPage(), "http://automationpractice.com/index.php?controller=authentication&back=my-account", "User is not on Login page");
}
	
	@AfterClass
	public void tearDown() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.tearDown();

}
}
