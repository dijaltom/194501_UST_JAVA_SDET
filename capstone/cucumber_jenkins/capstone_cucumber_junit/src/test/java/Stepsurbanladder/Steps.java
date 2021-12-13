package Stepsurbanladder;

import java.sql.Driver;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	public static String url = "https://www.urbanladder.com/";

	@Before
	public void doBefore() {
		System.setProperty("webdriver.chrome.driver", "D:\\font style\\chromedriver_win32_2\\chromedriver.exe");
		driver = new ChromeDriver();
		Dimension dm = new Dimension(1044, 788);
		driver.manage().window().setSize(dm);

	}

	@After
	public void doAfter() {
		driver.close();
	}

	@Given("The user navigates to {string}")
	public void the_user_navigates_to(String string) {
		driver.get(url);
	}

	@Then("Check if the links in storage are working")
	public void check_if_the_links_in_storage_are_working() throws InterruptedException {
		Actions actions = new Actions(driver);
		int end = 9;
		for (int i = 1; i < 5; i++) {
			if (i == 2) {
				end = 5;
			} else if (i == 3) {
				end = 3;
			} else if (i == 4) {
				end = 11;
			}
			for (int j = 1; j <= end; j++) {
				String xpath = "//*[@id=\"topnav_wrapper\"]/ul/li[5]/div/div/ul/li[" + i + "]/ul/li[" + j + "]/a";
				actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[5]/span")))
						.perform();
				System.out.println("Mouse hovered over Storage");
				TimeUnit.SECONDS.sleep(1);
				WebElement link = driver.findElement(By.xpath(xpath));
				String linktext = link.getText();
				System.out.println(linktext);
				link.click();
				System.out.println(linktext + " Opened");
				TimeUnit.SECONDS.sleep(3);
				if (i == 1 && j == 1) {
					TimeUnit.SECONDS.sleep(3);
					driver.findElement(By.linkText("Close")).click();
					System.out.println("Closed pop-up");
				}
			}

		}
	}

	@Given("user opens the browser")
	public void user_opens_the_browser() throws InterruptedException {
		driver.get("https://www.urbanladder.com/crockery-unit?src=g_topnav_storage_dining-storage_crockery-units");
		TimeUnit.SECONDS.sleep(5);
		System.out.println(driver.manage().window().getSize());
		driver.findElement(By.linkText("Close")).click();
		System.out.println("Closed pop-up");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("checking if checkbox is working")
	public void checking_if_checkbox_is_working() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		WebElement checkbox = driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[2]/div/input"));
		checkbox.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(checkbox.isSelected());
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]")).click();
		TimeUnit.SECONDS.sleep(2);
		List<WebElement> q = driver.findElements(By.className("radio"));

		for (WebElement webElement1 : q) {
//			TimeUnit.SECONDS.sleep(3);
			driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]")).click();
			TimeUnit.SECONDS.sleep(3);
			webElement1.click();
			if (webElement1.isSelected()) {
				System.out.println("radio button -->" + "-" + webElement1.getAttribute("value") + " is selected");
			}
			TimeUnit.SECONDS.sleep(2);
		}
		TimeUnit.SECONDS.sleep(2);
	}

	@When("checking dropdown")
	public void checking_dropdown() throws InterruptedException {
		WebElement rrr = driver.findElement(By.className("sort-box"));
		WebElement dropdown = rrr.findElement(By.className("gname"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement el =driver.findElement(By.xpath("//*[@id=\"listing-seo\"]/div"));
		List<WebElement> dropdownEl = driver.findElements(
				By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		System.out.println(dropdownEl.size());
		System.out.println(driver.manage().window().getSize());

		
		for (WebElement webElement : dropdownEl) {

			webElement.click();
			TimeUnit.SECONDS.sleep(3);
			System.out.println("==>");

			TimeUnit.SECONDS.sleep(3);
			js.executeScript("arguments[0].scrollIntoView();",el);
			TimeUnit.SECONDS.sleep(3);
			dropdown.click();

			System.out.println("Cursor hovered over to " + dropdown.getText());
			TimeUnit.SECONDS.sleep(2);
		}
		TimeUnit.SECONDS.sleep(1);

	}

	@Then("checking searchbox")
	public void checking_searchbox() throws InterruptedException {

		System.out.println("==>");
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("Astrid TV Unit");
		driver.findElement(By.id("search_button")).click();
		System.out.println("Searched Astrid TV Unit");
		TimeUnit.SECONDS.sleep(3);
	}

	@When("I open Home Page")
	public void i_open_Home_Page() {
		String title = "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder";
		driver.get("https://www.urbanladder.com/");
		String tt = driver.getTitle();
		Assert.assertEquals(tt, title);
	}

	@Then("Checking the Storage Module in {string}")
	public void checking_the_Storage_Module_in(String string) throws InterruptedException {

		String[] l = { "Shoe Racks", "Prayer Units", "Entryway & Foyer", "Corner Storage", "Living Room Sets",
				"Cupboards"

		};
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[5]/span"));

		Actions action = new Actions(driver);
		action.moveToElement(a).perform();
		for (int i = 0; i <= l.length - 1; i++) {

			TimeUnit.SECONDS.sleep(2);
			driver.findElement(By.linkText(l[i])).click();
			TimeUnit.SECONDS.sleep(3);

			pop_up_blocker();
			if (driver.findElements(By.className("results-count")).size() != 0) {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("========>" + driver.findElement(By.className("results-count")).getText());
				TimeUnit.SECONDS.sleep(2);
			}
			System.out.println(i + ":" + driver.getTitle());
			TimeUnit.SECONDS.sleep(3);

			driver.findElement(By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[5]/span")).click();
		}
	}

	@When("I open the {string} page in the Storage Module")
	public void i_open_the_page_in_the_Storage_Module(String string) {
		String url = "https://www.urbanladder.com/shoe-rack?src=g_topnav_storage_living-storage_shoe-racks";
		driver.navigate().to(url);
		String tt = driver.getCurrentUrl();
		Assert.assertEquals(tt, url);
	}

	@Then("Checking The Radio Buttons")
	public void checking_The_Radio_Buttons() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		pop_up_blocker();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]")).click();

		List<WebElement> q = driver.findElements(By.className("radio"));

		for (WebElement webElement1 : q) {
			driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]")).click();
			webElement1.click();
			if (webElement1.isSelected()) {
				System.out.println("radio button -->" + "-" + webElement1.getAttribute("value") + " is selected");
			}
			TimeUnit.SECONDS.sleep(2);
		}
		TimeUnit.SECONDS.sleep(2);

	}

	@When("I add product to the cart")
	public void i_add_product_to_the_cart() throws InterruptedException {
		driver.navigate().to("https://www.urbanladder.com/cupboards?src=g_topnav_storage_bedroom-storage_cupboards");
		TimeUnit.SECONDS.sleep(5);
		pop_up_blocker();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.close();
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		Assert.assertEquals(driver.getTitle(), "Shopping Cart - Urban Ladder");
		System.out.println(
				"[old]Quantity--:" + driver.findElement(By.className("line_item_quantity")).getAttribute("value"));
		Select quantity = new Select(driver.findElement(By.id("select_0_quantity")));
		quantity.selectByValue("5");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(
				"[new]Quantity--:" + driver.findElement(By.className("line_item_quantity")).getAttribute("value"));
		String a = driver.findElement(By.xpath("//*[@id=\"line_items\"]/div/div[4]/div/div[1]/div/div/div")).getText()
				.substring(1);
		Assert.assertEquals(a, "214,990");
	}

	public void pop_up_blocker() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		if (driver.findElements(By.className("reveal-modal-bg")).size() != 0) {
			System.out.println("======= pop-up opened =======");
			driver.findElement(By.linkText("Close")).click();
			System.out.println("======= pop-up closed =======");
			TimeUnit.SECONDS.sleep(4);
		}
	}

}
