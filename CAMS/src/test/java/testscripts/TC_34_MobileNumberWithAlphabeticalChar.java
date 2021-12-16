package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_34_MobileNumberWithAlphabeticalChar extends BaseClass
{
	@Test
	public void MobileNumberWithAlphabeticalCharTest() throws Throwable
	{
		
		ExcelUtility ex=new ExcelUtility();
		String mobile = ex.getexceldatainstring("Sheet1", 7, 4);
		String accdata=mobile;
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		OpenAccountPage op=new OpenAccountPage(driver);
		Thread.sleep(2000);
		WebElement mob = op.mobile(mobile);
		String expdata = mob.getAttribute("value");
		Thread.sleep(3000);

		String msg = op.captureMobilenorequirederrormsg();
		System.out.println("accdata:-"+accdata);
		System.out.println("expdata:-"+expdata); 
		System.out.println("ITS GIVING MSG AS:=\t" +msg);


		SoftAssert s=new SoftAssert();
		s.assertTrue(msg.contains("This field is required"));
		s.assertAll();

		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");

		
	}
}
