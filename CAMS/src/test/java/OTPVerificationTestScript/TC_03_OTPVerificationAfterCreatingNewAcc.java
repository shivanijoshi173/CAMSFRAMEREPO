package OTPVerificationTestScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.GenericLibrary.WebDriverUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.MobileOTPVerificationPage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_03_OTPVerificationAfterCreatingNewAcc extends BaseClass
{
	@Test
	public void OTPVerificationAfterCreatingNewAccTest() throws Throwable
	{
		String title = null;
		ExcelUtility ex=new ExcelUtility();
		WebDriverUtility wb=new WebDriverUtility();
		wb.waitForPageLoad(driver);
		String Name=ex.getexceldatainstring("Sheet1", 13, 0);	
		String Pan=ex.getexceldatainstring("Sheet1",13 ,1);
		String DOB=ex.getexceldatainstring("Sheet1",13,2);
		String Email=ex.getexceldatainstring("Sheet1",13,3);
		String Mobile=ex.getexceldatainstring("Sheet1",13,4);
		
		String number = ex.getexceldatainstring("Sheet1",13,7);
		
		
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
		
		//Thread.sleep(8000);
		MobileOTPVerificationPage fo=new MobileOTPVerificationPage(driver);
		WebElement element = fo.getnameofOpenSub();
		wb.waitForElementToBeVisible(driver, element);
		
	
	

		
		fo.otptext(number);
		
	
	//	System.out.println(text);
//		
//		Set<String>allwin=driver.getWindowHandles();
//		for(String win:allwin )
//		{
//			driver.switchTo().window(win);
//			title = driver.getTitle();
//			System.out.println(title);
//		}
//		SoftAssert s=new SoftAssert();
//		s.assertEquals(parent, title);
//		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");	
	
	}
}
