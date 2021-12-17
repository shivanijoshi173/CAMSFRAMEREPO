package CreateNewAccountTestScript;

import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;

public class TC_01_ClickOnInvestnow extends BaseClass{
	
	@Test
	public void ClickOnInvestnowTest() 
	{
		System.out.println("successfully entered");	
		
		HomePage lp=new HomePage(driver);
		lp.clickoninvestnow();
	}

}
