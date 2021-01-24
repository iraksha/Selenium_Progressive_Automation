package ProgressivePageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

import java.util.List;

import org.openqa.selenium.WebElement;

public class DetailsFinalPage extends ProgressiveTestBase {
@FindBy(xpath="//label[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_Label']//input[@type='radio']/parent::div//following-sibling::span")
List<WebElement> rdo_InsToday;
//@FindBy(xpath="//select[@analytics-id='FinalDetailsEdit_RecentAutoInsuranceCompanyPeriod']")
//WebElement dd_CurrentCompany;
//@FindBy(xpath="//select[@analytics-id='FinalDetailsEdit_BodilyInjuryLimits']")
//WebElement dd_BodilyInjuryLimits;
@FindBy(xpath="//label[@id='FinalDetailsEdit_embedded_questions_list_InsuranceLastMonth_Label']//input[@type='radio']/parent::div/following-sibling::span")
List<WebElement> rdo_InsLast31Days;
@FindBy(xpath="//label[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_Label']//input[@type='radio']/parent::div//following-sibling::span")
List<WebElement> rdo_NonAutoPolicies;
@FindBy(xpath="//input[@analytics-id='FinalDetailsEdit_PrimaryEmailAddress']")
WebElement txt_Email;
@FindBy(xpath="//label//radio-input//input[@name='viewModel_embedded_questions_list_HealthInsurance']/parent::div//following-sibling::span")
List<WebElement> rdo_HealthInsuranceCoverage;
@FindBy(xpath="//select[@analytics-id='FinalDetailsEdit_CurrentResidence']//option")
WebElement txt_ResidenceDuration;
@FindBy(xpath="//loading-button[@class='blue']//button")
WebElement click_Continue;
	
	public DetailsFinalPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void autoInsuranceHistory() {
		try {
			Thread.sleep(2000);
			comnMeth.selectRadioButton(rdo_InsToday, comnMeth.getProperties("HaveInsuranceToday"));
			Thread.sleep(3000);
			//tb.selectDropDown(dd_CurrentCompany, getProperties("CompanyDuration"));
			comnMeth.selectRadioButton(rdo_InsLast31Days, comnMeth.getProperties("HaveInsLast31Days"));
			Thread.sleep(2000);
			comnMeth.selectRadioButton(rdo_NonAutoPolicies, comnMeth.getProperties("NonAutoPolicies"));
			Thread.sleep(2000);
			txt_Email.sendKeys("aabbcc_xyz@hotmail.com");
			Thread.sleep(5000);
			comnMeth.selectRadioButton(rdo_HealthInsuranceCoverage, comnMeth.getProperties("HealthInsuranceCoverage"));
			Thread.sleep(2000);
			comnMeth.selectDropDown(txt_ResidenceDuration, comnMeth.getProperties("ResidenceDuring"));
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
	}
	public void clickContinue() {
		click_Continue.click();
	}
}
