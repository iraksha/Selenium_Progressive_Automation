package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testBase.GoogleTestBase;

public class GoogleHomePage extends GoogleTestBase{
	
	@FindBy(xpath="//input[@name='q']")
	WebElement txt_Input;
	@FindBy(xpath="//a//h3[@class='LC20lb DKV0Md']//span[contains(text(),'TestNG - Welcome')]")
	WebElement link_TestNg;

	public GoogleHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchInput(String SearchInput) {
		try {
			txt_Input.sendKeys(getProperties("SearchInput"));
			txt_Input.sendKeys(Keys.RETURN);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		public void showSearchText(){
			
			String str=link_TestNg.getText();
			String expected_string ="TestNg-Welcome";
			Assert.assertEquals(str, expected_string,"Expected Text didn't match with actual Text.");
			//if (link_TestNg.isDisplayed()) {
				//System.out.println("TestNg-Welcome is displayed as expected.");
				/*try {
					snapshotutil.takeSnapShot(driver, "TestNg Search");
				} catch (InterruptedException e) {
					
					e.printStackTrace();*/
				//}
				//}else {
					//System.out.println("TestNg-Welcome is not displayed as expected.");
					
				}
		}
	

	
	

