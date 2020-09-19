package ExtentManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driverhandle {

	
	static WebDriver driver;
	static ChromeDriverService service;
	
	
	public static WebDriver setup(String url) throws IOException{
		/*When Page Loading takes too much time and you need to stop downloading additional subresources 
		(images, css, js etc) you can change the pageLoadStrategy through the webdriver.*/
		
		ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("disable-infobars"); deprecated
		
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
        //options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
   
        
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);*/
		
		service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("./Jar/chromedriver83.exe")).usingAnyFreePort().withSilent(true).build();
				service.start();
				//driver = new ChromeDriver(service,options);
				driver = new ChromeDriver(service);
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
				
				return driver;
	}
}
