package ProgressivePageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class DriversPage extends ProgressiveTestBase{
	
	@FindBy(xpath="//label[@id='DriversAddPniDetails_embedded_questions_list_Gender_Label']//radio-input//span")
	List<WebElement> rdo_Gender;
	
	@FindBy(xpath="//select[@analytics-id='DriversAddPniDetails_MaritalStatus']")
	WebElement dd_MaritalStatus;
	
	@FindBy(xpath="//select[@analytics-id='DriversAddPniDetails_HighestLevelOfEducation']")
	WebElement dd_EduLevel;
	
	@FindBy(xpath="//select[@analytics-id='DriversAddPniDetails_EmploymentStatus']")
	WebElement dd_EmpStatus;
	
	@FindBy(xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']")
	WebElement dd_Rsdn;

	@FindBy(xpath="//select[@analytics-id='DriversAddPniDetails_HasPriorAddress']")
	WebElement dd_Mov;
	@FindBy(xpath="")
	WebElement select_Mov;
	@FindBy(xpath="//select[@analytics-id='DriversAddPniDetails_LicenseStatus']")
	WebElement dd_LicenseStatus;
	@FindBy(xpath="")
	WebElement select_LicenseStatus;
	@FindBy(xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']")
	WebElement dd_YearLicensed;
	@FindBy(xpath="")
	WebElement select_YearLicensed;
	@FindBy(xpath="//accidents-or-claims//radio-input[@class='control']//input[@type='radio']/parent::div/following-sibling::span")
	List<WebElement> rdo_Accidents;
	@FindBy(xpath="//tickets-or-violations//radio-input[@class='control']//input[@type='radio']/parent::div/following-sibling::span")
	List<WebElement> rdo_Tickets;
	@FindBy(xpath="//loading-button[@class='blue']//button")
	WebElement click_Ctn;
	
	public DriversPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void driverInfo() throws Exception {
		Thread.sleep(4000);
		try {
			comnMeth.selectRadioButton(rdo_Gender, comnMeth.getProperties("Gender"));
			Thread.sleep(2000);
		//String btn_Gender = "//input[@type='radio' and @value='"+Gender+"']";
		//driver.findElement(By.xpath(btn_Gender)).click();
		//dd_MaritalStatus.click();
		comnMeth.selectDropDown(dd_MaritalStatus, comnMeth.getProperties("Status"));
		//String select_ms = "//option[contains(text(),'"+Status+"')]";
		//driver.findElement(By.xpath(select_ms)).click();
		//dd_EduLevel.click();
		comnMeth.selectDropDown(dd_EduLevel, comnMeth.getProperties("EduLevel"));
		//String select_EduLevel = "//option[contains(text(),'"+EduLevel+"')]";
		//driver.findElement(By.xpath(select_EduLevel)).click();
		//dd_EmpStatus.click();
		comnMeth.selectDropDown(dd_EmpStatus, comnMeth.getProperties("EmpStatus"));
		//String select_EmpStatus = "//option[contains(text(),'"+EmpStatus+"')]";
		//driver.findElement(By.xpath(select_EmpStatus)).click();
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
		
	}
	public void residencyInfo() throws Exception {
		try {
		/*
		 * dd_Rsdn.click(); String select_Rsdn =
		 * "//select[@analytics-id='DriversAddPniDetails_PrimaryResidence']//option[contains(text(),'"
		 * +Residence+"')]"; driver.findElement(By.xpath(select_Rsdn)).click();
		 */
			comnMeth.selectDropDown(dd_Rsdn, comnMeth.getProperties("Residence"));
		Thread.sleep(2000);
		comnMeth.selectDropDown(dd_Mov, comnMeth.getProperties("Move"));
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
	
	public void drivingHistory() {
		try {
			comnMeth.selectDropDown(dd_LicenseStatus, comnMeth.getProperties("LicenseStatus"));
			//tb.selectDropDown(dd_YearLicensed, getProperties("YearsLicensed"));
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
	
	public void accidentsClaims() {
		try {
			comnMeth.selectRadioButton(rdo_Accidents, comnMeth.getProperties("Accidents"));
			Thread.sleep(2000);
			comnMeth.selectRadioButton(rdo_Tickets, comnMeth.getProperties("Tickets"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
public void clickContinue() {
	click_Ctn.click();
}



}
