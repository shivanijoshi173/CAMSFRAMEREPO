package OTPVerificationTestScript;

import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.LoginToExistingAccountLinkPage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_02_OTPVerificationAfterLoginToApp extends BaseClass
{
	@Test
	public void OTPVerificationAfterLoginToAppTest()
	{
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		op.loginlink();
		
		LoginToExistingAccountLinkPage lo=new LoginToExistingAccountLinkPage(driver);
		lo.loginlink();
		
		
	}
}
