package Webautomation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ExtentManager.Driverhandle;

public class dropdown {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		//driver = Driverhandle.setup("https://www.testandquiz.com/selenium/testing.html");
		
		//WebElement dropdown = driver.findElement(By.id("testingDropdown"));

		/*Select select = new Select(dropdown);
		
		select.selectByValue("Automation");*/
		
/*List<WebElement> ele = driver.findElements(By.xpath("//select[@id='testingDropdown']/option"));
		
		
		for(WebElement e: ele){
			String text = e.getAttribute("innerHTML");
			list.add(text);
			System.out.println(text);
		}*/
		
		//find duplicate element in list
		
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("Manual Testing","Database Testing","Automation Testing"
				,"Performance Testing","TextBox","TextBox","Automation Testing","Performance Testing"));

		
		//collect -Performs a mutable reduction operation on the elements of this stream using a Collector.
		//A Collector encapsulates the functions used as arguments to collect(Supplier, BiConsumer, BiConsumer), allowing for reuse of collection 
		//strategies and composition of collect operations such as multiple-level grouping or partitioning. 
		
		System.out.println(list.stream().distinct().collect(Collectors.toList()));
		System.out.println(list.stream().filter(e -> Collections.frequency(list, e)>1).distinct().collect(Collectors.toList()));
		
		/*List<String> duplicate = new ArrayList<String>();
		Set<String>  set = new HashSet<String>(list);
		
		for(int i=0; i<list.size();i++) {
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).equalsIgnoreCase(list.get(j))){
					duplicate.add(list.get(i));
				}
			}
				
		}
		
		System.out.println(">>>>>>>>>>>>The duplicates are :");
		for(String d: duplicate){
			
			System.out.println(d);
		}
		
		System.out.println(">>>>>>>>>>>>Without duplicates: ");
		System.out.println(set);*/
		
		
		// Third solution : using Hash table data structure to find duplicates
        System.out.println("Duplicate elements from array using hash table");
        Map<String, Integer> nameAndCount = new HashMap<>();

        // build hash table with count
        for (String name : list) {
            Integer count = nameAndCount.get(name);
            System.out.println(count);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }

        // Print duplicate elements from array in Java
        Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
        for (Entry<String, Integer> entry : entrySet) {

            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : "
                        + entry.getKey());
            }
        }
	}

}
