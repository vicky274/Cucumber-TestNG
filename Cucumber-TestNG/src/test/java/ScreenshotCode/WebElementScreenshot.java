package ScreenshotCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.java.en.Given;

public class WebElementScreenshot {

	static WebDriver driver;
	static ChromeDriverService service;
	
	
	public static void main(String[] args) throws IOException{
		
		
	
		 service = new ChromeDriverService.Builder()
		.usingDriverExecutable(new File("./Jar/chromedriver.exe")).usingAnyFreePort().withSilent(true).build();
		service.start();
		driver = new ChromeDriver(service);
		
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.className("RNNXgb"));

		// Get entire page screenshot
		File screenshot = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
		//BufferedImage  fullImg = ImageIO.read(screenshot);

		File screenshotLocation = new File("./File/GoogleLogo_screenshot.png");
		FileUtils.copyFile(screenshot, screenshotLocation);
		
		/*// Get the location of element on the page
		Point point = ele.getLocation();

		// Get width and height of the element
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
		    eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot);

		// Copy the element screenshot to disk
		File screenshotLocation = new File("./File/GoogleLogo_screenshot.png");
		FileUtils.copyFile(screenshot, screenshotLocation);
		*/
		
		System.out.println("Screenshot moved Success");
		
		driver.quit();
	}
}
