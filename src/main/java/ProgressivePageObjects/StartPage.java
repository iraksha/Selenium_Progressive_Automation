package ProgressivePageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class StartPage extends ProgressiveTestBase{
	
	@FindBy(xpath="//div//input[@analytics-id='NameAndAddressEdit_FirstName']")
	WebElement txt_FirstName;
	@FindBy(xpath="//input[@id='NameAndAddressEdit_embedded_questions_list_MiddleInitial']")
	WebElement txt_MI;
	@FindBy(xpath="//input[@id='NameAndAddressEdit_embedded_questions_list_LastName']")
	WebElement txt_LastName;
	@FindBy(xpath="//select[@analytics-id='NameAndAddressEdit_Suffix']")
	WebElement dd_Suffix;
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_DateOfBirth']")
	WebElement txt_Dob;
	//@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_MailingAddress']")
	@FindBy(xpath="//input[@name='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
	WebElement txt_StreetName;
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_ApartmentUnit']")
	WebElement txt_UnitName;
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_City']")
	WebElement txt_CityName;
	@FindBy(xpath="//loading-button[@class='blue']")
	WebElement click_StartQuote;
	
	public StartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterNameInfo() throws Exception {
		Thread.sleep(2000);
		try {
		txt_FirstName.sendKeys(comnMeth.getProperties("firstname"));
		txt_MI.sendKeys(comnMeth.getProperties("mi"));
		txt_LastName.sendKeys(comnMeth.getProperties("lastname"));
		//dd_Suffix
		txt_Dob.sendKeys(comnMeth.getProperties("dob"));
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
		
	}
	public void enterAddressInfo() throws Exception {
	try {
		txt_StreetName.sendKeys(Keys.CLEAR);
		txt_StreetName.sendKeys(Keys.TAB); 
		Thread.sleep(2000);
		txt_StreetName.sendKeys(comnMeth.getProperties("strname"));
		txt_UnitName.sendKeys(comnMeth.getProperties("unit"));
		
		txt_CityName.sendKeys(Keys.CLEAR);
		txt_CityName.sendKeys(Keys.TAB);
        txt_CityName.sendKeys(comnMeth.getProperties("city"));
		click_StartQuote.click();
	}catch(Exception e) {
		e.printStackTrace();
		e.getCause();
		e.getMessage();
	}
		
		}
	
	
	

}
