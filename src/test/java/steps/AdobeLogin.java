package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdobeLogin {
	ChromeDriver driver;
	@Given("I am able to navigate onto the home page")
	public void i_am_able_to_navigate_onto_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://adobe.com");
	    
	}
	@Given("I click on signin link")
	public void i_click_on_signin_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"gnt_1363\"]/a/span")).click();
		
	   
	}
	@When("I update the email as {string}")
	public void i_update_the_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys(string);
	}
	@When("I click on continue button")
	public void i_click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I shoud see the error message as {string}")
	public void i_shoud_see_the_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}
