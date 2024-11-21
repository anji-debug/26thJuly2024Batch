package CommonOrBase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	public WebDriver driver;

	public void launchingBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
	}

	public void urlLaunching(String url) {
		driver.get(url);
	}

	public void browserClosing() {
		driver.quit();
	}

	public void browserMaximize() {
		driver.manage().window().maximize();
	}

	public void waits() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	public void screenshot(String screenshotName) throws IOException {

		File livetech = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(livetech, new File(
				"E:\\Core Java and Selenium online class notes and Practice\\AutomationProject\\src\\test\\java\\ScreenShots\\"
						+ screenshotName + ".png"));

	}

}
