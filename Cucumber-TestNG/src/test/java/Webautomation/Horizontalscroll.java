package Webautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class Horizontalscroll {

	static WebDriver driver;
	static ChromeDriverService service;
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {

		service = new ChromeDriverService.Builder()
		.usingDriverExecutable(new File("./Jar/chromedriver_84.exe")).usingAnyFreePort().withSilent(true).build();
		service.start();
		driver = new ChromeDriver(service);
		
		driver.get("https://selenium08.blogspot.com/2020/02/horizontal-scroll.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll to element and Element click
		WebElement ele=null;
		try {
			ele = driver.findElement(By.xpath("//a[text()='Work']"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//js.executeScript("arguments[0].click();", ele);
		/*Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();*/
		
		//javascript just scrolls to the element whereas actions scrolls and hover the element
		//both can be used to move to element
		
		WebElement iframe =driver.findElement(By.xpath("//a[text()='Selenium IFrame']"));
		
		js.executeScript("arguments[0].scrollIntoView();", iframe);
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		//js.executeScript("arguments[0].scrollIntoView();", iframe);
		//js.executeScript("arguments[0].click();", ele);
		
	}

}
