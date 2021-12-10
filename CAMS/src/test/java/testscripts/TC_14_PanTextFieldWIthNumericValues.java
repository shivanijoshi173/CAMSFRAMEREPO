package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;



public class TC_14_PanTextFieldWIthNumericValues extends BaseClass{
	@Test
	   public void enterFirstName() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),' Invest Now ')]/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='pan']")).sendKeys("1234567890");
//	String msg = driver.findElement(By.xpath("//*[@class='mat-error ng-tns-c87-5 ng-star-inserted' and @id='mat-error-0']")).getText();
//	System.out.println(msg);
		Thread.sleep(1000);
		driver.close();
	}
}
