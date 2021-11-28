package PageObjects.GoogleMaps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObjects.BasePage;

public class GoogleMapsHomeObjects extends BasePage {
	
	public GoogleMapsHomeObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "searchboxinput")
	WebElement SearchBox_TB;
	
	@FindBy(id = "searchbox-searchbutton")
	WebElement SearchIcon_Btn;
	
	@FindBy(className = "aMPvhf-fI6EEc-KVuj8d")
	WebElement Rating_Text;
	
	@FindBy(xpath = "//*[@class='Yr7JMd-pane-hSRGPd' and @jsaction='pane.rating.moreReviews']")
	WebElement Reviews_Text;
	
	@FindBy(xpath = "//*[@data-item-id='address']/div/div[2]/div[1]")
	WebElement Address_Text;
	
}
