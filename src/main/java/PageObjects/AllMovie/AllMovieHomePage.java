package PageObjects.AllMovie;

import static Utility.WebDriverUtils.*;
import static Utility.CommonUtils.*;
import org.openqa.selenium.WebDriver;

public class AllMovieHomePage extends AllMovieHomeObjects {
	
	public AllMovieHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void Click(String label) throws Throwable {
		switch (label) {
		case "SearchIcon":
			element = SearchIcon_Btn;
			break;
			
		case "Result Movie1":
			element = ResultMovie1_Link;
			break;
			
		case "Cast & Crew":
			element = CastAndCrew_Link;
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
		case "search results":
			element = SearchResults_Text;
			break;
			
		case "Genres":
			element = Genres_Text;
			break;
			
		case "MPAA Rating":
			element = MPAARating_Text;
			break;
			
		case "Director Name":
			element = DirectorName_Text;
			break;
			
		case "Al Pacino Character Name":
			element = AlPacinoCharacterName_Text;
			break;
			
		default:
			System.err.println("Invalid Label!!!");
			break;
		}
		return getText(driver, element);
	}
	
	public void VerifyElementTextMatch(String label, String verifyValue) {
		switch (label) {
		case "Genres":
			element = Genres_Text;
			break;
			
		case "MPAA Rating":
			element = MPAARating_Text;
			break;
			
		case "Director Name":
			element = DirectorName_Text;
			break;
			
		case "Al Pacino Character Name":
			element = AlPacinoCharacterName_Text;
			break;
			
		default:
			System.err.println("Invalid Label!!!");
			break;
		}
		verify = isElementTextContain(driver, element, verifyValue);
		Verify(verify, true, verifyValue + " "+label+" is match with movie.", verifyValue + " "+label+" is not match with movie.");
	}
	
	
}
