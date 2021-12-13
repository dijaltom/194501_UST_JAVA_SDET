package capstone_0;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static WebDriver t;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\font style\\chromedriver_win32_2\\chromedriver.exe");

		t = new ChromeDriver();

		try {

			t.navigate().to("https://www.urbanladder.com/");
			t.manage().window().maximize();
			String[] l = { "Dressers & Mirrors", "Living Storage", "Bedroom Storage", "Dining Storage", "Shop by Range",
					"TV Units", "Bookshelves", "Showcases", "Wall Shelves", "Shoe Racks", "Prayer Units",
					"Entryway & Foyer", "Corner Storage",

			};
			t.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[5]/span")).click();
			Actions action = new Actions(t);
			// action.moveToElement(a).perform();

			for (int i = 0; i <= l.length - 1; i++) {

				TimeUnit.SECONDS.sleep(1);
				t.findElement(By.linkText(l[i])).click();
				TimeUnit.SECONDS.sleep(3);
				pop_up_blocker();
				System.out.println(i + ":" + t.getTitle());
				if (i == 0) {
					By.tagName("li");
					List<WebElement> tt = t.findElements(By.className("gname"));
					for (WebElement string : tt) {
						TimeUnit.SECONDS.sleep(2);
						System.out.println("\nfilter - " +  string.getText()+ "\n");
						TimeUnit.SECONDS.sleep(2);
						action.moveToElement(string).perform();

						if (string.getText().contains("Price")) {
							TimeUnit.SECONDS.sleep(2);
							List<WebElement> ui = t.findElements(By.className("radio"));
							for (WebElement webElement1 : ui) {

								System.out.println("radio button -->" + "-" + webElement1.getAttribute("value"));
								webElement1.click();

							}
						} else if (string.getText().contains("Finish")) {
							TimeUnit.SECONDS.sleep(3);
							By.className("option");
							List<WebElement> tt1 = t.findElements(By.name("filters[primary_finishes][]"));
							for (WebElement web2 : tt1) {
								if (web2.isEnabled()) {
									System.out.println("checkbox " + "-" + web2.getAttribute("value"));
									web2.click();

								} else
									System.out.println("\n==============>  checkbox - " + web2.getAttribute("value") + " is disabled");

							}

						} else {
							TimeUnit.SECONDS.sleep(3);
							List<WebElement> tt1 = t.findElements(By.className("sortoptions"));
							for (WebElement web2 : tt1) {

								System.out.println("Sort By " + "-->\n\n                " + web2.getText() + "\n");
								web2.click();

							}
						}
						TimeUnit.SECONDS.sleep(3);

					}
				}

				TimeUnit.SECONDS.sleep(1);
				t.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div/ul/li[5]/span")).click();
			}

			t.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("\n==========================================\n\n"
					+ "--> Oops!Testing Stopped because of current website can't be load\n--> Check your Internet "
					+ "\n\n==========================================");
			t.close();
		}

	}

	public static void pop_up_blocker() throws InterruptedException {
		if (t.findElements(By.className("reveal-modal-bg")).size() != 0) {
			System.out.println("======= pop-up opened =======");
			t.findElement(By.linkText("Close")).click();
			System.out.println("======= pop-up closed =======");
			TimeUnit.SECONDS.sleep(4);
		}
	}
}

