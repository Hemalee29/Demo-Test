package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginDemo_step {
	WebDriver driver=null;
	
	@Given("Browser open")
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\htshe\\eclipse-workspace\\friday\\Resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://example.testproject.io/web/");
	}

	

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    driver.findElement(By.id("name")).sendKeys("Hello");
	    driver.findElement(By.id("password")).sendKeys("Abc@123");
	    driver.findElement(By.id("login")).click();
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
	    driver.close();
	}
}
