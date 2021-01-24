package testBase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import GooglePageObject.GoogleHomePage;
import ProgressivePageObjects.AddDriversPage;
import ProgressivePageObjects.AddPropertyPage;
import ProgressivePageObjects.DetailsFinalPage;
import ProgressivePageObjects.DriversPage;
import ProgressivePageObjects.HomePage;
import ProgressivePageObjects.ReviewPersonalInformationPage;
import ProgressivePageObjects.SnapshotPage;
import ProgressivePageObjects.StartPage;
import ProgressivePageObjects.VehiclesPage;
import ProgressivePageObjects.ZipCodePage;
import TestUtils.CommonMethods;
//import TestUtils.ScreenShotUtility;

public class ObjectsCollection {

	public  static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent;
	//public static ScreenShotUtility snapshotutil = new ScreenShotUtility();
	public static AddPropertyPage app;
	public static SnapshotPage ssp;
	public static DetailsFinalPage dfp;
	public static ReviewPersonalInformationPage rpip ;

	public static AddDriversPage adp = new AddDriversPage();
	public static DriversPage dp = new DriversPage();
	public static VehiclesPage vp = new VehiclesPage();
	public static StartPage sp = new StartPage();
	public static ZipCodePage zc = new ZipCodePage();
    public static CommonMethods comnMeth = new CommonMethods();
	public static HomePage hp= new HomePage();
    public static ProgressiveTestBase tb ;
	
    
   
    public static Properties prop1 = new Properties();
	public static GoogleTestBase gtb = new GoogleTestBase();
	public static GoogleHomePage ghp = new GoogleHomePage();
	
}
