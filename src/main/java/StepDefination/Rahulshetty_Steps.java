package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rahulshetty_Steps {
	
	WebDriver driver=null;
	
	
	@Given("User is on the Practice page")
	public void user_is_on_the_practice_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\htshe\\\\eclipse-workspace\\\\friday\\\\Resources\\\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@When("user select dropdown value")
	public void user_select_dropdown_value() {
	    
		driver.findElement(By.name("radioButton")).click();
	}
	
	@When("user enter the country name an select auto suggest name")
	public void user_enter_the_country_name_an_select_auto_seggest_name() 
	{
	   driver.findElement(By.id("autocomplete")).sendKeys("Aus");
	   List<WebElement> listWebElement = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
	   
	   for(WebElement webelement:listWebElement)
	   {
		   if(webelement.getText().trim().equals("Australia"))
		   {
			   webelement.click();
		   }
	   }
	   
	}

	@When("User select the option from dropdown menu")
	public void user_select_the_option_from_dropdown_menu() throws InterruptedException {
	    
		Select drp = new Select(driver.findElement(By.id("dropdown-class-example")));
		drp.selectByVisibleText("Option2");
		Thread.sleep(2000);
	}

	@When("User select the cheackbox")
	public void user_select_the_cheackbox() throws InterruptedException {
	    driver.findElement(By.id("checkBoxOption2")).click();
	    Thread.sleep(2000);
	}


	@Then("user close the page")
	public void user_close_the_page() {
	    driver.close();
	}


}
