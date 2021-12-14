package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;



public class TC_15_PanTextFieldWithSpecialChar extends BaseClass
{
	@Test
	   public void PanTextFieldWithSpecialCharTest() throws Throwable {
		 ExcelUtility ex=new ExcelUtility();
			//input data to the pan textfield
			String pannum = ex.getExcelData("Sheet1", 5, 1);
			String accdata=pannum; 
			
			HomePage hp=new HomePage(driver);
			hp.clickoninvestnow();
			
			OpenAccountPage op=new OpenAccountPage(driver);
			WebElement pan = op.pantext(pannum);
		
			String expdata=pan.getAttribute("value");
			Thread.sleep(2000);
			String msg = op.captureerrormsg();
			SoftAssert s=new SoftAssert();
			s.assertTrue(msg.contains("PAN entered is incorrect"));
			s.assertTrue(!accdata.contains(expdata));
			s.assertAll();
			
			System.out.println("Actual data:-"+accdata);
			System.out.println("Expected data:-"+expdata);
			System.out.println("actual data should not be matched with expected data");
			System.out.println("got this message for invalid input = "+msg);
			System.out.println(getClass().getName()+"\n"+"this test case is passed");
	}

}
