package ProgressivePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class ReviewPersonalInformationPage extends ProgressiveTestBase{
	
	@FindBy(xpath="//loading-button[@class='blue']//button")
	WebElement click_contd;
	
	public ReviewPersonalInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickContinue() throws InterruptedException {
		Thread.sleep(2000);
		click_contd.click();
	}

}
