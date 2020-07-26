package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCreatedWishListPage {
	private WebDriver driver;
	
	private By signinLocator = By.className("login");
	private By emailForLogINLocator = By.id("email");
	private By passForLogIN = By.id("passwd");
	private By logINLocator = By.id("SubmitLogin");
	
	private String emailLogIn = "lili.vanili@hotmail.com";
	private String passwordLogIn = "SemsaSuljakovic123";
	
	private By myWishListBtn = By.cssSelector("#center_column > div > div:nth-child(2) > ul > li > a > span");
	private By deleteBtn = By.className("icon-remove");
	
	
	//constructor
	public DeleteCreatedWishListPage(WebDriver driver) {
		this.driver = driver;

}
	public void LogInAsUser() {
		driver.findElement(signinLocator).click();
    	driver.findElement(emailForLogINLocator).sendKeys(emailLogIn);
    	driver.findElement(passForLogIN).sendKeys(passwordLogIn);
    	driver.findElement(logINLocator).click();
	    driver.findElement(myWishListBtn).click();
	}
	public void deleteWishList() {
		
		
		driver.findElement(deleteBtn).click();
		driver.switchTo().alert().accept();
	}
	
	public void tearDown () {
		driver.quit();
	}
	
}

