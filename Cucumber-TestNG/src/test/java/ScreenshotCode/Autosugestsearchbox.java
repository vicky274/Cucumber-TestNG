package ScreenshotCode;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ExtentManager.Driverhandle;

public class Autosugestsearchbox {

	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		driver =Driverhandle.setup("http://www.google.co.in");
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search']"));
		ele.sendKeys("how to");
		
		Thread.sleep(1000);
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]/div/span"));
		
		System.out.println("Auto Suggest List ::" + list.size());
		
		for(WebElement e:list){
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	
}
