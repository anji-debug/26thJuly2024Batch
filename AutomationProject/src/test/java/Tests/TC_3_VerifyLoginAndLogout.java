package Tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CommonOrBase.CommonMethods;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignoutPage;

public class TC_3_VerifyLoginAndLogout extends CommonMethods {

	LoginPage lp;

	HomePage hp;

	SignoutPage sp;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");

		launchingBrowser("chrome");

		lp = new LoginPage(driver);

		// Classname objectname = pagefactory.initElements(web driver object,
		// pagefactoryclass.class)

		hp = PageFactory.initElements(driver, HomePage.class);

		sp = PageFactory.initElements(driver, SignoutPage.class);

		screenshot("TC_3_VerifyLoginAndLogout_launchBrowser");

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		browserMaximize();

		screenshot("TC_3_VerifyLoginAndLogout_launchURL");

		System.out.println("i am in @BeforeClass method");
	}

	@BeforeMethod
	public void waitingTime() {

		waits();

		System.out.println("i am in @BeforeMethod method");

	}

	@Test(priority = 1)
	public void enterUsername() throws IOException {

		lp.enterUsername();

		screenshot("TC_3_VerifyLoginAndLogout_enterUsername");

		System.out.println("i am in enterUsername method");
	}

	@Test(priority = 2)
	public void enterPassword() throws IOException {

		lp.enterPassword();

		screenshot("TC_3_VerifyLoginAndLogout_enterPassword");

		System.out.println("i am in enterPassword method");
	}

	@Test(priority = 3)
	public void clickLogin() {

		lp.clickLogin();

		System.out.println("i am in clickLogin method");
	}

	@Test(priority = 4)
	public void clickUserDropdown() {

		hp.clickDropdown();

		System.out.println("i am in clickLogin method");
	}

	@Test(priority = 5)
	public void clickLogout() {

		sp.clickLogout();

		System.out.println("i am in clickLogin method");
	}

	@AfterMethod
	public void waitingTime1() {

		waits();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {

		screenshot("TC_3_VerifyLoginAndLogout_closeBrowser");

		System.out.println("i am in @aftersuite method");

		browserClosing();

	}

}
