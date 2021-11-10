package StepsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public WebDriver driver;
	public String url = "https://demo.guru99.com/test/newtours/register.php";
	public String path = "C:\\\\Users\\\\ustjavasdetb426\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe";

	@Before
	public void i() {
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

	}

	@When("^I open Register Page$")
	public void i_open_register_page() {
		driver.get(url);
	}

	@Then("Checking registeration without\"password confirmation\"")
	public void Checking_registeration_without_password_confirmation() {
		driver.navigate().to(url);
		// System.out.println("f7 fun"+driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.name("submit")).click();
		String e = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/span"))
				.getText();
		String a = "PAssword and con.password does not match";
		Assert.assertEquals(a, e);

	}

	@Then("^Submit button should exists$")
	public void Submit_button_should_exists() {

		String a = "Note: Your user name is abcd@gmail.com.";
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcd123");
		driver.findElement(By.name("submit")).click();
		String e = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"))
				.getText();
		Assert.assertEquals(a, e);

	}

	@When("^I open Login Page$")
	public void i_open_login_page() {
		driver.get("http://demo.guru99.com/test/newtours/login.php");
	}

	@Then("^Login with wrong password$")
	public void Login_with_wrong_password() {
		String a = "Enter your userName and password correct";

		driver.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ab");
		driver.findElement(By.name("submit")).click();
		String e = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/span"))
				.getText();
		Assert.assertEquals(a, e);
	}

	@Then("^Login button exists$")
	public void Login_button_exists() {
		String a = "Login Successfully";

		driver.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.name("submit")).click();
		String e = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"))
				.getText();
		Assert.assertEquals(a, e);
	}
	
	@After
	public void ma()
	{
		driver.close();
	}
}