package ProgressivePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class ZipCodePage extends ProgressiveTestBase{
	
	@FindBy(xpath="//input[@id='zipCode_overlay']")
	WebElement ZipCode;
	@FindBy(xpath="//input[@id='qsButton_overlay']")
	WebElement quote;
	
	public ZipCodePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterZipCode() throws Exception {
		 ZipCode.sendKeys(comnMeth.getProperties("zipcode"));
	}
	
	public void getAquote() {
		quote.click();
	}

}
