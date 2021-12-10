package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;



public class TC_13_PanTextMoreThan10Alphanumeric extends BaseClass{
	@Test
	   public void enterFirstName() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),' Invest Now ')]/..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='pan']")).sendKeys("BLAP24675AHI");
	}
}
