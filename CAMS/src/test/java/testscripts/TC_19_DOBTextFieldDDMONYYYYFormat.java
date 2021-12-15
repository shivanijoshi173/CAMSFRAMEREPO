package testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.GenericLibrary.ExcelUtility;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_19_DOBTextFieldDDMONYYYYFormat extends BaseClass
{
	@Test
	public void DOBTextFieldDDMONYYYYFormatTest() throws Throwable 
	{
		ExcelUtility ex=new ExcelUtility();
		String expdata=ex.getexceldatainstring("Sheet1", 1, 2);
	
		System.out.println("successfully entered");
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		
		OpenAccountPage op= new OpenAccountPage(driver);
		Thread.sleep(2000);
		 op.dobicon();
		
		 
		WebElement dob = op.dobtext();
		String actdata = dob.getAttribute("value");
		 System.out.println("actdata:"+actdata);

		 System.out.println("test case is pass");
		SoftAssert s=new SoftAssert();
		
		s.assertTrue(actdata.contains(expdata));
		System.out.println("expdata:-"+expdata);
		s.assertAll();
	

}}
