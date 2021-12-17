package com.cams.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstOTPVerification
{

	public FirstOTPVerification(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//OPENSUBSCRIBERTITLENAME
	@FindBy(xpath="//strong[text()='OPEN SUBSCRIBER']")
	private WebElement opensubscribertitle;

	//GETTER METHODS
	public WebElement getOpensubscribertitle() {
		return opensubscribertitle;
	}
	
	
	//BUSINESS LOGIC
	public String getnameofOpenSub()
	{
	
		return opensubscribertitle.getText();
	}
}
