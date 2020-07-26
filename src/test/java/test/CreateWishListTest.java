package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateWishListPage;
import pages.SignUpAccountPage;

public class CreateWishListTest {
	private static WebDriver driver = null;
	@BeforeClass
	public static void SignIn() {
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", dir + "\\executable\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php"); 
	}

	@Test(priority=29)
	public void LogInWithEmailAndPasword() {
	
	CreateWishListPage Wish = new CreateWishListPage(driver);
	Wish.LogInAsUser();
}
	@Test(priority=30)
	public void createWishListTest() {
		CreateWishListPage Wish = new CreateWishListPage(driver);
		Wish.createWishList();
	}	
	@Test(priority=31)
	public void checkNumberOfWishListInTable() {
		CreateWishListPage Wish = new CreateWishListPage(driver);
		//Wish.createWishList();
		//int numberOfRows = Wish.numberOfWishListInTable();
		//int expectedNumberOfRows = 3;
		Assert.assertEquals(Wish.numberOfWishListInTable(), 3, "Number of wish lists in table not as expected." );
		
	}
	
	@AfterClass
	public void tearDown() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.tearDown();
}
}
