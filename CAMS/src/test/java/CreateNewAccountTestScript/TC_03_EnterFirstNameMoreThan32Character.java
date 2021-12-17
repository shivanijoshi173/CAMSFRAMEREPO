package CreateNewAccountTestScript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;


public class TC_03_EnterFirstNameMoreThan32Character extends BaseClass 
{
	@Test
	   public void EnterFirstNameMoreThan32CharacterTest() throws Throwable
	{
		
		//fetching data from ExcelSheet
		
		ExcelUtility exc=new ExcelUtility();
		String name=exc.getExcelData("Sheet1", 2, 0);
		String acctdata=name;
		
		HomePage lp=new HomePage(driver);
		lp.clickoninvestnow();
	
		OpenAccountPage oap=new OpenAccountPage(driver);
		WebElement fn = oap.FirstName(name);
		String expdata=fn.getAttribute("value");
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(acctdata.equalsIgnoreCase(expdata));
		s.assertAll();
		System.out.println("test case pass");
		System.out.println("actdata = "+acctdata);
		System.out.println("expecteddata= "+expdata);
   }
	
	}

