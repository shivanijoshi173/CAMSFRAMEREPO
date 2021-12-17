package CreateNewAccountTestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.GenericLibrary.WebDriverUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_45_CreateNewAccountWithoutEnteringAnyCredentials extends BaseClass
{
	@Test
	public void CreateNewAccountWithoutEnteringAnyCredentialsTest() throws Throwable
	{
		ExcelUtility ex=new ExcelUtility();
		WebDriverUtility wb=new WebDriverUtility();
		wb.waitForPageLoad(driver);
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		String Name=ex.getexceldatainstring("Sheet1", 12, 0);
		String Pan=ex.getexceldatainstring("Sheet1",12 ,1);
		String DOB=ex.getexceldatainstring("Sheet1",12 ,2);
		String Email=ex.getexceldatainstring("Sheet1",12,3);
		String Mobile=ex.getexceldatainstring("Sheet1",12,4);
		
		op.FirstName(Name);
		op.pantext(Pan);
		op.emailtext(Email);
		op.mobile(Mobile);
		op.openaccbutton();
		Thread.sleep(2000);
		String error = op.captureDOBRequiredError();
		System.out.println("ITS GINING MESSAGE AS :="+error);
		SoftAssert s=new SoftAssert();
		s.assertTrue(error.contains("This field is required"));
		s.assertAll();
		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");	
	}
}
