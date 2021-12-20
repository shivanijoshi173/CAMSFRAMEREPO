package OTPVerificationTestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.EmailOTPVerificationPage;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.MobileOTPVerificationPage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_07_OTPVerificationGettingEmailVerificationpageOrNot extends BaseClass 
{
	@Test
	public void OTPVerificationGettingEmailVerificationpageOrNotText() throws Throwable
	{
		
		ExcelUtility ex=new ExcelUtility();
		
		String Name=ex.getexceldatainstring("Sheet1", 16, 0);	
		String Pan=ex.getexceldatainstring("Sheet1",16 ,1);
		String DOB=ex.getexceldatainstring("Sheet1",16,2);
		String Email=ex.getexceldatainstring("Sheet1",16,3);
		String Mobile=ex.getexceldatainstring("Sheet1",16,4);
		
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
		
		String num = ex.getexceldatainstring("Sheet1",16,7);
		fo.otptext(num);
		EmailOTPVerificationPage mail=new EmailOTPVerificationPage(driver);
		String email = mail.emailtextdata();
		System.out.println(email);
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(email.contains("OTP sent to your Registered Email id"));
		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");	
		
	}
}
