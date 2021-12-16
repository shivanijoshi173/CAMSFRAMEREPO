package testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class TC_37_MobileNumberCountryCodeWorkingOrNot extends BaseClass
{
	@Test
	public void MobileNumberCountryCodeWorkingOrNotTest() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.clickoninvestnow();
		
		OpenAccountPage op=new OpenAccountPage(driver);
		Thread.sleep(2000);
		op.countycodearrowmark();
		List<WebElement> arrow = op.countrycodelist();
		for (WebElement wb : arrow) 
		{	
				System.out.println(wb.getText());	
		}
		
		SoftAssert s=new SoftAssert();
		s.assertAll();

		System.out.println(getClass().getName()+"\n"+"THIS TEST CASE IS PASSED");		
	}}
