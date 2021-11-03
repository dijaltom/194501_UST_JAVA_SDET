package StepsTest; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps { 
   WebDriver driver = null; 



@Given("^I have open the browser$")
public void i_have_open_the_browser()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ustjavasdetb426\\Downloads\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver(); 

}

@When("^I open Facebook website$")
public void i_open_Facebook_website() {
	driver.get("https://www.facebook.com/");
}
@Then("^Login button should exists$") 
public void Login_button_should_exists() { 
    WebElement i=driver.findElement(By.id("email"));
    WebElement b=driver.findElement(By.id("pass"));
    WebElement c=driver.findElement(By.name("login"));
    i.sendKeys("abcd@gmail.com");
    b.sendKeys("Pas@123");
    c.click();
    System.out.println("Good");
   driver.close(); 
}
}