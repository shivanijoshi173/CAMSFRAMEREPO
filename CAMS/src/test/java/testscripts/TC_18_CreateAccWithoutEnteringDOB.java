package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_18_CreateAccWithoutEnteringDOB extends BaseClass
{
	@Test
	public void CreateAccWithoutEnteringDOBTest() throws InterruptedException
	{
		System.out.println("successfully entered");
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		Thread.sleep(2000);
		OpenAccountPage op= new OpenAccountPage(driver);
		boolean button = op.openaccbutton();
		System.out.println(button);
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(button, true);
		s.assertAll();
		System.out.println("test case is pass");
	
	}
}
