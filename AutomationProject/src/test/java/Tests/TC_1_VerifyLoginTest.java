package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CommonOrBase.CommonMethods;
import Pages.LoginPage;

public class TC_1_VerifyLoginTest extends CommonMethods {

	LoginPage lp;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");

		launchingBrowser("chrome");

		lp = new LoginPage(driver);

		screenshot("TC_1_VerifyLoginTest_launchBrowser");

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		browserMaximize();

		screenshot("TC_1_VerifyLoginTest_launchURL");

		System.out.println("i am in @BeforeClass method");
	}

	@BeforeMethod
	public void waitingTime() {

		waits();

		System.out.println("i am in @BeforeMethod method");

	}

	@Test(priority = 0)
	public void verifyLogo() throws IOException {

		lp.verifyLogo();

		screenshot("TC_1_VerifyLoginTest_verifyLogo");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 1)
	public void verifyForgotYourPassword() throws IOException {

		lp.verifyForgotYourPassword();

		screenshot("TC_1_VerifyLoginTest_verifyForgotYourPassword");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 2)
	public void verifyDasdas() throws IOException {

		lp.verifyDasdas();

		screenshot("TC_1_VerifyLoginTest_Dasdas");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 3)
	public void enterUsername() throws IOException {

		lp.enterUsername();
		;

		screenshot("TC_1_VerifyLoginTest_enterUsername");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 4)
	public void enterPassword() throws IOException {

		lp.enterPassword();

		screenshot("TC_1_VerifyLoginTest_enterPassword");

		System.out.println("i am in enterPassword method");
	}

	@Test(priority = 3)
	public void clickLogin() {

		lp.clickLogin();

		System.out.println("i am in clickLogin method");
	}

	@AfterMethod
	public void waitingTime1() {

		waits();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {

		screenshot("TC_1_VerifyLoginTest_closeBrowser");

		System.out.println("i am in @aftersuite method");

		browserClosing();

	}

}
