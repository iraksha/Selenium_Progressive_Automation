package ProgressivePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class HomePage extends ProgressiveTestBase{
	
	@FindBy(xpath="//a[@data-tracking-label='auto_section' and @data-qs-product='AU']")
	WebElement auto;
	
	public HomePage () {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAuto() throws InterruptedException {
		Thread.sleep(2000);
		auto.click();
	}

}
