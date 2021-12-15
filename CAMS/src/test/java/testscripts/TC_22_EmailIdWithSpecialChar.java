package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_22_EmailIdWithSpecialChar extends BaseClass
{
	@Test
	   public void EmailIdWithSpecialCharTest() throws Throwable 
	{
		ExcelUtility ex= new ExcelUtility();
		String emailid=ex.getExcelData("Sheet1", 2, 3);
		String accdata=emailid;
				
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		WebElement mail = op.emailtext(emailid);
		String expdata=mail.getAttribute("value");
		
		String email = op.captureemailerrormsg();
		
		System.out.println("errormsg:="+email);
		SoftAssert s=new SoftAssert();
		s.assertTrue(email.contains("Not a valid emailaddress"));
		s.assertAll();
		System.out.println("Acutal Emailid:-"+accdata);
		System.out.println("Expected Emailid:-"+expdata);
		
	
		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");
		
	
	}

}
