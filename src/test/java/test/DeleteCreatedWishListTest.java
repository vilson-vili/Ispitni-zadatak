package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DeleteCreatedWishListPage;
import pages.SignUpAccountPage;

public class DeleteCreatedWishListTest {
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
		
		DeleteCreatedWishListPage Del = new DeleteCreatedWishListPage(driver);
		Del.LogInAsUser();
	}
	@Test(priority=2)
	public void deleteWishListTest() {
		DeleteCreatedWishListPage Del = new DeleteCreatedWishListPage(driver);
		Del.deleteWishList();
	}
	@AfterClass
	public void tearDown() {
		SignUpAccountPage home = new SignUpAccountPage(driver);
		home.tearDown();
}
}
