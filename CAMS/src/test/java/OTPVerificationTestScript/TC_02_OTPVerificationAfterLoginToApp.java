package OTPVerificationTestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.LoginToExistingAccountLinkPage;
import com.cams.ObjectRepository.LoginWithMobileEmailIDandDOBLinkPage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_02_OTPVerificationAfterLoginToApp extends BaseClass
{
	@Test
	public void OTPVerificationAfterLoginToAppTest() throws Throwable
	{
		ExcelUtility ex=new ExcelUtility();
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		op.loginlink();
		
		LoginToExistingAccountLinkPage lo=new LoginToExistingAccountLinkPage(driver);
		lo.loginlink();
		String mobile = ex.getexceldatainstring("Sheet1", 10, 4);
		String dob = ex.getexceldatainstring("Sheet1", 10, 2);
		
		LoginWithMobileEmailIDandDOBLinkPage lp=new LoginWithMobileEmailIDandDOBLinkPage(driver);
		lp.mobile(mobile);
		lp.dob(dob);
		lp.proceedbutton();
		
		String otptext = lp.otp();
		System.out.println(otptext);
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(otptext.contains("OTP Verification"));
		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");	
		
		
		
	}
}
