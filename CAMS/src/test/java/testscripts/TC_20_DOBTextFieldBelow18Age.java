package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_20_DOBTextFieldBelow18Age extends BaseClass
{
	@Test
	public void DOBTextFieldBelow18AgeTest() throws Throwable 
	{
		ExcelUtility ex=new ExcelUtility();
		String DOB=ex.getexceldatainstring("Sheet1", 2, 2);
	
		System.out.println("successfully entered");
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		
		OpenAccountPage op= new OpenAccountPage(driver);
		op.dobbelow18(DOB);
		Thread.sleep(2000);
		String msg=op.captureDOBerrormsg();
		System.out.println("ERROR MSG:-"+msg);
		SoftAssert s=new SoftAssert();
		s.assertTrue(msg.contains("Age should be 18 years to 65 years"));
		s.assertAll();
		
	}
}
