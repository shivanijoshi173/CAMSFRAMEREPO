package CreateNewAccountTestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selectclassdemo  {
	@Test
	public void selectdemo() throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://sitapp.camsnps.com:40002/CRA/auth/enps/register");
		String title = driver.getTitle();
		System.out.println(title);

	}
}