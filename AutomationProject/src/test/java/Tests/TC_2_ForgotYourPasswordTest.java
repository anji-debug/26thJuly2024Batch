package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CommonOrBase.CommonMethods;
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class TC_2_ForgotYourPasswordTest extends CommonMethods {

	LoginPage lp;

	ForgotYourPasswordMethods fpm;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");

		launchingBrowser("chrome");

		lp = new LoginPage(driver);

		fpm = new ForgotYourPasswordMethods(driver);

		screenshot("TC_2_ForgotYourPasswordTest_launchBrowser");

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		browserMaximize();

		screenshot("TC_2_ForgotYourPasswordTest_launchURL");

		System.out.println("i am in @BeforeClass method");
	}

	@BeforeMethod
	public void waitingTime() {

		waits();

		System.out.println("i am in @BeforeMethod method");

	}

	@Test(priority = 0)
	public void verifyForgotYourPassword() throws IOException {

		lp.verifyForgotYourPassword();

		screenshot("TC_2_ForgotYourPasswordTest_verifyForgotYourPassword");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 1)
	public void clickForgotYourPassword() throws IOException {

		lp.clickForgotYourPassword();

		screenshot("TC_2_ForgotYourPasswordTest_clickForgotYourPassword");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 2)
	public void enterUsername() throws IOException {

		fpm.enterUsername();

		screenshot("TC_2_ForgotYourPasswordTest_enterUsername");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 3)
	public void clickCancel() {

		fpm.clickCancel();

		System.out.println("i am in clickCancel method");
	}

	@AfterMethod
	public void waitingTime1() {

		waits();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {

		screenshot("TC_2_ForgotYourPasswordTest_closeBrowser");

		System.out.println("i am in @aftersuite method");

		browserClosing();

	}

}
