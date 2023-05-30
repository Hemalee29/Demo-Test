package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSerach_step {

	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\htshe\\eclipse-workspace\\friday\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    
	}

	@Given("User is on goolge search page")
	public void user_is_on_goolge_search_page() {
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enter a test in search box")
	public void user_enter_a_test_in_search_box() {
		 driver.findElement(By.name("q")).sendKeys("Remote");
		
	}

	@When("hit enter")
	public void hit_enter() {
		System.out.println("hit enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user navigate to search result")
	public void user_navigate_to_search_result() {
		driver.close();
	}


}
