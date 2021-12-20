package com.cams.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithMobileEmailIDandDOBLinkPage
{	
	public LoginWithMobileEmailIDandDOBLinkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//LOCATORS
	
	
	//MobileOREmailId TEXTFIELD
	@FindBy(xpath="//input[@data-placeholder='Mobile/Email Id']")
	private WebElement MobileOREmailId;

	//DOB TEXTFIELD
	@FindBy(xpath="//input[@data-placeholder='dd-mmm-yyyy']")
	private WebElement dateofbirth;
	
	//LOGIN LINK(ACK NO AND ACK DATE)
	@FindBy(xpath="//a[text()='Login with Acknowledgement Number and Acknowledgement Date']")
	private WebElement loginlinkwithacknumberanddate;
			
	//BACK BUTTON
	@FindBy(xpath="//span[text()='Back']")
	private WebElement backbutton;
	
	
	//PROCEED BUTTON
	@FindBy(xpath="//span[text()='PROCEED']")
	private WebElement proceedbutton;
		
	//OTPVERIFICATION TITLE
	@FindBy(xpath="//h3[text()=' OTP Verification ']")
	private WebElement otptitle;
	
	
	
	
	
	
	
	
	
	
	
	//GETTER METHODS
	public WebElement getMobileOREmailId() {
		return MobileOREmailId;
	}


	public WebElement getDateofbirth() {
		return dateofbirth;
	}


	public WebElement getLoginlinkwithacknumberanddate() {
		return loginlinkwithacknumberanddate;
	}


	public WebElement getBackbutton() {
		return backbutton;
	}


	public WebElement getProceedbutton() {
		return proceedbutton;
	}
	
	public WebElement getOtptext() {
		return otptitle;
	}
	
	
	
	
	
	


	//BUSINESS LOGIC
	public WebElement mobile(String mobileno)
	{
		MobileOREmailId.sendKeys(mobileno);
		return MobileOREmailId;
	}
	
	public WebElement dob(String DOB)
	{
		dateofbirth.sendKeys(DOB);
		return dateofbirth;
	}
	
	public void proceedbutton()
	{
		proceedbutton.click();
	}
	
	public String otp()
	{
		return otptitle.getText();
	}
	

}

