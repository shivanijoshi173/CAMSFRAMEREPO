package CreateNewAccountTestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_21_EnterValidEmailIdTextField extends BaseClass
{
	@Test
	   public void EnterValidEmailIdTextFieldTest() throws Throwable 
	{
		ExcelUtility ex= new ExcelUtility();
		String emailid=ex.getExcelData("Sheet1", 1, 3);
		String accdata=emailid;
				
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		WebElement email = op.emailtext(emailid);
		String expdata = email.getAttribute("value");
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(accdata.contains(expdata));
		s.assertAll();
		System.out.println("Acutal Emailid:-"+accdata);
		System.out.println("Expected Emailid:-"+expdata);
		
	
		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");
		
	
	}
}
