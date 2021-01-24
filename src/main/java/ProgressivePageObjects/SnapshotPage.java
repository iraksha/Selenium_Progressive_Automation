package ProgressivePageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class SnapshotPage extends ProgressiveTestBase{
	
	@FindBy(xpath="//input[@name='viewModel_embedded_questions_list_SnapshotPolicyEnrollment']/parent::div//following-sibling::span")
	List<WebElement> rdo_Snapshot;
	@FindBy(xpath="//loading-button[@class='blue']//button")
	WebElement click_contd;
	
	public SnapshotPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enrollInSnapshot() {
		try {
			
			comnMeth.selectRadioButton(rdo_Snapshot, comnMeth.getProperties("Snapshot"));
			click_contd.click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
