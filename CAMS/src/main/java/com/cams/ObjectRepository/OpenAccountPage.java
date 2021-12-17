package com.cams.ObjectRepository;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class OpenAccountPage {
	public OpenAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find all the webelement by @findBy,@findBys
	
	//FIRSTNAME TEXT
	@FindBy(xpath="//mat-label[text()='First Name']")
	private WebElement name;
	
	//FIRSTNAMETEXTFIELD 
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
	
	//DOBREQUIREDERRORMSG
	@FindBy(xpath="//mat-error[text()=' This field is required ']")
	private WebElement DOBREQUIREDerrormsg;
	
	//EMAILERRORMSG
	@FindBy(xpath="//mat-error[text()=' Not a valid emailaddress ']")
	private WebElement emailerrormsg;

	//MOBILEERRORMSG
	@FindBy(xpath="//mat-error[text()='Mobile Number length should be 10']")
	private WebElement mobileerrormsg;
	
	//MOBILEFIELDREQUIREDerror
	@FindBy(xpath="//mat-error[text()='This field is required']")
	private WebElement mobilerequirederror;

	//MOBILENOCOUNTRYCODE
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c150-9']")
	private WebElement countrycode;
	
	
	//LISTOFCOUNTRYCODE
	@FindBy(xpath="//span[@class='mat-option-text']")
	private List<WebElement> ListofCountrycode;
	
	
	//LOGINLINK
	@FindBy(xpath="//a[text()='Login to Existing Account']")
	private WebElement link;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// provied getter method
	public WebElement getName() {
		return name;
	}
	
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

	public WebElement getDOBREQUIREDerrormsg() {
		return DOBREQUIREDerrormsg;
	}

	public WebElement getPreviousarrow() {
		return previousarrow;
	}
	public WebElement getEmailerrormsg() {
		return emailerrormsg;
	}
	
	public WebElement getMobileerrormsg() {
		return mobileerrormsg;
	}
	
	public WebElement getMobilerequirederror() {
		return mobilerequirederror;
	}
	
	public WebElement getCountrycode() {
		return countrycode;
	}
	

	public List<WebElement> getListofCountrycode() {
		return ListofCountrycode;
	}

	public WebElement getLink() {
		return link;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	// business logic
	public WebElement Fname()
	{
		return firstname;
	}
	
	//FIRSTNAMETEXT
	public WebElement FirstName(String name) {
		firstname.sendKeys(name);
		return firstname;
	}
	
	//PANTEXT
	public WebElement pantext(String pannum) {
		pan.sendKeys(pannum, Keys.TAB);
		return pan;
	}
	
	//PANERRORMSG
	public String capturePanerrormsg() {
		return Panerrormsg.getText();
	}
	
	//DOBTEXTFIELD
	public WebElement dobtext(String dob) {
		dobtestfield.sendKeys(dob);
		return dobtestfield;
	}
	
	//DOBICON
	public void dobicon() throws InterruptedException 
	{
		dob.click();
		Thread.sleep(2000);
		arrow.click();
		previousarrow.click();
		year.click();
		month.click();
		date.click();

	}
	
	//DOBERRORMSG
	public String captureDOBerrormsg() 
	{
		return DOBerrormsg.getText();	
	}
	
	//DOBREQUIREDERRORMSG
	public String captureDOBRequiredError()
	{
		return DOBREQUIREDerrormsg.getText();
		
	}
	//DOBBELOW18
	public void dobbelow18(String dobbelow18) {
		dobtestfield.sendKeys(dobbelow18, Keys.TAB);
	}
	
	//EMAILTEXT
	public WebElement emailtext(String emailid)
	{
		email.sendKeys(emailid,Keys.TAB);
		return email;
	}
	
	//EMAILERRORMSG
	public String captureemailerrormsg() 
	{
		return emailerrormsg.getText();
		
	}

	
	public WebElement mobile(String mobiletext) 
	{
		mob.sendKeys(mobiletext,Keys.TAB);
	
		return mob;
	}
	
	public String captureMobileerrormsg()
	{
		return mobileerrormsg.getText();
	}
	
	public String captureMobilenorequirederrormsg()
	{
		return mobilerequirederror.getText();
		
	}
	
	public WebElement countycodearrowmark()
	{
		countrycode.click();
		return countrycode;
	}
	
	public List<WebElement> countrycodelist() {
		return ListofCountrycode;
	}
	
	
	public void loginlink()
	{
		link.click();
	}
	
	
	
	
	//OPENACCOUNTWITHEMPTYFIELDS
	public void OpenAccWithEmptyFields() throws Throwable
	{
		firstname.sendKeys(Keys.TAB);
		pan.sendKeys(Keys.TAB);
		dob.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		email.sendKeys(Keys.TAB);
		mob.sendKeys(Keys.TAB);
	
		
	}
	
	
	//OPENNEWACCOUNTBUTTON
	public boolean openaccbutton() 
	{
		opennewaccountbutton.click();
		return opennewaccountbutton.isEnabled();
		
	}

	

	

	
	

	

	
	
	
	
	
}
