package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;



public class TC_04_EnterFirstNameWithAlphanumericValue extends BaseClass {
	@Test
	   public void enterFirstName() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),' Invest Now ')]/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='mat-form-field-infix ng-tns-c87-4']")).sendKeys("abcde1234");
	}
	}
	

