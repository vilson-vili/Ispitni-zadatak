package pages;

import java.awt.Component;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateWishListPage {
	private WebDriver driver;
	
	private By signinLocator = By.className("login");
	private By emailForLogINLocator = By.id("email");
	private By passForLogIN = By.id("passwd");
	private By logINLocator = By.id("SubmitLogin");
	
	private By myWishListBtn = By.cssSelector("#center_column > div > div:nth-child(2) > ul > li > a > span");
	private By nameWishList = By.id("name");
	private By submitWishListBtn = By.id("submitWishlist");
	private By tableLocator = By.className("table table-bordered");
	//table table-bordered
	//private By tableLocator = By.xpath("//*[@class=\"table table-bordered\"]");
	
	private String emailLogIn = "lili.vanili@hotmail.com";
	private String passwordLogIn = "SemsaSuljakovic123";
	
	//constructor 
    public CreateWishListPage(WebDriver driver) {
	this.driver = driver;

}
  //Log in  as previously created user 
    public void LogInAsUser() {
    	driver.findElement(signinLocator).click();
    	driver.findElement(emailForLogINLocator).sendKeys(emailLogIn);
    	driver.findElement(passForLogIN).sendKeys(passwordLogIn);
    	driver.findElement(logINLocator).click();
    }
    
    //create wish list 
    public void createWishList() {
    	driver.findElement(myWishListBtn).click();
    	driver.findElement(nameWishList).sendKeys("First Wish List");
    	driver.findElement(submitWishListBtn).click();
    	driver.findElement(nameWishList).sendKeys("Second Wish List");
    	driver.findElement(submitWishListBtn).click();
    	driver.findElement(nameWishList).sendKeys("Third Wish List");
    	driver.findElement(submitWishListBtn).click();
    }
    //Verify that 3 new lists are displayed in a table—
    public int numberOfWishListInTable() {
    	//return driver.findElement(tableLocator).getSize();
    	//return Integer.parseInt(driver.findElement(tableLocator).getText()); 
    	
    	List<WebElement> table = driver.findElements(tableLocator);
    	return table.size();  	
    }
   
    public void tearDown () {
    	driver.quit();
    }
}
