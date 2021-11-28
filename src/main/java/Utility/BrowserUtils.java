package Utility;

import static Helper.BaseClass.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains all browser related methods using Selenium.
 * Each method of class is static method.
 * @author Sandesh Lahoti
 * @since 11-Nov-2021
 */

public class BrowserUtils {
	
	/**
     * This method is to launch a browser with given browser name
     * @author Sandesh Lahoti
     * @since 11-Nov-2021
     * @param {@link String} browserName
     * @return {@link WebDriver} driver
     */
    public static WebDriver LaunchBrowser(String browserName) {
    	switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			System.err.println("Invalid broswer name!!!");
			break;
		}
    	driver.manage().window().maximize();
    	return driver;
    }
	
}
