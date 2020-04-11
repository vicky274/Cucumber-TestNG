package Webautomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait {

	static WebDriver driver;
	static ChromeDriverService service;
	
	public static void main(String[] args) throws IOException {
		
		/*Using IOUtils.toString (Apache Utils)

		String result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);*/
		
		
		/*String[] values = {"AB","BC","CD","AE"};
		boolean contains = Arrays.stream(values).anyMatch("a"::equals);
		System.out.println(contains);
		
		int[] i={1,2,3,4};
		boolean s = IntStream.of(i).anyMatch(x -> x == 5);
		System.out.println(s);*/
		
		service = new ChromeDriverService.Builder()
		.usingDriverExecutable(new File("./Jar/chromedriver.exe")).usingAnyFreePort().withSilent(true).build();
		service.start();
		driver = new ChromeDriver(service);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		long t1=System.currentTimeMillis();
		 System.out.println("Element Before :"+t1);
		 
        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
        
		System.out.println("fluent wait");
		// for its presence once every 500 milliseconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class);

         wait.until((input) ->{return driver.findElement(By.xpath("//p[@id='demo']"));});
         
         long t2=System.currentTimeMillis();
         long t3=t2-t1;
         System.out.println("Element Found : "+t3);
		
		
		
	}

}
