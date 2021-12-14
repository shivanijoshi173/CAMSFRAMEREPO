package com.cams.ObjectRepository;

import org.openqa.selenium.Keys;
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

	@FindBy(xpath="//input[@placeholder='PAN']")
	private WebElement pan;
	
	@FindBy(xpath="//*[name()='svg' and @class='mat-datepicker-toggle-default-icon ng-star-inserted']")
	private WebElement dob;
	
	@FindBy(xpath="//div[@class='mat-calendar-arrow']")
	private WebElement arrow;
	
	@FindBy(xpath="//button[@aria-label='Previous 20 years']")
	private WebElement previousarrow;
	
	@FindBy(xpath="(//table[@class='mat-calendar-table']/tbody/tr/td[*])[3]")
	private WebElement year;
	
	@FindBy(xpath="(//table[@class='mat-calendar-table']/tbody/tr/td[*])[5]")
	private WebElement month;
	
	@FindBy(xpath="(//table[@class='mat-calendar-table']/tbody/tr/td[*])[5]")
	private WebElement date;
	
	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getyear() {
		return year;
	}

	public WebElement getArrow() {
		return arrow;
	}

	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='mobile']")
	private WebElement mob;
	
	@FindBy(xpath="//span[text()=' OPEN NEW ACCOUNT']")
	private WebElement opennewaccountbutton;

	@FindBy(xpath="//mat-error[text()=' PAN entered is incorrect ']")
	private WebElement errormsg;
	
	public WebElement getPreviousarrow() {
		return previousarrow;
	}

	//provied getter method
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getErrormsg() 
	{
		return errormsg;
	}

	public WebElement getPan() {
		return pan;
	}

	public WebElement getOpennewaccountbutton() {
		return opennewaccountbutton;
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
	public WebElement FirstName(String name)
	{
		 firstname.sendKeys(name);
		return firstname;
	}
	
	public boolean openaccbutton()
	{
		return opennewaccountbutton.isEnabled();
	}
	
	public WebElement pantext(String pannum) {
		pan.sendKeys(pannum,Keys.TAB);
		return pan;
	}
	public String captureerrormsg()
	{
		return errormsg.getText();
	}

	public void dobtext() throws InterruptedException
	{
		dob.click();
		Thread.sleep(2000);
		arrow.click();
		previousarrow.click();
		year.click();
		month.click();
		date.click();
	}
}
