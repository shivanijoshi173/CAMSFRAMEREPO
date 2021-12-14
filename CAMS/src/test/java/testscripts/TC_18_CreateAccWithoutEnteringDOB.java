package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
		
		OpenAccountPage op= new OpenAccountPage(driver);
		op.dobtext();
		
//		//driver.findElement(By.xpath("//div[@class='mat-calendar-arrow']")).click();
//		//driver.findElement(By.xpath("//button[@aria-label='Previous 20 years']")).click();
//		driver.findElement(By.xpath("(//table[@class='mat-calendar-table']/tbody/tr/td[*])[3]")).click();
//		
//		 Thread.sleep(2000);
//		
//	     driver.findElement(By.xpath("(//table[@class='mat-calendar-table']/tbody/tr/td[*])[5]")).click();
//	     
//		driver.findElement(By.xpath("(//table[@class='mat-calendar-table']/tbody/tr/td[*])[5]")).click();
	}
}
