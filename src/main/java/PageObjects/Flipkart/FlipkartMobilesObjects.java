package PageObjects.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObjects.BasePage;

public class FlipkartMobilesObjects extends BasePage {
	
	public FlipkartMobilesObjects(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[text()='Electronics']")
	public WebElement ElectronicsMenu;
	
	@FindBy(xpath = "//*[@title='Mi']")
	public WebElement MiLink;
	
	
	
}
