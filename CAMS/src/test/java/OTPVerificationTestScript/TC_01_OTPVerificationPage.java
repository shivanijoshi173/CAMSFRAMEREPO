package OTPVerificationTestScript;

import java.util.Set;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.GenericLibrary.WebDriverUtility;
import com.cams.ObjectRepository.FirstOTPVerification;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_01_OTPVerificationPage extends BaseClass
{
	@Test
	public void OTPVerificationPageTest() throws Throwable
	{
		String title = null;
		ExcelUtility ex=new ExcelUtility();
		WebDriverUtility wb=new WebDriverUtility();
		wb.waitForPageLoad(driver);
		String Name=ex.getexceldatainstring("Sheet1", 10, 0);	
		//String acctdata=Name;
		String Pan=ex.getexceldatainstring("Sheet1",10 ,1);
		String DOB=ex.getexceldatainstring("Sheet1",10,2);
		String Email=ex.getexceldatainstring("Sheet1",10,3);
		String Mobile=ex.getexceldatainstring("Sheet1",10,4);
		
		
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
		FirstOTPVerification fo=new FirstOTPVerification(driver);
		String text = fo.getnameofOpenSub();
	
		System.out.println(text);
		
		Set<String>allwin=driver.getWindowHandles();
		for(String win:allwin )
		{
			driver.switchTo().window(win);
			title = driver.getTitle();
			System.out.println(title);
		}
		SoftAssert s=new SoftAssert();
		s.assertEquals(parent, title);
		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");	
	}

}
