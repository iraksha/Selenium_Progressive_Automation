/*
 * package TestUtils;
 * 
 * import java.io.File; import java.io.IOException;
 * 
 * import org.apache.commons.io.FileUtils; import
 * org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot;
 * import org.openqa.selenium.WebDriver;
 * 
 * public class ScreenShotUtility {
 * 
 * public void takeSnapShot(WebDriver driver, String Screenshotname) throws
 * InterruptedException {
 * 
 * //Create a file object to take Snapshot File srcfile = ((TakesScreenshot)
 * driver).getScreenshotAs(OutputType.FILE);
 * 
 * //store source file in a new file "Screenshot" try {
 * FileUtils.copyFile(srcfile, new File("./Reports/"+Screenshotname + ".Jpeg"));
 * 
 * Thread.sleep(2000); System.out.println("Screenshot was taken|");
 * 
 * } catch (IOException e) {
 * 
 * e.printStackTrace(); }
 * 
 * }
 * 
 * }
 */