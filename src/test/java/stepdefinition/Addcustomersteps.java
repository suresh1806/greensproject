package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Addcustomersteps {
	
	static WebDriver driver;
	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		   driver.manage().window().maximize();
	}

	@When("The user fill in the customer details")
	public void the_user_fill_in_the_customer_details(DataTable CustomerDetails) {
		 List<String> customerDetailsList = CustomerDetails.asList(String.class);
		    System.out.println(customerDetailsList);
		    driver.findElement(By.xpath("//label[text()='Done']")).click();
		    driver.findElement(By.id("fname")).sendKeys(customerDetailsList.get(0));
		    driver.findElement(By.id("lname")).sendKeys(customerDetailsList.get(1));
		    driver.findElement(By.id("email")).sendKeys(customerDetailsList.get(2));
		    driver.findElement(By.name("addr")).sendKeys(customerDetailsList.get(3));
		    driver.findElement(By.name("telephoneno")).sendKeys(customerDetailsList.get(4));
		    
	}

	@When("The user clicks the submit button")
	//public void the_user_clicks_the_submit_button() {
		public void the_user_clicks_the_submit_button() {
		    driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the customer ID generated")
	public void the_user_should_see_the_customer_ID_generated() {
		 Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}


}
