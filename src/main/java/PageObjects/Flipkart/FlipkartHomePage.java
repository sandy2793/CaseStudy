package PageObjects.Flipkart;

import static Utility.WebDriverUtils.*;
import org.openqa.selenium.WebDriver;

public class FlipkartHomePage extends FlipkartHomeObjects {
	
	public FlipkartHomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public void Click(String label) throws Throwable {
		switch (label) {
		case "Login Modal Close":
			element = LogingModalCloseIcon;
			break;
			
		case "Mobiles":
			element = MobilesMenu;
			break;
			
		default:
			System.out.println("Invalid Label!!!");
			break;
		}
		click(driver, element);
		Thread.sleep(1000);
	}
	
	
}
