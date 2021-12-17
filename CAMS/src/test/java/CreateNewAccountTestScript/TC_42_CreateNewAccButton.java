package CreateNewAccountTestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_42_CreateNewAccButton extends BaseClass
{
	@Test
	public void CreateNewAccButtonTest() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		op.openaccbutton();
		SoftAssert s=new SoftAssert();
		s.assertAll();

		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");		
}
}