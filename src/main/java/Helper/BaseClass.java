package Helper;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObjects.AllMovie.AllMovieHomePage;
import PageObjects.Flipkart.FlipkartHomePage;
import PageObjects.Flipkart.FlipkartMobilesPage;
import PageObjects.GoogleMaps.GoogleMapsHomePage;
import Utility.PropertiesFileUtils;
import Utility.ScreenShotUtils;

public class BaseClass {
	public static WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static ScreenShotUtils screenShot;
	public static PropertiesFileUtils props;
	
	public static String BrowserName;
	public static int ImplicitWait;
	public static String Assignment1URL, Assignment2URL, Assignment3URL;
	
	
	public static GoogleMapsHomePage googleMaps;
	
	public static AllMovieHomePage allMovie;
	
	public static FlipkartHomePage flipkartHome;
	public static FlipkartMobilesPage flipkartMobiles;
	
	
}
