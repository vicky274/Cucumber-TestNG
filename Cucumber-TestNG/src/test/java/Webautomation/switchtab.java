package Webautomation;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class switchtab {

	static WebDriver driver;
	static ChromeDriverService service;
	
	public static void main(String[] args) throws InterruptedException {
		service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("./Jar/chromedriver.exe")).usingAnyFreePort().withSilent(true).build();
	
				driver = new ChromeDriver(service);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				Thread.sleep(3000);
				Actions action = new Actions(driver);
				//not working
				//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
				//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
				
				
				
				//action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("t")).keyUp(Keys.CONTROL).build().perform();
				//action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
				
				//new tab 
				WebElement el = driver.findElement(By.xpath("//a[text()='Gmail']"));
				
				/*JavascriptExecutor js =(JavascriptExecutor) driver;
				js.executeScript("window.open()");
				Thread.sleep(2000);*/
				
				action.keyDown(Keys.CONTROL).click(el).build().perform();
				Thread.sleep(5000);
				//to select whole page
//works 	//	//driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL, "\u0061"));
				
				//switch focus by clicking any element in webpage and then use action orelse it wont work
//works 	//action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).keyUp(Keys.CONTROL).build().perform();
				
//works 	//	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
//works 	//	action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("\u0061")).keyUp(Keys.CONTROL).build().perform();
				
				action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
				
				/*ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
				System.out.println(tabs2.size());
			    driver.switchTo().window(tabs2.get(1));
			    driver.close();
			    driver.switchTo().window(tabs2.get(0));*/
				
				
				
				//Switch to current selected tab's content.
				//driver.switchTo().defaultContent();
				
				/*driver.get("https://lane2.qa.portal.kcprofessional.com/spa/home");
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);*/
				
			/*	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("VivekAherKC007@gmail.com");;
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@value='Next']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kimberly2020");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@value='Sign In']")).click();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(5000);
				driver.get("https://lane2.qa.portal.kcprofessional.com/SPA/home");
				driver.navigate().refresh();
				Thread.sleep(20000);
				
				driver.findElement(By.xpath("//span[text()='Order Management ']")).click();*/
				

				  
	}

}
