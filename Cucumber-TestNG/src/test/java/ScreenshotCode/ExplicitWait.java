package ScreenshotCode;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import ExtentManager.Driverhandle;

public class ExplicitWait {
	
static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver =Driverhandle.setup("");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		
		wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.xpath(""));
			}
			
			
		});
		
		
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
		
		
	}

}
