package CreateNewAccountTestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_31_MobileNumberWith11Digit extends BaseClass
{
	@Test
	public void EnterValidMobileNumberInMobileNumbertextFieldTest() throws Throwable
	{
		
		ExcelUtility ex=new ExcelUtility();
	
		
		String mobile = ex.getexceldatainstring("Sheet1", 4, 4);
		String accdata=mobile;
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		OpenAccountPage op=new OpenAccountPage(driver);
	
		WebElement mob = op.mobile(mobile);
		
		String expdata = mob.getAttribute("value");
		
		System.out.println("accdata:-"+accdata);
		System.out.println("expdata:-"+expdata); 

		SoftAssert s=new SoftAssert();
		s.assertNotEquals(accdata, expdata);
		s.assertAll();

		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");

		
	}

}
