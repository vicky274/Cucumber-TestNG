import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import Flash.FlashObjectWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlashTest {
	static WebDriver driver;
	static ChromeDriverService service;
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		/*ChromeOptions options = new ChromeOptions();
		// disable ephemeral flash permissions flag
		//options.addArguments("--disable-features=EnableEphemeralFlashPermission");
		options.setCapability (CapabilityType.ACCEPT_INSECURE_CERTS, true);
		options.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		
		Map<String, Object> prefs = new HashMap<>();
		// Enable flash for all sites for Chrome 69
		prefs.put("profile.default_content_setting_values.plugins", 1);
		prefs.put("profile.content_settings.plugin_whitelist.adobe-flash-player", 1);
		prefs.put("profile.content_settings.exceptions.plugins.*,*.per_resource.adobe-flash-player", 1);
		prefs.put("profile.content_settings.exceptions.plugins.*,*.setting", 1);
        prefs.put("PluginsAllowedForUrls", "http://demo.guru99.com/test/flash-testing.html");
		options.setExperimentalOption("prefs", prefs);*/
	    
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-component-update")); 

		service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("./Jar/chromedriver.exe")).usingAnyFreePort().withSilent(true).build();
				service.start();
				driver = new ChromeDriver(service,options);
		
	  	// Maximize browser		
		driver.manage().window().maximize();		
	  	// Under Flash jar file there is separate FlashObjectWebDriver class		
		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "myFlashMovie");		
	  	// Pass the URL of video		
		driver.get("http://demo.guru99.com/test/flash-testing.html");	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("waiting");
		Thread.sleep(15000);		
		System.out.println("wait over");
	  	flashApp.callFlashObject("Play");			
	  	Thread.sleep(5000);		
		flashApp.callFlashObject("StopPlay");			
		Thread.sleep(5000);		
		flashApp.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
	    System.out.println(flashApp.callFlashObject("GetVariable","/:message"));
	    

	}

}
