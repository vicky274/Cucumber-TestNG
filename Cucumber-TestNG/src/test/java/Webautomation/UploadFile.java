package Webautomation;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExtentManager.Driverhandle;

public class UploadFile {

	static WebDriver driver;
    static By Upload =By.xpath("//input[@type='file']");
    
	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		options.merge(capabilities);
		
/*		driver =Driverhandle.setup("http://demo.guru99.com/test/upload/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		//ele.click();
		//Thread.sleep(10000);
		
		ele.sendKeys("C:\\Selenium_Workspace\\Cucumber-TestNG\\File\\file.txt");
		
		Thread.sleep(2000);
		// check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();*/
        
		
        
	}
	
}
