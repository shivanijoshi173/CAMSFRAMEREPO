package CreateNewAccountTestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_44_CreateNewAccountWithoutEnteringAnyOneField extends BaseClass
{	@Test
	public void CreateNewAccountWithoutEnteringAnyOneFieldTest() throws Throwable
	{
		
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		op.OpenAccWithEmptyFields();

		String error = op.captureDOBRequiredError();
		System.out.println(error);
		//SoftAssert s=new SoftAssert();
//		s.assertTrue(error.contains("This field is required"));
//		s.assertAll();
//		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");	
	}

}
