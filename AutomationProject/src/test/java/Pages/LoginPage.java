package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// 1st way
	// Syntax: accessmodifier By webelementname = By.locator(“”);

	private By application_Logo = By.xpath("//*[@alt='company-branding']");

	private By username_TextBox = By.xpath("//input[@name='username']");

	private By password_TextBox = By.xpath("//input[@name='password']");

	private By login_Button = By.xpath("//button[@type='submit']");

	private By forgotYourPassword_Link = By.xpath("//*[text()='Forgot your password? ']");

	private By dasdas_Button = By.xpath("//*[@class='orangehrm-auth-button']");

	public void verifyLogo() {

		driver.findElement(application_Logo).isDisplayed();
	}

	public void enterUsername() {

		driver.findElement(username_TextBox).sendKeys("Admin");
	}
	
	public void enterPassword() {

		driver.findElement(password_TextBox).sendKeys("admin123");
	}
	
	public void clickLogin() {

		driver.findElement(login_Button).click();
	}
	
	public void clickForgotYourPassword() {

		driver.findElement(forgotYourPassword_Link).click();
	}
	
	public void verifyForgotYourPassword() {

		driver.findElement(forgotYourPassword_Link).isDisplayed();
	}
	
	public void verifyDasdas() {
		
		driver.findElement(dasdas_Button).isDisplayed();
	}
	
	public void clickDasdas() {

		driver.findElement(dasdas_Button).click();
	}

}
