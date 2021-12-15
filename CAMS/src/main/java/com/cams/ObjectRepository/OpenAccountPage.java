package com.cams.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage {
	public OpenAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find all the webelement by @findBy,@findBys
	//FIRST NAME
	@FindBy(xpath = "//input[@formcontrolname='name']")
	private WebElement firstname;

	//PAN NUMBER
	@FindBy(xpath = "//input[@placeholder='PAN']")
	private WebElement pan;

	//DOBIICON
	@FindBy(xpath = "//*[name()='svg' and @class='mat-datepicker-toggle-default-icon ng-star-inserted']")
	private WebElement dob;

	//DOBTEXTFIELD
	@FindBy(xpath = "//input[@id='mat-input-2']")
	private WebElement dobtestfield;

	//DOBICONARROW
	@FindBy(xpath = "//div[@class='mat-calendar-arrow']")
	private WebElement arrow;

	//DOBICONPREVIOUSARROW
	@FindBy(xpath = "//button[@aria-label='Previous 20 years']")
	private WebElement previousarrow;

	//DOBARROWYEAR
	@FindBy(xpath = "(//table[@class='mat-calendar-table']/tbody/tr/td[*])[3]")
	private WebElement year;

	//DOBICONMONTH
	@FindBy(xpath = "(//table[@class='mat-calendar-table']/tbody/tr/td[*])[5]")
	private WebElement month;

	//DOBICONDATE
	@FindBy(xpath = "(//table[@class='mat-calendar-table']/tbody/tr/td[*])[5]")
	private WebElement date;

	//EMAIL
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement email;

	//MOBILENUMBER
	@FindBy(xpath = "//input[@formcontrolname='mobile']")
	private WebElement mob;

	//OPENNEWACCBUTTON
	@FindBy(xpath = "//span[text()=' OPEN NEW ACCOUNT']")
	private WebElement opennewaccountbutton;

	//PANERRORMSG
	@FindBy(xpath = "//mat-error[text()=' PAN entered is incorrect ']")
	private WebElement Panerrormsg;

	//DOBERRORMSG
	@FindBy(xpath = "//mat-error[text()='Age should be 18 years to 65 years']")
	private WebElement DOBerrormsg;
	
	//EMAILERRORMSG
	@FindBy(xpath="//mat-error[text()=' Not a valid emailaddress ']")
	public WebElement emailerrormsg;

	

	// provied getter method
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getErrormsg() {
		return Panerrormsg;
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
	public WebElement getDobtestfield() {
		return dobtestfield;
	}

	public WebElement getDOBerrormsg() {
		return DOBerrormsg;
	}

	public WebElement getPreviousarrow() {
		return previousarrow;
	}
	public WebElement getEmailerrormsg() {
		return emailerrormsg;
	}

	// business logic
	public WebElement FirstName(String name) {
		firstname.sendKeys(name);
		return firstname;
	}

	public boolean openaccbutton() {
		return opennewaccountbutton.isEnabled();
	}

	public WebElement pantext(String pannum) {
		pan.sendKeys(pannum, Keys.TAB);
		return pan;
	}

	public String capturePanerrormsg() {
		return Panerrormsg.getText();
	}

	public String captureDOBerrormsg() {
		return DOBerrormsg.getText();
		
	}
	public void dobicon() throws InterruptedException {
		dob.click();
		Thread.sleep(2000);
		arrow.click();
		previousarrow.click();
		year.click();
		month.click();
		date.click();

	}

	public WebElement dobtext() {
		return dobtestfield;
	}

	public void dobbelow18(String dobbelow18) {
		dobtestfield.sendKeys(dobbelow18, Keys.TAB);
	}
	
	public WebElement emailtext(String emailid)
	{
		email.sendKeys(emailid,Keys.TAB);
		return email;
	}
	
	public String captureemailerrormsg() {
		return emailerrormsg.getText();
		
	}
}
