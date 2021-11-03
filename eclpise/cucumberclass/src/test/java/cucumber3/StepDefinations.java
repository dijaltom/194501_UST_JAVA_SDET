package cucumber3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
	
	WebDriver driver; 
	
	   @Given("I have open the browser") 
	   public void i_have_open_the_browser() { 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb426\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      
	   } 
		
	   @When("I open Facebook website") 
	   public void i_open_Facebook_website() { 
	      driver.get("http://www.facebook.com/");
	      if(driver.findElement(By.name("login")).isEnabled()) { 
		         System.out.println("Test 1 Pass"); 
		      } else { 
		         System.out.println("Test 1 Fail"); 
		      } 
	      driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	      driver.findElement(By.id("pass")).sendKeys("abcd@gmail.com");
	      driver.findElement(By.name("login")).click();
	     
	   } 
		
	   @Then("Login button should exits") 
	   public void login_button_should_exits() { 
	   driver.getTitle().contains("Log in to Facebook");
	   driver.findElement(By.id("pass")).sendKeys("abcd@gmail.com");

	   }

}