package Assignments;

import static Helper.BaseClass.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import PageObjects.GoogleMaps.GoogleMapsHomePage;
import Utility.CommonUtils;
import Utility.WebDriverUtils;

public class Assignment1 extends BaseTest {
	
	@Parameters("url")
	@BeforeClass
	public void LaunchApplicaiton(String url) {
		driver.get(url);
		verify = WebDriverUtils.isTitleContains(driver, "Google Maps");
		CommonUtils.Assert(verify, true, "Google Maps screen is not loaded!!!!");
	}
	
	@BeforeMethod
	public void init() {
		googleMaps = new GoogleMapsHomePage(driver);
	}
	
	@Parameters({"location.name", "googleMaps.title", "location.website", "location.phoneNo"})
	@Test
	public void assignment1(String locationName, String googleMapsTitle, String locationWebsite, String locationPhoneNo) throws Throwable {
		googleMaps.Set("SearchBox", locationName);
		test.log(Status.PASS, "Enter '"+locationName+"' in search box.");
		
		googleMaps.Click("SearchIcon");
		test.log(Status.PASS, "Click on search icon.");
		
		WebDriverUtils.VisibilityOfElementExplicityWait(driver, "Wankhede Stadium Mumbai", 10);
		test.addScreenCaptureFromPath(screenShot.ScreenShot(driver), "Wankhede Stadium Location is displayed on google Maps");
		
		verify = WebDriverUtils.isElementPresentMatch(driver, "Wankhede Stadium Mumbai");
		CommonUtils.Verify(verify, true, "Wankhede Statium Mumbai location is displayed on gogole maps.", "Wankhede Statium Mumbai is not displayed on gogole maps.");
		
		verify = WebDriverUtils.isTitleMatch(driver, googleMapsTitle);
		CommonUtils.Verify(verify, true, "Title is '"+googleMapsTitle+"'.", "Title is not '"+googleMapsTitle+"'.");
		
		System.out.println("Wankhede Stadium Rating: " + googleMaps.GetText("Rating"));
		System.out.println("Wankhede Stadium Reviews: " + googleMaps.GetText("Reviews"));
		test.log(Status.PASS, "Wankhede Stadium rating & reviews printed in consol.");
		
		verify = WebDriverUtils.isTitleMatch(driver, locationWebsite);
		CommonUtils.Verify(verify, true, locationWebsite+" is displayed on gogole maps.", locationWebsite+" is not displayed on gogole maps.");
		
		System.out.println("Wankhede Stadium Address: " + googleMaps.GetText("Address"));
		test.log(Status.PASS, "Wankhede Stadium Address printed in consol.");
		
		verify = WebDriverUtils.isTitleMatch(driver, locationPhoneNo);
		CommonUtils.Verify(verify, true, locationPhoneNo+" phone no is displayed on gogole maps.", locationPhoneNo+" phone no is not displayed on gogole maps.");
		
		
		
	}
	
		
}
