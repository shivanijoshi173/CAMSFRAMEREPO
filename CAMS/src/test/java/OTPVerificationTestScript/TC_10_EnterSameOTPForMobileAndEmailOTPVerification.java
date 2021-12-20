package OTPVerificationTestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.GenericLibrary.WebDriverUtility;
import com.cams.ObjectRepository.EmailOTPVerificationPage;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.MobileOTPVerificationPage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_10_EnterSameOTPForMobileAndEmailOTPVerification extends BaseClass 
{
	@Test
	public void EnterSameOTPForMobileAndEmailOTPVerificationTest() throws Throwable
	{
		ExcelUtility ex=new ExcelUtility();
		WebDriverUtility wb=new WebDriverUtility();
		String Name=ex.getexceldatainstring("Sheet1", 17, 0);	
		String Pan=ex.getexceldatainstring("Sheet1",17 ,1);
		String DOB=ex.getexceldatainstring("Sheet1",17,2);
		String Email=ex.getexceldatainstring("Sheet1",17,3);
		String Mobile=ex.getexceldatainstring("Sheet1",17,4);
		
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
		
		String num = ex.getexceldatainstring("Sheet1",17,7);
		fo.otptext(num);
		System.out.println(num);
		
		EmailOTPVerificationPage mail=new EmailOTPVerificationPage(driver);
		String text = mail.emailtextdata();
		System.out.println(text);
		
		String emailotp = ex.getexceldatainstring("Sheet1",17,7);
		mail.emailtextfield(emailotp);
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(num, emailotp);
		s.assertAll();
		
		
	}
}
