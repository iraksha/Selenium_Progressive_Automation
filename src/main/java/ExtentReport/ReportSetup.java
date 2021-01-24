package ExtentReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectsCollection;

public class ReportSetup  extends ObjectsCollection{
	
public static ExtentReports setupExtentReport(){
		
		SimpleDateFormat dateformat =new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
		Date date = new Date();
		String actualdate = dateformat.format(date);
		String reportPath = System.getProperty("user.dir")+"/Reports/ExecutionReport_"+actualdate+".html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		
		sparkReport.config().setDocumentTitle("DocumentTitle");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setReportName("ReporterName");
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		
		return extent;
		}

	//public static void main(String[] args) {
		//1.step 1
		//create extent Object and create new extentReport html file
	
		
		//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentHtmlReporter.html");
		
		//2 step 2
			//create ExtentReports and attach the reporter
		//ExtentReports extent = new ExtentReports();
		//extent.attachReporter(htmlReporter);
		
		//3 step3
		//create a toogle for the given test, and add log events under it
		//ExtentTest test1 = extent.createTest("Google Page Test","this is a simple google search test");
		//test1.info("Executing Google Test");
	//}

}
