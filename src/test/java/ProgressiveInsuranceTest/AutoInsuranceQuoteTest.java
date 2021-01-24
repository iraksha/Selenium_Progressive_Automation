package ProgressiveInsuranceTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testBase.ProgressiveTestBase;

import com.aventstack.extentreports.ExtentTest;

public class AutoInsuranceQuoteTest extends ProgressiveTestBase{
	
	//1.step 1
		//create extent Object and create new extentReport html file
		//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentHtmlReporter.html");

	@Test
	public void autoInsuranceQuote() throws Exception {
		
		//2 step 2
		//create ExtentReports and attach the reporter
	//ExtentReports extent = new ExtentReports();
	//extent.attachReporter(htmlReporter);

	//3 step3
	//create a toogle for the given test, and add log events under it
	//ExtentTest test1 = extent.createTest("Progressive Quote Page","this is a get quote test");
	//test1.info("Executing Progressive Quote");
	
		Thread.sleep(2000);
		hp.clickOnAuto();
		Thread.sleep(2000);
		//String code = tb.getProperties("zipcode");
		zc.enterZipCode();
		
		Thread.sleep(2000);
		zc.getAquote();
		Thread.sleep(2000);
		sp.enterNameInfo();
		Thread.sleep(2000);
		sp.enterAddressInfo();
		Thread.sleep(2000);
		//vp.popUp();
		vp.isAlertPresent();
		vp.vehicleInfo(comnMeth.getProperties("Year"), comnMeth.getProperties("Make"), comnMeth.getProperties("Model"));
		Thread.sleep(2000);
		vp.use_Info();
		Thread.sleep(2000);
		vp.primaryZipLocation();
		Thread.sleep(2000);
		vp.ownOrLease();
		Thread.sleep(2000);
		vp.selectFeature();
		Thread.sleep(2000);
		vp.clickDone();
		Thread.sleep(2000);
		vp.clickContinue();
		Thread.sleep(2000);
		dp.driverInfo();
		Thread.sleep(2000);
		dp.residencyInfo();
		Thread.sleep(2000);
		dp.drivingHistory();
		Thread.sleep(2000);
		dp.accidentsClaims();
		Thread.sleep(2000);
		dp.clickContinue();
		Thread.sleep(2000);
		adp.clickContinue();
		rpip.clickContinue();
		dfp.autoInsuranceHistory();
		dfp.clickContinue();
		Thread.sleep(2000);
		ssp.enrollInSnapshot();
		app.clickNoThanks();
		//test1.pass("Successfully get to Snapshot Page");
		Thread.sleep(5000);
		//snapshotutil.takeSnapShot(driver, "ProgressiveQuote");
		//test1.pass("Successfully got the quote page");
		extent.flush();

	}


}
