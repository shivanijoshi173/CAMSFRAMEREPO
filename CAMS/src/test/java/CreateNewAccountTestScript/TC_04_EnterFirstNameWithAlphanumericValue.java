package CreateNewAccountTestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;



public class TC_04_EnterFirstNameWithAlphanumericValue extends BaseClass {
	@Test
	   public void enterFirstName() throws Throwable 
	{
		ExcelUtility ex= new ExcelUtility();
		String name = ex.getExcelData("Sheet1",3,0);
		String acctdata=name;
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		WebElement fn = op.FirstName(name);
		String expdata = fn.getAttribute("value");
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(!acctdata.contains(expdata));
		s.assertAll();
		System.out.println("test case pass");
		System.out.println("actdata = "+acctdata);
		System.out.println("expecteddata= "+expdata);
		
	
	}
	}
	

