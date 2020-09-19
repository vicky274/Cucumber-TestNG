package Webautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExtentManager.Driverhandle;

public class UploadFile extends Driverhandle{

	static WebDriver driver;
    static By Upload =By.id("uploadFile");
    private static String path ="C:\\Users\\DELL\\Downloads\\indoor\\1.jpg";

	public static  void fileUpload (String path) throws AWTException {
    	
    	StringSelection selection = new StringSelection(path);
    	Clipboard   clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    	clipboard.setContents(selection, null);
    	
    	Robot robot = new Robot();
    	
    	robot.delay(200);
    	
		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.delay(200);

		robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
    
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

	
		driver =setup("https://demoqa.com/text-box");
		//driver.findElement(By.xpath("//div[@class='form-file']/child::input")).click();
		driver.findElement(By.xpath("//*[text()='Radio Button']")).click();
		Thread.sleep(3000);
		//fileUpload(path);
		
		
		
		/*driver =Driverhandle.setup("http://demo.guru99.com/test/upload/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		//ele.click();
		//Thread.sleep(10000);
		
		ele.sendKeys("C:\\Selenium_Workspace\\Cucumber-TestNG\\File\\file.txt");
		
		Thread.sleep(2000);
		// check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();*/
        
		//nrowser profile for chrome
		/*String downloadFilepath = "/path/to/download";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);*/
		
		
		
		
		
		
		
		
        
	}
	
}
