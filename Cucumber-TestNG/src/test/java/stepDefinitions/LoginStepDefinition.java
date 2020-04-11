package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{

	 WebDriver driver;
	 ChromeDriverService service;
	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page() throws IOException{
	 service = new ChromeDriverService.Builder()
			.usingDriverExecutable(new File("./Jar/chromedriver.exe")).usingAnyFreePort().withSilent(true).build();
	// System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
	service.start();
	driver = new ChromeDriver(service);
	 driver.get("https://www.freecrm.com/index.html");
	 }
	
	
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 //Assert.assertEquals("Free CRM in the cloud software boosts sales", title);
	 }
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 /*WebElement loginBtn =
	 driver.findElement(By.xpath("//input[@type='submit']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);*/
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 /*String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("CRMPRO", title);*/
	 }
	 
	 @Then("^user moves to new contact page$")
	 public void user_moves_to_new_contact_page() {
		/*driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		*/
		}
	 
	 
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 /*driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();*/
	 }
	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	
	
	

}
