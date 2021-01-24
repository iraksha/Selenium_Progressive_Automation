package testBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GooglePageObject.GoogleHomePage;
//import TestUtils.ScreenShotUtility;

public class GoogleTestBase extends ObjectsCollection{
	
	
	//public static Properties prop1 = new Properties();
	public String getProperties(String key) throws Exception {
		String configPath = System.getProperty("user.dir")+"/src/test/resources/googleConfig.properties";
		FileInputStream configFile = new FileInputStream(configPath);
		prop1.load(configFile);
		String value= prop1.getProperty(key).toString();

		if(StringUtils.isEmpty(value)) {
			throw new Exception("value is empty for key: "+key + "in config file");
		}
		return value;
	}
	
	public void initialization() throws Exception {
		//public static void main(String[] args) throws Exception {

		gtb = new GoogleTestBase();
		String url= gtb.getProperties("url");
		String browser = gtb.getProperties("browser");
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
	public void setupTest() {
		try {
			initialization();
			//snapshotutil = new ScreenShotUtility();
			ghp = new GoogleHomePage();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void closeTest() {
		driver.close();
	}
}
