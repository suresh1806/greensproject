package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class EmptyFormNavigation {
	static WebDriver driver;
	@Given("The user in add customer page")
	public void the_user_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		   driver.manage().window().maximize();
	}
	@When("The user are blank")
	public void the_user_are_blank() {
		 
	}
	@When("The user clicked the submit button")
	//public void the_user_clicks_the_submit_button() {
		public void the_user_clicks_the_submit_button() {
		    driver.findElement(By.name("submit")).click();
		    driver.switchTo().alert().accept();
	}

	@Then("The user should see the Alert message")
	public void the_user_should_see_the_error_message() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
}
}