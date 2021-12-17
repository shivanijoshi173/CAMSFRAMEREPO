package CreateNewAccountTestScript;

import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_47_CheckLoginLinkIsWorkingOrNot extends BaseClass 
{
	@Test
	public void CheckLoginLinkIsWorkingOrNotTest() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		op.loginlink();
		String title = driver.getTitle();
		System.out.println(title);
}
}