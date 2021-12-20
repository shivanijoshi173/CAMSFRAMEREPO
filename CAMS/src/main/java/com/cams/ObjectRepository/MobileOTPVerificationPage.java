package com.cams.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileOTPVerificationPage
{
	public MobileOTPVerificationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//OPENSUBSCRIBERTITLENAME
	@FindBy(xpath="//strong[text()='OPEN SUBSCRIBER']")
	private WebElement opensubscribertitle;
	
	//OTP TEXTFIELD
		@FindBy(xpath="//input[@appinputrestriction='numberWithoutSpaceOTP']")
		private WebElement otptextfield;
	
	//OTP TIMEOUT
		@FindBy(xpath="//span[text()='0:00']")
		private WebElement otpTimeout;
		
	//RESEND OTP BUTTON
		@FindBy(xpath="//button[@class='mat-focus-indicator resend_btn mat-raised-button mat-button-base']")
		private WebElement resendotp;
		
	//GETTER METHODS
	public WebElement getOpensubscribertitle() {
		return opensubscribertitle;
	}
	
	public WebElement getOtptextfield() {
		return otptextfield;
	}
	
	public WebElement getOtpTimeout() {
		return otpTimeout;
	}

	public WebElement getResendotp() {
		return resendotp;
	}
	
	
	

	//BUSINESS LOGIC
	public WebElement getnameofOpenSub()
	{
		opensubscribertitle.getText();
	
		return opensubscribertitle;
	}
	
	public void otptext(String num)
	{
		otptextfield.sendKeys(num);
	
		
	}
	
	public WebElement timeout()
	{
		return otpTimeout;
	}
	
	public WebElement resendOTPButton()
	{
	
		return resendotp;
	}
}
