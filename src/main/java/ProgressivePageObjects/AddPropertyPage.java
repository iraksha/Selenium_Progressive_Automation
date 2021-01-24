package ProgressivePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class AddPropertyPage extends ProgressiveTestBase{
	
	@FindBy(xpath="//button[contains(text(),'No thanks, just auto')]")
	WebElement click_NoThanks;

	public AddPropertyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickNoThanks() throws InterruptedException {
		Thread.sleep(2000);
		click_NoThanks.click();
		
	}
}
