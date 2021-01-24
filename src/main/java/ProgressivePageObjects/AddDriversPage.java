package ProgressivePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class AddDriversPage extends ProgressiveTestBase{
	
	@FindBy(xpath="//navigation-button[@class='white button edit-button']//button")
	WebElement btn_Edit;
	@FindBy(xpath="//button//span[@class='add-long-text plus no-wrap']")
	WebElement btn_AddToQuote;
	@FindBy(xpath="//div[@class='navigation']//loading-button//button")
	WebElement btn_Continue;
	 
	public AddDriversPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickContinue() throws InterruptedException {
		Thread.sleep(2000);
		btn_Continue.click();
	}

}

