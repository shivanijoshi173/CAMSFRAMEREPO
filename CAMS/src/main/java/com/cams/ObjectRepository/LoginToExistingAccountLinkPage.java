package com.cams.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToExistingAccountLinkPage 
{
	public LoginToExistingAccountLinkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//LOCATORS
	
	//ACKNOWLEDGEMENT NUMBER
	@FindBy(xpath="//input[@data-placeholder='Acknowledgement Number']")
	private WebElement acknumber;
	
	//ACKNOWLEDGEMENT DATE(DOB)
	@FindBy(xpath="//input[@data-placeholder='dd-mmm-yyyy']")
	private WebElement ackdate;
	
	//LOGIN LINK(EMAIL MOBILE AND DOB)
	@FindBy(xpath="//a[text()='Login with Mobile/Email ID and DOB']")
	private WebElement loginlinkwithmobileemildob;
	
	//BACK BUTTON
	@FindBy(xpath="//span[text()='Back']")
	private WebElement backbutton;
	
	//PROCEED BUTTON
	@FindBy(xpath="//span[text()='PROCEED']")
	private WebElement proceedbutton;

	
	

	
	//GETTER METHODS
	
	public WebElement getAcknumber() {
		return acknumber;
	}

	public WebElement getAckdate() {
		return ackdate;
	}

	public WebElement getLoginlinkwithmobileemildob() {
		return loginlinkwithmobileemildob;
	}

	public WebElement getBackbutton() {
		return backbutton;
	}

	public WebElement getProceedbutton() {
		return proceedbutton;
	}
	
	
	//BUSINESS LOGIC
	public WebElement loginlink()
	{
		loginlinkwithmobileemildob.click();
		return loginlinkwithmobileemildob;
	}
}
