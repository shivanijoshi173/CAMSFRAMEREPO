package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;



public class TC_17_CreateAccWithoutEnteringPannumber extends BaseClass
{
	@Test
	   public void enterFirstName() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),' Invest Now ')]/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-0")).sendKeys("prem");
		driver.findElement(By.xpath("//input[@formcontrolname='pan']")).sendKeys("");
		driver.findElement(By.id("mat-input-2")).sendKeys("10-Feb-1998");
		driver.findElement(By.id("mat-input-3")).sendKeys("prem@gmail.com");
		driver.findElement(By.id("mat-input-4")).sendKeys("8888888888");
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn_bg mat-raised-button mat-button-base mat-button-disabled']")).click();
		

//	String msg = driver.findElement(By.xpath("//*[@class='mat-error ng-tns-c87-5 ng-star-inserted' and @id='mat-error-0']")).getText();
//	System.out.println(msg);
		Thread.sleep(1000);
		driver.close();
	}
}
