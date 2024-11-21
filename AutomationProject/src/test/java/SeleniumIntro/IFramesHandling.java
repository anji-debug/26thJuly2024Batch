package SeleniumIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		driver.get("https://demoqa.com/frames");
		
		//WebElement frameBottom=driver.findElement(By.name("frame-bottom"));
		
		//webdriverobject.switchTo().frame(frameid/framename/frameindex/webelement of the frame);
		
		//1st way
		
		//driver.switchTo().frame("frame1");
		
		//2nd way
		
		WebElement frame1=driver.findElement(By.xpath("//*[@id='frame1']"));
		
		driver.switchTo().frame(frame1);
		
		String actualText=driver.findElement(By.id("sampleHeading")).getText();
		
		String expectedText="This is a sample page";
		
		if(actualText.equalsIgnoreCase(expectedText))
		{
			System.out.println("This is a sample page frame1 is displayed in the web page");
		}
		else
		{
			System.out.println("This is a sample page frame1 is not displayed in the web page");
		}
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}

}
