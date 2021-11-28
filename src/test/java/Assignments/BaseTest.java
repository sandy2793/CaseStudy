package Assignments;

import static Helper.BaseClass.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import Utility.BrowserUtils;
import Utility.WebDriverUtils;

public class BaseTest {
	public boolean verify = false;
	
	@Parameters({"browser.name", "implicit.wait"})
	@BeforeTest
	public void LaunchBrowser(String broswerName, String implicitWait) {
		driver = BrowserUtils.LaunchBrowser(broswerName);
		WebDriverUtils.implicitlyWait(driver, Integer.valueOf(implicitWait));
	}
	
	@AfterTest
	public void CloseBrowser() {
		test.addScreenCaptureFromPath(screenShot.ScreenShot(driver), "Test Case completed.");
		driver.quit();
	}
		
}
