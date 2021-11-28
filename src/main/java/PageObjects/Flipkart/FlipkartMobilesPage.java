package PageObjects.Flipkart;

import static Utility.WebDriverUtils.*;
import org.openqa.selenium.WebDriver;

public class FlipkartMobilesPage extends FlipkartMobilesObjects {
	
	public FlipkartMobilesPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void Click(String label) throws Throwable {
		switch (label) {
		case "Mi":
			element = MiLink;
			MoveToElementAndClick_Actions(driver, element);
			break;

		default:
			System.err.println("Invalid Label!!!");
			break;
		}
		Thread.sleep(1000);
	}
	
	public void Hover(String label) throws Throwable {
		switch (label) {
		case "Electronics":
			element = ElectronicsMenu;
			break;

		default:
			System.err.println("Invalid Label!!!");
			break;
		}
		MoveToElement_Actions(driver, element);
		Thread.sleep(500);
	}
	
}
