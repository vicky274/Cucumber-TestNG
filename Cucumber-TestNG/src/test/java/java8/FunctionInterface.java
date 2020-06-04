package java8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FunctionInterface {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		/**
		 * Functional Interface:
		 * 
		 * This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
			@FunctionalInterface
			public interface Function<T,R>
			Represents a function that accepts one argument and produces a result.
			This is a functional interface whose functional method is apply(Object).
		 */
			
//fluent wait uses function interface
		
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(500))
			       .ignoring(NoSuchElementException.class);
		
		Function<WebDriver,WebElement> func = new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.xpath(""));
			}
			
		};
		
		wait.until(func);*/

		
		//string length
		Function<String,Integer> func = x-> x.length();
		int a  = func.apply("vignesh");
		System.out.println(a);
		
		//chaining function
		Function<Integer,Integer> func1 = x-> x*2;
		
		int s = func.andThen(func1).apply("vignesh");
		System.out.println(s);
		
		
		
		List<String> list = new ArrayList<String>();
		list.add("vignesh");
		list.add("deepa");
		
		list.stream().map(x-> x.toString()).forEach(System.out::println);
	}

}
