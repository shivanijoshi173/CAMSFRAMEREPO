package com.cams.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailOTPVerificationPage
{
	public EmailOTPVerificationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//LOCATORS
	@FindBy(xpath="//mat-label[text()='OTP sent to your Registered Email id']")
	private WebElement emailtextdata;

	@FindBy(xpath="//input[@appinputrestriction='numberWithoutSpaceOTP']")
	private WebElement textfield;
	
	
	//GETTER METHODS
	public WebElement getEmailtextdata() {
		return emailtextdata;
	}

	public WebElement getTextfield() {
		return textfield;
	}



	//BUSINESS LOGIC
	public String emailtextdata()
	{
		return emailtextdata.getText();
	}
	
	public WebElement emailtextfield(String text)
	{
		textfield.sendKeys(text);
		return textfield;
	}
	
}


