package ProgressivePageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.ProgressiveTestBase;

public class VehiclesPage extends ProgressiveTestBase{
	
	@FindBy(xpath="//loading-button[@class='hvd-loading-button blue ng-tns-c178-3']//button")
	WebElement click_popUpNo;
	
	@FindBy(xpath="//select[@analytics-id='VehiclesNew_VehicleUse']")
	WebElement dd_Use;
	
	@FindBy(xpath="//input[@analytics-id='VehiclesNew_GaragingZip']")
	WebElement txt_Zip;
	@FindBy(xpath="//select[@analytics-id='VehiclesNew_OwnOrLease']")
	WebElement dd_ownLease;
	@FindBy(xpath="//select[@analytics-id='VehiclesNew_LengthOfOwnership']")
	WebElement dd_duration;
	@FindBy(xpath="//vehicle-details//loading-button[@class='blue']/button")
	WebElement click_done;
	@FindBy(xpath="//loading-button[@ class='blue']/button")
	WebElement click_Ctn;
	@FindBy(xpath="//radio-input//div//input[@name='viewModel_embedded_questions_list_BlindSpotWarning']/parent::div/following-sibling::span")
	List<WebElement> rdo_feature;

	public VehiclesPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isAlertPresent() throws InterruptedException {

	    boolean presentFlag = false;

	    try {

	    	Thread.sleep(2000);
	        // Check the presence of alert
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        // Alert present; set the flag
	        presentFlag = true;
	        // if present consume the alert
	        Thread.sleep(2000);
	        alert.dismiss();
	        Thread.sleep(2000);
	        //( Now, click on ok or cancel button )
	        click_popUpNo.click();

	    } catch (Exception e) {
	        // Alert not present
	        e.printStackTrace();
	    }

	    return presentFlag;
	}
	public void vehicleInfo(String Year, String Make, String Model) throws Exception {
		Thread.sleep(2000);
		try {
			
		String sel_Year="//ul[@role='listbox']//li[contains(text(),'"+Year+"')]";
		driver.findElement(By.xpath(sel_Year)).click();
		Thread.sleep(2000);
		String sel_Make="//ul[@role='listbox']//li[contains(text(),'"+Make+"')]";
		driver.findElement(By.xpath(sel_Make)).click();
		Thread.sleep(2000);
		String sel_Model="//ul[@role='listbox']//li[contains(text(),'"+Model+"')]";
		driver.findElement(By.xpath(sel_Model)).click();
		Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
	public void use_Info() { 
		try {
			Thread.sleep(2000);
		comnMeth.selectDropDown(dd_Use, comnMeth.getProperties("Use"));
		Thread.sleep(2000);
		
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
	public void primaryZipLocation() {
		try {
			
		txt_Zip.sendKeys(comnMeth.getProperties("zipcode"));
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
	
	public void ownOrLease() throws Exception {
		try {
		comnMeth.selectDropDown(dd_ownLease, comnMeth.getProperties("leaseOrOwn"));
		comnMeth.selectDropDown(dd_duration, comnMeth.getProperties("duration"));
	
		Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}

	public void selectFeature() {
		try {
			comnMeth.selectRadioButton(rdo_feature, comnMeth.getProperties("feature"));
		
		}catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
	public void clickDone() {
		click_done.click();
	}
	public void clickContinue() {
		click_Ctn.click();
	}

}
