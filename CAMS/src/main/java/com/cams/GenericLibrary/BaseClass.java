package com.cams.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public DatabaseUtility dLib = new DatabaseUtility();
	public JsonUtility jsonLib = new JsonUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriver driver;
	public static WebDriver staticdriver;

	@BeforeSuite
	public void connectDB() throws Throwable {
		// dLib.connectToDatabase();
		System.out.println("=======MakeDBConnection========");
	}

	@BeforeClass
	public void launchBrowser() throws Throwable {
		System.out.println("========launchBrowser==========");
		String BROWSER = jsonLib.readDataFromJSON("browser");
		String URL = jsonLib.readDataFromJSON("url");
		if (BROWSER.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser");
		}
		wLib.waitForPageLoad(driver);
		wLib.maximiseWindow(driver);
		driver.get(URL);
		staticdriver = driver;
	}

	@BeforeMethod
	public void loginToApp() throws Throwable {
		System.out.println("=====LoginApp======");

	}

	@AfterMethod
	public void logoutofApp() {
		System.out.println("======logoutOfApp");

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("========closeBrowser========");
		// driver.close();
	}

	@AfterSuite
	public void closeDB() throws Throwable {
		dLib.closeDb();
		System.out.println("==============close=============");
	}

	/**
	 * method for Screenshot
	 * 
	 * @param name
	 * @return
	 * @throws IOException
	 */
	public String getscreenshot(String name) throws IOException {
		File srcfile = ((TakesScreenshot) staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir") + "/Screenshots/" + name + jLib.getrandomNum() + " .png";
		File finaldest = new File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		return destfile;

	}
}