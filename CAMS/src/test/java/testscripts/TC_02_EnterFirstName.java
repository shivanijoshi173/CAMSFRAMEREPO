package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;


public class TC_02_EnterFirstName extends BaseClass {
	

	@Test
   public void enterFirstName() throws Throwable {
		
		//fetching data from ExcelSheet
		ExcelUtility exc=new ExcelUtility();
		String name=exc.getExcelData("Sheet1", 1, 0);
		
		
		HomePage lp=new HomePage(driver);
		lp.clickoninvestnow();
	
		OpenAccountPage oap=new OpenAccountPage(driver);
		oap.firstName(name);
   }
}
