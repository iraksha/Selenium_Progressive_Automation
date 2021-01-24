package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

//import TestUtils.ScreenShotUtility;
import testBase.ObjectsCollection;

public class ListenerSetup extends ReportSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		test.info("Test Started.");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case: "+result.getMethod().getMethodName()+ "  is Passed.");
		
		//add screenshot for Passed test.
		
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
				Date date =new Date();
				String actualDate = dateformat.format(date);
				String screenshotPath = System.getProperty("user.dir")+"/Reports/ScreenshotsForTestPass"+actualDate+".jpeg";
				File destn = new File(screenshotPath);
			
				try {
					FileUtils.copyFile(src, destn);
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					test.addScreenCaptureFromPath(screenshotPath, "Testcase Success Screenshot");
				} catch (IOException e) {
					e.printStackTrace();
				}
		/*
		 * try { snapshotutil.takeSnapShot(driver, "ScreenShot on Test Pass"); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 * 
		 * try {
		 * test.addScreenCaptureFromPath(".\\ScrrenShots\\ScreenshotForTestPass.Jpeg",
		 * "ScreenShot on Test Pass"); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case: "+result.getMethod().getMethodName()+ "  is Failed.");
		test.log(Status.FAIL, result.getThrowable());
		
		//add screenshot for failed test.
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
		Date date =new Date();
		String actualDate = dateformat.format(date);
		String screenshotPath = System.getProperty("user.dir")+"/Reports/ScreenshotsForTestFail"+actualDate+".jpeg";
		File destn = new File(screenshotPath);
	
		try {
			FileUtils.copyFile(src, destn);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(screenshotPath, "Testcase failure Screenshot");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
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
		//setup method call
		extent = ReportSetup.setupExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		//close extent
		extent.flush();
	}

	
}
