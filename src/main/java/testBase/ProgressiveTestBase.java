package testBase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
//import TestUtils.ScreenShotUtility;


public class ProgressiveTestBase extends ObjectsCollection{
	
	private static final boolean WebElement = false;

	public void initialization() throws Exception {
		//public static void main(String[] args) throws Exception {

		tb = new ProgressiveTestBase();
		String url= comnMeth.getProperties("url");
		String browser = comnMeth.getProperties("browser");


		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--incognito");
		 */
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}
		
		  else 
			  if(browser.equalsIgnoreCase("firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver", ".\\libs\\geckodriver.exe");
		  driver = new FirefoxDriver(); 
		  }
		 
			else {
				System.out.println("Browser not supported");
			}

			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
	}
	
	@BeforeMethod
	public void startAutomation() throws Exception {
		initialization();
		hp= new HomePage();
		zc = new ZipCodePage();
		sp = new StartPage();
		vp = new VehiclesPage();
		dp = new DriversPage();
		adp = new AddDriversPage();
		rpip = new ReviewPersonalInformationPage();
		dfp = new DetailsFinalPage();
		ssp = new SnapshotPage();
		app = new AddPropertyPage();
		
	}

	@AfterMethod
	public void close() {
		//driver.close();
	}

}
