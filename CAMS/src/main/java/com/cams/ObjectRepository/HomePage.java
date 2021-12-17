package com.cams.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//WebDriver driver=null;
	public HomePage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	// find all the elements by @findBy
	@FindBy(xpath ="//span[contains(text(),' Invest Now ')]/..")
	private WebElement investnow;
	
	@FindBy(xpath="//span[contains(text(),' Calculate pension ')]")
	private WebElement Calculatepension;
	
    public WebElement getCalculatepension() {
		return Calculatepension;
	}

	//provide getter method
	public WebElement getInvestnow() {
		return investnow;
	}

	// provide businesslogic
	public void clickoninvestnow() {
		investnow.click();
	}
	public void clickonCalculatepension()
	{
		Calculatepension.click();
	}

}
