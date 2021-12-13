package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;



public class TC_12_PanWithOnlyChar extends BaseClass{
	@Test
	   public void PanWithOnlyCharTest() throws Throwable 
	{
		ExcelUtility ex=new ExcelUtility();
		
		//input data to the pan textfield
		String pannum = ex.getExcelData("Sheet1", 2, 1);
		String accdata=pannum; 
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		op.pantext(pannum);
	
		Thread.sleep(2000);
		
		String msg = op.captureerrormsg();
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(msg.contains("PAN entered is incorrect"));
		
		s.assertAll();
		
		System.out.println(accdata);
		System.out.println("got this message for invalid input = "+msg);
		System.out.println(getClass().getName()+"\n"+"this test case is passed");
	}
}
