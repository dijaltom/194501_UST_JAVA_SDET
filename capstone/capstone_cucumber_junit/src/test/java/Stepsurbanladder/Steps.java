package Stepsurbanladder;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public static WebDriver t;
	public String url = "https://www.urbanladder.com/";
	public String path = "C:\\\\Users\\\\dijal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe";

	@Before
	public void i() {
		System.setProperty("webdriver.chrome.driver", path);
		t = new ChromeDriver();

	}

	@When("I open Home Page")
	public void i_open_Home_Page() {
		String title = "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder";
		t.get(url);
		String tt = t.getTitle();
		Assert.assertEquals(tt, title);
	}

	@Then("^Checking the Storage Module in \"Urbanladder\"$")
	public void Checking_the_Storage_Module_er() throws InterruptedException {

		String[] l = { "Shoe Racks", "Prayer Units", "Entryway & Foyer", "Corner Storage","Living Room Sets","Cupboards"

		};
		WebElement a = t.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[5]/span"));
		
		Actions action = new Actions(t);
		action.moveToElement(a).perform();
		for (int i = 0; i <= l.length - 1; i++) {

			TimeUnit.SECONDS.sleep(2);
			t.findElement(By.linkText(l[i])).click();
			TimeUnit.SECONDS.sleep(3);
		
			
			pop_up_blocker();
		 if(t.findElements(By.className("results-count")).size() != 0) {
				TimeUnit.SECONDS.sleep(2);
				System.out.println("========>"+t.findElement(By.className("results-count")).getText());
				TimeUnit.SECONDS.sleep(2);
			}
			System.out.println(i + ":" + t.getTitle());
			TimeUnit.SECONDS.sleep(2);
			
		
			t.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[5]/span")).click();
		}
	}

	@When("I open the {string} page in the Storage Module")
	public void i_open_the_page_in_the_Storage_Module(String string) {
		String url = "https://www.urbanladder.com/shoe-rack?src=g_topnav_storage_living-storage_shoe-racks";
		t.navigate().to(url);
		String tt = t.getCurrentUrl();
		Assert.assertEquals(tt, url);
	}

	@Then("Checking The Radio Buttons")
	public void Checking_The_Radio_Buttons() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		pop_up_blocker();
		TimeUnit.SECONDS.sleep(3);
		t.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]")).click();

		List<WebElement> q = t.findElements(By.name("price_limit"));

		for (WebElement webElement1 : q) {
			t.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]")).click();
			webElement1.click();
			if (webElement1.isSelected()) {
				System.out.println("radio button -->" + "-" + webElement1.getAttribute("value") + " is selected");
			}
			TimeUnit.SECONDS.sleep(2);
		}
		TimeUnit.SECONDS.sleep(2);

	}

	@Then("Checking The Check Boxes")
	public void Checking_The_Check_Boxes() throws InterruptedException {
		String[] arr = { "//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[2]/div[1]",
				"//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[3]/div[1]" };

		// pop_up_blocker();
		TimeUnit.SECONDS.sleep(3);
		for (int i = 0; i < arr.length; i++) {

			System.out.println(i);
			TimeUnit.SECONDS.sleep(3);

			t.findElement(By.xpath(arr[i])).click();

			if (i == 1) {
				List<WebElement> rt = t.findElements(By.name("filters[primary_finishes][]"));
				for (WebElement webElement1 : rt) {
					if (webElement1.isEnabled()) {
						webElement1.click();
						if (webElement1.isSelected()) {
							System.out
									.println("checkbox -->" + "-" + webElement1.getAttribute("value") + " is selected");
						}
					} else {
						System.out.println("checkbox -->" + "-" + webElement1.getAttribute("value")
								+ " is cannot be selected because it is Disabled");
					}

				}
			} else if (i == 0) {
				TimeUnit.SECONDS.sleep(3);
				List<WebElement> rt = t.findElements(By.name("filters[storage_type][]"));
				for (WebElement webElement1 : rt) {
					if (webElement1.isEnabled()) {
						webElement1.click();
						if (webElement1.isSelected()) {
							System.out
									.println("checkbox -->" + "-" + webElement1.getAttribute("value") + " is selected");
						}
					} else {
						System.out.println("checkbox -->" + "-" + webElement1.getAttribute("value")
								+ " is cannot be selected because it is Disabled");
					}

				}
			}
			TimeUnit.SECONDS.sleep(3);
		}

	}

	@Then("Checking The Dropdown Menu")
	public void checking_The_Dropdown_Menu() throws InterruptedException {
		t.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]")).click();
		TimeUnit.SECONDS.sleep(3);

		List<WebElement> tt1 = t.findElements(By.className("sortoptions"));
		for (WebElement web2 : tt1) {
			System.out.println("Sort By " + "-->\n\n" + web2.getText() + "\n");
			web2.click();
			TimeUnit.SECONDS.sleep(2);
			if (web2.getAttribute("class").contains("selected")) {
				System.out.println("\n\nSort By " + "-->\n\n" + web2.getText() + "\n" + " is selected");
			}
			TimeUnit.SECONDS.sleep(2);
		}
	}

	@When("I add product to the cart")

	public void i_add_product_to_the_cart() throws InterruptedException {
		t.navigate()
				.to("https://www.urbanladder.com/cupboards?src=g_topnav_storage_bedroom-storage_cupboards");
		TimeUnit.SECONDS.sleep(3);
		pop_up_blocker();
		t.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div")).click();
		ArrayList<String> tabs = new ArrayList<String>(t.getWindowHandles());
		t.close();
		t.switchTo().window(tabs.get(1));
		t.findElement(By.cssSelector("#add-to-cart-button")).click();
		Assert.assertEquals(t.getTitle(),"Shopping Cart - Urban Ladder");
		System.out.println("[old]Quantity--:"+t.findElement(By.className("line_item_quantity")).getAttribute("value"));
		Select quantity = new Select(t.findElement(By.id("select_0_quantity")));
		quantity.selectByValue("5");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("[new]Quantity--:"+t.findElement(By.className("line_item_quantity")).getAttribute("value"));
		String a = t.findElement(By.xpath("//*[@id=\"line_items\"]/div/div[4]/div/div[1]/div/div/div")).getText().substring(1);
		//System.out.println("=====>"+a);
		Assert.assertEquals(a, "214,990");
	}

	public static void pop_up_blocker() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		if (t.findElements(By.className("reveal-modal-bg")).size() != 0) {
			System.out.println("======= pop-up opened =======");
			t.findElement(By.linkText("Close")).click();
			System.out.println("======= pop-up closed =======");
			TimeUnit.SECONDS.sleep(4);
		}
	}

	@After
	public void g() {
		t.close();
	}

}
