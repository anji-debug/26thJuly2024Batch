package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CommonOrBase.CommonMethods;

public class TC_4_LoginToOrangHRM_UsingInheritence extends CommonMethods {

	@BeforeSuite
	public void launchBrowser() {
		// System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");

		launchingBrowser("chrome");

		System.out.println("I am in @beforesuite method");
	}

	@BeforeClass
	public void launchURL() {
		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		browserMaximize();
		waits();

		System.out.println("I am in @beforeclass method");
	}

	@BeforeMethod
	public void waitingTime() {
		waits();

		System.out.println("I am in @beforemethod method");
	}

	@Test(priority = 1)
	public void enterUsername() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		System.out.println("I am in Username method");
	}

	@Test(priority = 2)
	public void enterPassword() {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

		System.out.println("I am in UserPassword method");
	}

	@Test(priority = 3)
	public void clickLogin() {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("i am in clickLogin method");
	}

	@AfterMethod
	public void waitingTime1() {

		waits();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterClass
	public void closeBrowser() {

		//browserClosing();

		System.out.println("i am in @aftersuite method");

	}

}
