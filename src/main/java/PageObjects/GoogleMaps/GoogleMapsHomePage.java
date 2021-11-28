package PageObjects.GoogleMaps;

import static Utility.WebDriverUtils.*;
import org.openqa.selenium.WebDriver;

public class GoogleMapsHomePage extends GoogleMapsHomeObjects {
	
	public GoogleMapsHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void Click(String label) throws Throwable {
		switch (label) {
		case "SearchIcon":
			element = SearchIcon_Btn;
			break;

		default:
			System.err.println("Invalid Label!!!");
			break;
		}
		click(driver, element);
		Thread.sleep(1000);
	}
	
	public void Set(String label, String setValue) throws Throwable{
		switch (label) {
		case "SearchBox":
			enter(driver, SearchBox_TB, setValue);
			break;
			
		default:
			System.err.println("Invalid Label!!!");
			break;
		}
		
		Thread.sleep(500);
	}
	
	public String GetText(String label) throws Throwable{
		switch (label) {
		case "Rating":
			element = Rating_Text;
			break;
			
		case "Reviews":
			element = Reviews_Text;
			break;
			
		case "Address":
			element = Address_Text;
			break;
			
		default:
			System.err.println("Invalid Label!!!");
			break;
		}
		return getText(driver, element);
	}
	
}
