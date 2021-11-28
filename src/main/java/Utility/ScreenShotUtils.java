package Utility;

import static Utility.CommonUtils.*;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * ScreenshotUtils class contains all methods related to Screenshots.
 * Each method of class is static method.
 * @author Sandesh Lahoti
 * @since 11-Nov-2021
 */

public class ScreenShotUtils {
	String screenshotFolder;
	public ScreenShotUtils(String screenshotFolderPath) {
		this.screenshotFolder = screenshotFolderPath;
	}
	
	
	public String ScreenShot(WebDriver driver) {
		String ScreenShotPath = null;
    	try {
	  	    ScreenShotPath = screenshotFolder + CurrentDate("ddMMyyyyHHmmss") + ".png";
	  	    File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);       		 
		    FileUtils.copyFile(screenshots, new File(ScreenShotPath));
        }
	  	catch(Exception e) {
	  		printException(e, "Screenshot Fail");
	  	}
	  	return ScreenShotPath;
  	 }
	
    public String ScreenShot(WebDriver driver, String screenshotName) {
		String ScreenShotPath = null;
    	try {
	  	    ScreenShotPath = screenshotFolder + screenshotName + "_" + CurrentDate("ddMMyyyyHHmmss") + ".png";
	  	    File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);       		 
		    FileUtils.copyFile(screenshots, new File(ScreenShotPath));
        }
	  	catch(Exception e) {
	  		printException(e, "Screenshot Fail");
	  	}
	  	return ScreenShotPath;
  	 }
	
}
