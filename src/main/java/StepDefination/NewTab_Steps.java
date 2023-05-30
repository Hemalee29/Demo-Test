package StepDefination;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTab_Steps {
	WebDriver driver=null;
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	    
	}

	@When("User click on the Open window tab button")
	public void user_click_on_the_open_window_tab_button() {
	    driver.findElement(By.id("openwindow")).click();
	}

	@When("New tab window open")
	public void new_tab_window_open() {
	    driver.manage().window().maximize();
	}

	@Then("Close the last tab")
	public void close_the_last_tab() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		}
	 
	
	
	@Given("cheak User is on the Home page")
	public void cheak_user_is_on_the_home_page() {
		driver = new ChromeDriver();
	    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@When("User click on the Open tab button")
	public void user_click_on_the_open_tab_button() throws InterruptedException {
	    driver.findElement(By.id("opentab")).click();
	    Thread.sleep(2000);
	}

	@When("New tab is open")
	public void new_tab_is_open() {
		driver.manage().window().maximize();
	}

	@Then("Close the recent tab")
	public void close_the_recent_tab() {
		
		String parent = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		int count = allwindow.size();
		
		for(String child:allwindow)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.close();
				
			}
		}
	
	}


	@When("User enter the name")
	public void user_enter_the_name() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Hemali");
	}

	@When("User click on the alert button")
	public void user_click_on_the_alert_button() {
	    driver.findElement(By.id("alertbtn")).click();
	}

	@Then("User click on the ok button")
	public void user_click_on_the_ok_button() throws InterruptedException {
		driver.switchTo( ).alert( ).accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo( ).alert( ).accept();
		Thread.sleep(2000);
		
		
		
		//Mouse hover
		
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		actions.moveToElement(menuOption).perform();
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	}


