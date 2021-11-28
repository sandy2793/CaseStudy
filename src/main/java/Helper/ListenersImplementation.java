package Helper;

import static Helper.BaseClass.*;
import static Helper.Constants.*;
import static Utility.CommonUtils.*;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Utility.ExtentReportUtils;
import Utility.ScreenShotUtils;

public class ListenersImplementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case: " + result.getMethod().getMethodName()+" is Passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+" is Failed.");
		test.log(Status.FAIL, result.getThrowable());
		test.addScreenCaptureFromPath(screenShot.ScreenShot(driver), "Test Case failure screenshot.");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		String ReportFolderPath = ReportFolder + CurrentDate("ddMMMyyyy_HHmmss") + "/";
		screenShot = new ScreenShotUtils(ReportFolderPath + "ScreenShots/");
		extent = ExtentReportUtils.initExtentReport(ReportFolderPath);
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
