package OTPVerificationTestScript;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.GenericLibrary.WebDriverUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.MobileOTPVerificationPage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_05_PasteOTPInOtpTextfield extends BaseClass 
{
	@Test
	public void PasteOTPInOtpTextfieldTest() throws Throwable
	{

		String title = null;
		ExcelUtility ex=new ExcelUtility();
		WebDriverUtility wb=new WebDriverUtility();
		wb.waitForPageLoad(driver);
		String Name=ex.getexceldatainstring("Sheet1", 15, 0);	
		String Pan=ex.getexceldatainstring("Sheet1",15 ,1);
		String DOB=ex.getexceldatainstring("Sheet1",15,2);
		String Email=ex.getexceldatainstring("Sheet1",15,3);
		String Mobile=ex.getexceldatainstring("Sheet1",15,4);
		
		
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
		String text = fo.getnameofOpenSub();
		String num = ex.getexceldatainstring("Sheet1",15,7);
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		//fo.otptext(num);
	}
}
