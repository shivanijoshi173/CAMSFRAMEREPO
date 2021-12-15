package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_25_EmailIdWithOneCharAndRestNum extends BaseClass
{
	@Test
	   public void EmailIdWithOneCharAndRestNumTest() throws Throwable 
	{
		ExcelUtility ex= new ExcelUtility();
		String emailid=ex.getExcelData("Sheet1", 5, 3);
		String accdata=emailid;
		System.out.println(accdata);
		//accdata.equalsIgnoreCase(emailid);
				
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		WebElement mail = op.emailtext(emailid);
		String expdata=mail.getAttribute("value");
		System.out.println(expdata);
		
		SoftAssert s=new SoftAssert();
		s.assertNotEquals(accdata, expdata);
		s.assertAll();
		System.out.println("Acutal Emailid:-"+accdata);
		System.out.println("Expected Emailid:-"+expdata);
		
	
		System.out.println(getClass().getName()+"\t"+"IS PASSED");
	
	
	}

}
