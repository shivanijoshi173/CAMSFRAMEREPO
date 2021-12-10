package com.cams.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage 
{
	public OpenAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//find all the webelement by @findBy,@findBys
	@FindBy(xpath ="//input[@formcontrolname='name']")
	private WebElement firstname;

	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c87-5']")
	private WebElement pan;
	
	@FindBy(xpath="//input[@formcontrolname='dob']")
	private WebElement dob;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='mobile']")
	private WebElement mob;

	
	//provied getter method
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getPan() {
		return pan;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMob() {
		return mob;
	}
	
	//business logic
	public void firstName(String name) {
		 firstname.sendKeys(name);
	}
	
	

}
