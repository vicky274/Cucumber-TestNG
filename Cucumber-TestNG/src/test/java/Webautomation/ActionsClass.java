package Webautomation;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class ActionsClass {

	static WebDriver driver;
	static ChromeDriverService service;
	
	static By  fullname = By.id("userName");
	static By  Email = By.id("userEmail");
	static By  Current_Address = By.id("currentAddress");
	static By  Permanent_Address = By.id("permanentAddress");
	static By  label = By.id("currentAddress-label");
	static By  submit = By.id("submit");
	
	public static void main(String[] args) throws InterruptedException {
		
		service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("./Jar/chromedriver83.exe")).usingAnyFreePort().withSilent(true).build();
	
				driver = new ChromeDriver(service);
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/text-box");
			    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			    
			    WebElement e1 = driver.findElement(fullname);
			    WebElement e2 = driver.findElement(Email);
			    WebElement e3 = driver.findElement(Current_Address);
			    WebElement e4 = driver.findElement(Permanent_Address);
			    WebElement e5 = driver.findElement(label);
			    WebElement e6 = driver.findElement(submit);
			    
			    Actions action = new Actions(driver);
                action
                .sendKeys(e1, "Vignesh Elangovan")
                .sendKeys(e2, "vimessi2@gmail.com").build().perform();
                
                //only modifier keys are allowed in keydown or keyup (ctrl, shift, alt)
                //other keys can be sent via sendkeys method
           
                action.sendKeys(e3, "1/78 A, mariyamman kovil street, vellore").build().perform();
                
                action.keyDown(e3, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).pause(2).build().perform();
                
                action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).pause(2).build().perform();
                
                action.keyDown(e4, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).pause(2).build().perform();
                
                Thread.sleep(2000);
                
                /*//performs double click
                action.doubleClick(e5).perform();
                
                //Get color code from webpage of an Element
                String color= e6.getCssValue("background-color");
                System.out.println( Color.fromString(color).asHex());*/
               

                
	}

}
