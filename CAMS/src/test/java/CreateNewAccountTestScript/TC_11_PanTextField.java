package CreateNewAccountTestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

	public class TC_11_PanTextField extends BaseClass
	{
		@Test
		   public void PanTextFieldTest() throws Throwable 
		{
			ExcelUtility ex= new ExcelUtility();
			String pannum=ex.getExcelData("Sheet1", 1, 1);
			String accdata=pannum;
			
			System.out.println(pannum);
			
			HomePage hp=new HomePage(driver);
			hp.clickoninvestnow();
			
			OpenAccountPage op=new OpenAccountPage(driver);
			WebElement pan = op.pantext(pannum);
			String expdata = pan.getAttribute("value");
			
			SoftAssert s=new SoftAssert();
			s.assertTrue(accdata.contains(expdata));
			s.assertAll();
			System.out.println("Acutal panno:-"+accdata);
			System.out.println("Expected panno:-"+expdata);
			
		
			System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");
			
		
		}
}
