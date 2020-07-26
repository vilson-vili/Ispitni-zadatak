package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AddItemToWishListPage;
import pages.SignUpAccountPage;



public class AddItemToWishListTest {
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

	@Test(priority=1)
	public void LoginAsUSER() {
		
		AddItemToWishListPage New = new AddItemToWishListPage(driver);
		New.LogInAsUser();
}
	@Test(priority=2)
	public void AddItemsToWishListTest() {
		AddItemToWishListPage New = new AddItemToWishListPage(driver);
		New.addItemsToWishList();
		
		}
	@AfterClass
	public void tearDown() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.tearDown();
	}
}
