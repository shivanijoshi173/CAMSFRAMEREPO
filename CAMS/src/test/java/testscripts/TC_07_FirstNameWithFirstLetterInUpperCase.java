package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;


public class TC_07_FirstNameWithFirstLetterInUpperCase extends BaseClass {
	@Test
	   public void FirstNameWithFirstLetterInUpperCaseTest() throws Throwable {
		ExcelUtility ex=new ExcelUtility();
		String name=ex.getExcelData("Sheet1", 6, 0);
		String accdata=name;
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op= new OpenAccountPage(driver);
		WebElement fn=op.FirstName(name);
		String expdata=fn.getAttribute("value");
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(accdata.contains(expdata));
		s.assertAll();
		System.out.println("Actual data:-"+accdata);
		System.out.println("Expected data:-"+expdata);
		System.out.println("test case is pass");
}
}
