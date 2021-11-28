package Assignments;

import static Helper.BaseClass.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.Flipkart.FlipkartHomePage;
import PageObjects.Flipkart.FlipkartMobilesPage;
import Utility.CommonUtils;
import Utility.WebDriverUtils;

public class Assignment3 extends BaseTest {
	
	@Parameters("url")
	@BeforeClass
	public void LaunchApplicaiton(String url) {
		driver.get(url);
		verify = WebDriverUtils.isTitleContains(driver, "Online Shopping Site");
		CommonUtils.Assert(verify, true, "Flipkart is not loaded!!!!");
	}
	
	@BeforeMethod
	public void init() {
		flipkartHome = new FlipkartHomePage(driver);
		flipkartMobiles = new FlipkartMobilesPage(driver);
	}
	
	@Test
	public void assignment3() throws Throwable {
		flipkartHome.Click("Login Modal Close");
		Thread.sleep(500);
		flipkartHome.Click("Mobiles");
		Thread.sleep(2000);
		flipkartMobiles.Hover("Electronics");
		Thread.sleep(2000);
		flipkartMobiles.Click("Mi");
		
		
	}
	
	
	
	
}
