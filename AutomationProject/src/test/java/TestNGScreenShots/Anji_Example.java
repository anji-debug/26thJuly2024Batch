package TestNGScreenShots;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import CommonOrBase.CommonMethods;

public class Anji_Example extends CommonMethods {

	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");

		launchingBrowser("chrome");

		screenshot("Anji_Example_launchBrowser");

		System.out.println("i am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		browserMaximize();

		screenshot("Anji_Example_launchURL");

		System.out.println("i am in @BeforeClass method");
	}

	@BeforeMethod
	public void waitingTime() {

		waits();

		System.out.println("i am in @BeforeMethod method");

	}

	@Test(priority = 1)
	public void enterUsername() throws IOException {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		System.out.println("i am in enterUsername method");

		screenshot("Anji_Example_enterUsername");

	}

	@Test(priority = 2)
	public void enterPassword() throws IOException {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		System.out.println("i am in enterPassword method");

		screenshot("Anji_Example_enterPassword");

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

	@AfterSuite
	public void closeBrowser() throws IOException {

		// browserClosing();

		System.out.println("i am in @aftersuite method");

		screenshot("Anji_Example_closeBrowser");

	}

}
