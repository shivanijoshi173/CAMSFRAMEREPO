package testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.cams.GenericLibrary.BaseClass;
import com.cams.ObjectRepository.HomePage;
import com.cams.ObjectRepository.OpenAccountPage;

public class selectclassdemo extends BaseClass {
	@Test
	public void selectdemo() throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickoninvestnow();

		OpenAccountPage op = new OpenAccountPage(driver);
		Thread.sleep(2000);

		op.countycodearrowmark();
		Thread.sleep(3000);

		// List<WebElement> arrow=
		// driver.findElements(By.xpath("//span[@class='mat-option-text']"));

		List<WebElement> arrow = op.countrycodelist();
		for (WebElement wb : arrow) {
			
			if (wb.equals("+376 - (AD)"))
			{
				
				wb.click();
				System.out.println(wb.getText());
				
				break;
			}
		}

	}
}