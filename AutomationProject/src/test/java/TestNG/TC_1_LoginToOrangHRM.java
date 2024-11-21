package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_1_LoginToOrangHRM {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\anji\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		System.out.println("I am in @beforesuite method");
	}
	
	@BeforeClass
	public void launchURL()
	{
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		System.out.println("I am in @beforeclass method");
	}
	
	@BeforeMethod
	public void waitingTime()
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		System.out.println("I am in @beforemethod method");
	}
	
	@Test(priority = 1)
	public void enterUsername()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("I am in Username method");
	}
	
	@Test(priority = 2)
	public void enterPassword()
	{
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
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		System.out.println("i am in @AfterMethod method");		

	}
	
	@AfterClass
	public void closeBrowser() {

		driver.quit();

		System.out.println("i am in @aftersuite method");

	}

}
