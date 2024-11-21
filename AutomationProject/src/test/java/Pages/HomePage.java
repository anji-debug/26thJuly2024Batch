package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	// 1st way

	@FindBy(how =How.XPATH, using="//*[@class='oxd-userdropdown-name']")
	public WebElement user_Dropdown;
	
	public void clickDropdown() {

		user_Dropdown.click();
	}

}
