package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemToWishListPage {
	
		private WebDriver driver;
		private By signinLocator = By.className("login");
		private By emailForLogINLocator = By.id("email");
		private By passForLogIN = By.id("passwd");
		private By logINLocator = By.id("SubmitLogin");
		
		private String emailLogIn = "lili.vanili@hotmail.com";
		private String passwordLogIn = "SemsaSuljakovic123";
		
		private By myWishListBtn = By.cssSelector("#center_column > div > div:nth-child(2) > ul > li > a > span");
		private By deleteBtn = By.className("icon-remove");
		
		private By womenBtnLocator = By.className("sf-with-ul");
		private By BlouseLocator = By.xpath("//a[@href=\"http://automationpractice.com/index.php?id_category=7&amp;controller=category\"");
		private By wishListLocator = By.className("addToWishlist wishlistProd_2");
		//addToWishlist wishlistProd_2
		//constructor
			public AddItemToWishListPage(WebDriver driver) {
				this.driver = driver;
	}
			public void LogInAsUser() {
				driver.findElement(signinLocator).click();
		    	driver.findElement(emailForLogINLocator).sendKeys(emailLogIn);
		    	driver.findElement(passForLogIN).sendKeys(passwordLogIn);
		    	driver.findElement(logINLocator).click();
			    driver.findElement(myWishListBtn).click();
			   

			}
			public void addItemsToWishList() {
				
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,900)", "");
				
		        //hover over img
		        Actions builder = new Actions (driver);
		        WebElement target = driver.findElement(BlouseLocator);
		        builder.moveToElement(target).perform();
		        driver.findElement(wishListLocator).click();
		        
							
			}
			public void tearDown () {
				driver.quit();
			}
	}
