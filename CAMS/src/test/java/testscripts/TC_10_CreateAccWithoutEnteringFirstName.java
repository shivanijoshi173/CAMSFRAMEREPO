package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;



public class TC_10_CreateAccWithoutEnteringFirstName extends BaseClass{
	@Test
	public void enterFirstName() throws Throwable {
		System.out.println("successfully entered");
		
//		LoginPage lp=new LoginPage(driver);
//		lp.clickoninvestnow();
		driver.findElement(By.xpath("//span[contains(text(),' Invest Now ')]/..")).click();
		Thread.sleep(2000);
		boolean button = driver.findElement(By.xpath("//span[text()=' OPEN NEW ACCOUNT']")).isEnabled();
		System.out.println(button);
		
		driver.close();
	}

}
