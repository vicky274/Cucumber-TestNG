package Webautomation;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.http.HttpResponse;

public class ImageSize {

	static WebDriver driver;
	static ChromeDriverService service;
	static int invalidImageCount;
	public static void main(String[] args) throws IOException {

		service = new ChromeDriverService.Builder()
		.usingDriverExecutable(new File("./Jar/chromedriver.exe")).usingAnyFreePort().withSilent(true).build();
		service.start();
		driver = new ChromeDriver(service);
		
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

		try {
		    invalidImageCount = 0;
			List<WebElement> imagesList = driver.findElements(By.tagName("img"));
			System.out.println("Total no. of images are " + imagesList.size());
			for (WebElement imgElement : imagesList) {
				if (imgElement != null) {
					verifyimageActive(imgElement);
				}
			}
			System.out.println("Total no. of invalid images are "	+ invalidImageCount);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		//URLConnection urlConnection = new URL(webElement.getAttribute("src")).openConnection();
		//int size = urlConnection.getContentLength();
		
	}
	
	public static void verifyimageActive(WebElement imgElement) {
		try {
			String width  = imgElement.getAttribute("naturalWidth");
			System.out.println("Natural width :"+width);
			/*
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imgElement.getAttribute("src"));
			org.apache.http.HttpResponse response = client.execute(request);
			// increment as invalid images count
			
			if (response.getStatusLine().getStatusCode() != 200)
				invalidImageCount++;*/
			URL url = new URL(imgElement.getAttribute("src"));
			HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		
			int size = urlConnection.getContentLength();
			System.out.println("content length :"+size);
			
			urlConnection.connect();
			urlConnection.setConnectTimeout(5000);
			Map<String, List<String>> map = urlConnection.getHeaderFields();
			for(Map.Entry<String, List<String>> entry : map.entrySet()){
				System.out.println("key :"+entry.getKey());
				
				List<String> list = entry.getValue();
				
				for(String value: list){
					System.out.println("Value :"+value);
				}
			}
			if(urlConnection.getResponseCode()!=200){
				invalidImageCount++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
