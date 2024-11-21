package ExtentReports;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CommonOrBase.CommonMethods;
import Pages.LoginPage;

public class ExtentReportExample2 extends CommonMethods {

	public static ExtentReports report;

	public static ExtentTest test;

	LoginPage lp;

	@BeforeSuite
	public void startTest() {

		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportExample2_EveningBatch.html");

		test = report.startTest("Execution Of The Test Cases");
	}

	@BeforeTest
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");

		launchingBrowser("Chrome");

		lp = new LoginPage(driver);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("i am in @BeforeClass method");

		waits();
	}

	@Test(priority = 1)
	public void loginToOrangeHRM() {

		lp.enterUsername();

		lp.enterPassword();

		lp.clickLogin();

		System.out.println(driver.getTitle());

		if (driver.getTitle().equalsIgnoreCase("OrangeHRM")) {

			test.log(LogStatus.PASS, "Title is same");

		} else {

			test.log(LogStatus.FAIL, "Title is not same");
		}

	}

	@Test(priority = 2)
	public void clickLogout() {

		System.out.println(driver.getTitle());

		String expected = "Testing";

		String actual = driver.getTitle();

		if (actual.equalsIgnoreCase(expected)) {

			test.log(LogStatus.PASS, "Title is same : " + actual);

		} else {

			test.log(LogStatus.FAIL, "Title is not same " + expected + " and " + actual);

		}
	}

	@AfterClass
	public void endTest() {

		report.endTest(test);

		report.flush();
	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();
	}

}
