package OTPVerificationTestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.GenericLibrary.WebDriverUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.MobileOTPVerificationPage;
import com.cams.ObjectRepository.OpenAccountPage;

public class demo extends BaseClass
{
	@Test
	public void demotest() throws Throwable
	{
		
		ExcelUtility ex=new ExcelUtility();
		WebDriverUtility wb=new WebDriverUtility();
		//wb.waitForPageLoad(driver);
		String Name=ex.getexceldatainstring("Sheet1", 13, 0);	
	
		String Pan=ex.getexceldatainstring("Sheet1",13 ,1);
		String DOB=ex.getexceldatainstring("Sheet1",13,2);
		String Email=ex.getexceldatainstring("Sheet1",13,3);
		String Mobile=ex.getexceldatainstring("Sheet1",13,4);
		
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		driver.getWindowHandle();
		String parent=driver.getTitle();
		System.out.println(parent);
		String FirstName = op.FirstName(Name).getAttribute("value");
		System.out.println("First name:"+FirstName);
		op.pantext(Pan);
		op.dobtext(DOB);
		op.emailtext(Email);
		op.mobile(Mobile);
		op.openaccbutton();
		
		
		MobileOTPVerificationPage fo=new MobileOTPVerificationPage(driver);
		
		fo.getnameofOpenSub();
		WebElement time = fo.timeout();
		wb.waitForElementToBeVisible(driver, time);
		WebElement button = fo.resendOTPButton();
		//String num = ex.getexceldatainstring("Sheet1",13,7);
		//fo.otptext(num);
		
		SoftAssert s= new SoftAssert();
		s.assertTrue(button.isEnabled());
		s.assertAll();
		
	
	}

}
