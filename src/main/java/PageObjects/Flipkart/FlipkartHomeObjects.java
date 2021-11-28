package PageObjects.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObjects.BasePage;

public class FlipkartHomeObjects extends BasePage {
	
	public FlipkartHomeObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@class='_2KpZ6l _2doB4z']")
	public WebElement LogingModalCloseIcon;
	
	@FindBy(xpath = "//*[@alt='Mobiles']")
	public WebElement MobilesMenu;
	
	@FindBy(xpath = "//*[@alt='Electronics']")
	public WebElement ElectronicsMenu;
	
	
	
}
