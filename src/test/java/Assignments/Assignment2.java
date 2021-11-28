package Assignments;

import static Helper.BaseClass.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import PageObjects.AllMovie.AllMovieHomePage;
import Utility.CommonUtils;
import Utility.ExtentReportUtils;
import Utility.WebDriverUtils;

public class Assignment2 extends BaseTest {
	
	@Parameters("url")
	@BeforeClass
	public void LaunchApplicaiton(String url) {
		driver.get(url);
		verify = WebDriverUtils.isTitleContains(driver, "AllMovie");
		CommonUtils.Assert(verify, true, "AllMovie screen is not loaded!!!!");
	}
	
	@BeforeMethod
	public void init() {
		allMovie = new AllMovieHomePage(driver);
	}
	
	
	@Parameters({"movie.name", "movie.genre", "movie.MPAArating", "movie.directorName", "movie.AlPacino.characterName"})
	@Test
	public void assignment2(String movieName, String movieGenre, String movieMPAArating, String movieDirectorName, String movieAlPacinoCharacterName) throws Throwable {
		allMovie.Set("SearchBox", movieName);
		allMovie.Click("SearchIcon");
		ExtentReportUtils.log(Status.PASS, "Search for movie " + movieName);
		WebDriverUtils.VisibilityOfElementExplicityWait(driver, allMovie.SearchResults_Text, 10);
		verify = WebDriverUtils.isElementPresent(driver, allMovie.SearchResults_Text);
		CommonUtils.Assert(verify, true, movieName+" movie search results not displayed.");
		
		System.out.println("Search results: "+allMovie.GetText("search results"));
		ExtentReportUtils.log(Status.PASS, movieName+" movie search results item count printed in consol");
		
		allMovie.Click("Result Movie1");
		ExtentReportUtils.log(Status.PASS, "Click on " + movieName + " movie with release year '1972'.");
		WebDriverUtils.VisibilityOfElementExplicityWait(driver, allMovie.Genres_Text, 10);
		
		allMovie.VerifyElementTextMatch("Genres", movieGenre);
		
		allMovie.VerifyElementTextMatch("MPAA Rating", movieMPAArating);
		
		allMovie.Click("Cast & Crew");
		Thread.sleep(2000);
		
		allMovie.VerifyElementTextMatch("Director Name", movieDirectorName);
		
		allMovie.VerifyElementTextMatch("Al Pacino Character Name", movieAlPacinoCharacterName);
		
	}
}
