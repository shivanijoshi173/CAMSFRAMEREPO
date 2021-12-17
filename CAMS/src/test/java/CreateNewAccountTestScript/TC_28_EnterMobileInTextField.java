	package CreateNewAccountTestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_28_EnterMobileInTextField extends BaseClass
{
	@Test
	   public void EnterMobileinInTextFieldTest() throws Throwable 
	{
		ExcelUtility ex= new ExcelUtility();
		 String mobile = ex.getexceldatainstring("Sheet1", 1, 4);
	
		String accdata=mobile;
				
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		WebElement mob = op.mobile(mobile);
		String expdata = mob.getAttribute("value");
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(accdata.contains(expdata));
		s.assertAll();
		System.out.println("Acutal Mobile:-"+accdata);
		System.out.println("Expected Mobile:-"+expdata);
		
	
		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");
		
	
	}
}
