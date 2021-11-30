import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver t;
	public String url = "https://demo.guru99.com/test/newtours/register.php";
	public String path = "D:\\UST\\chromedriver_win32\\chromedriver.exe";

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", path);
		t = new ChromeDriver();
		t.navigate().to(url);

	}

	@Test
	public void f7() {
		t.navigate().to(url);
	  // System.out.println("f7 fun"+t.getCurrentUrl());
		t.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		t.findElement(By.name("password")).sendKeys("abcd123");
		t.findElement(By.name("submit")).click();
		String e=t.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/span")).getText();
		String a="PAssword and con.password does not match";
		Assert.assertEquals(a, e);
	
	
	}
	@Test
	public void f() {

		String a = "Note: Your user name is abcd@gmail.com.";
		t.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		t.findElement(By.name("password")).sendKeys("abcd123");
		t.findElement(By.name("confirmPassword")).sendKeys("abcd123");
		t.findElement(By.name("submit")).click();
		String e = t.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b"))
				.getText();
		Assert.assertEquals(a, e);

	}

	@Test
	public void a() {

		String a = "Register: Mercury Tours";
		String e = t.getTitle();
		Assert.assertEquals(a, e);

	}

	@Test
	public void m() {
		String a = "Login Successfully";
		WebElement bt1 = t.findElement(By.cssSelector(
				"body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(1) > a"));
		bt1.click();
		t.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
		t.findElement(By.name("password")).sendKeys("abcd123");
		t.findElement(By.name("submit")).click();
		String e = t.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"))
				.getText();
		Assert.assertEquals(a, e);
	}

	@Test
	public void f1() {
		String a = "Enter your userName and password correct";
		WebElement bt1 = t.findElement(By.cssSelector(
				"body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(1) > a"));
		bt1.click();
		t.findElement(By.name("userName")).sendKeys("abcd@gmail.com");
		t.findElement(By.name("password")).sendKeys("ab");
		t.findElement(By.name("submit")).click();
		String e = t.findElement(By.cssSelector(
				"body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(3) > td:nth-child(2) > span"))
				.getText();
		Assert.assertEquals(a, e);
	}

	@Test
	public void f2() {
		String[] arr1 = { "Home", "Flights", "Hotels", "Car Rentals", "Cruises", "Destinations", "Vacations" };
		String[] arr2 = { "Welcome: Mercury Tours", "Find a Flight: Mercury Tours:",
				"Under Construction: Mercury Tours", "Under Construction: Mercury Tours", "Welcome: Mercury Tours",
				"Under Construction: Mercury Tours", "Under Construction: Mercury Tours", };

		for (int i = 0; i < 7; i++) {
			t.findElement(By.linkText(arr1[i])).click();
			String e = t.getTitle();
			Assert.assertEquals(arr2[i], e);
		}
	}

	@Test
	public void f3() {
		t.findElement(By.linkText("Flights")).click();
		Select s1 = new Select(t.findElement(By.name("fromPort")));
		s1.selectByValue("New York");
		t.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"))
				.click();
		;
		t.findElement(By.name("findFlights")).click();
		String a = "After flight finder - No Seats Avaialble  ";
		String e = t.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]"))
				.getText();
		Assert.assertEquals(a, e);
	}

	@Test
	public void f4() {
	String e=t.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(1) > table > tbody > tr > td > table > tbody > tr > td > p:nth-child(1) > img")).getAttribute("alt");
	Assert.assertEquals("Mercury Tours", e);
	}
	@Test
	public void f5() {
		String e=t.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td")).getAttribute("bgcolor");
		Assert.assertEquals("#FF9900", e);
	}
	@Test
	public void f6() {
		t.findElement(By.linkText("Home")).click();
		String e=t.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(1) > td > font > b")).getText();
		Assert.assertEquals("Jul 6, 2017", e);
	}
	@AfterTest
	public void ms() {
		t.close();
	}
	
}
