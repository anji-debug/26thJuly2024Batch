package TestNG;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonOrBase.CommonMethods;

public class Annotation_DataProvider2 extends CommonMethods {

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver",
		// "E:\\driver\\chromedriver.exe");

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

//	@DataProvider(name = "loginCredentials")
//	public Object[][] getLoginCredentials() { // Fixed return type to Object[][] for consistency
//		return new Object[][] { { "Admin", "admin123" }, { "Admin", "admin123" }, { "Admin", "admin123" } };
//	}
//
//	@Test(priority = 1, dataProvider = "loginCredentials")
//	public void addCredentials(String username, String password) {
//
//		// Enter username
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
//
//		// Enter password
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//
//		// Click the submit button
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//		waits(); // Assume waits() method is defined elsewhere
//
//		// Re-launch the URL in a new tab
//		((JavascriptExecutor) driver).executeScript(
//				"window.open('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login', '_blank');");
//
//		// Switch to the new tab
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> handlesList = new ArrayList<String>(windowHandles);
//		driver.switchTo().window(handlesList.get(1)); // Switch to the new tab
//
//		System.out.println("I am in addCredentials method");
//	}

	@DataProvider(name = "loginCredentials")
	public Object getLoginCredentials() {
		Object[][] values = new Object[3][2];

		values[0][0] = "Admin";
		values[0][1] = "admin123";

		values[1][0] = "Admin";
		values[1][1] = "admin123";

		values[2][0] = "Admin";
		values[2][1] = "admin123";

		return values;
	}

	@Test(priority = 1, dataProvider = "loginCredentials")
	public void addCredentials(String username, String password) {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		
		waits();
		
		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.switchTo().newWindow(WindowType.TAB);
		System.out.println("I am in addCredentials method");
//	}

	@AfterMethod
	public void waitingTime1() {

		waits();

		System.out.println("i am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() {

		// driver.quit();
		// browserClosing();

		System.out.println("i am in @aftersuite method");

	}

}
