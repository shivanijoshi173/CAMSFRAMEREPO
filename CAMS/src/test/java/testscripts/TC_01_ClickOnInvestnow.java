package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;


//@Listeners(com.cams.autodesk.genericutility.Listners.class)

public class TC_01_ClickOnInvestnow extends BaseClass{
	
	@Test
	public void enterFirstName() 
	{
		System.out.println("successfully entered");	
		HomePage lp=new HomePage(driver);
		lp.clickoninvestnow();
	}

}
