package Utility;

import static Helper.Constants.*;
import static Helper.BaseClass.*;
import static Utility.CommonUtils.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtils {
	
	public static ExtentReports initExtentReport() {
		extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(ReportFolder + "Report_"+ CurrentDate("ddMMyyyyHHmmss") + "/" + "Report.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        
        return extent;
	}
	
	public static ExtentReports initExtentReport(String reportFolderPath) {
		extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(reportFolderPath + "Report/Report.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        
        return extent;
	}
	
	public static void log(Status status, String logMessage) {
		test.log(status, logMessage);
	}
	
	public static void attachScreenshot(String screenshotMessage) {
		test.addScreenCaptureFromPath(screenShot.ScreenShot(driver), screenshotMessage);
	}
	
	
	
}
