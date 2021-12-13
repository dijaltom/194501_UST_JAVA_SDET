import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Tests {

	public static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void before() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "POCO");
		cap.setCapability("udid", "b3dad95f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "io.selendroid.testapp");
		cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		cap.setCapability("noReset", "true");
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("autoAcceptAlerts", "true");
		String u = "http://127.0.0.1:4723/wd/hub";
		URL url = new URL(u);
		driver = new AndroidDriver<MobileElement>(url, cap);

	}

	@Test
	public static void Test1() throws InterruptedException {

		System.out.println("App Loading.......");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("\n\nApp-Name :" + driver.findElement(By.id("android:id/title")).getText() + "\n\n"
				+ driver.findElement(By.xpath(
						"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]"))
						.getText()
				+ "\n");
		driver.findElement(By.id("io.selendroid.testapp:id/topLevelElementTest")).click();

		TimeUnit.SECONDS.sleep(1);
		MobileElement t = driver.findElement(By.id("io.selendroid.testapp:id/focusedText"));
		if (t.getText().contains("Should only be found once")) {
			System.out.println(driver.findElement(By.id("io.selendroid.testapp:id/topLevelElementTest")).getText()
					+ " button pressed\n");
		}
	}

	@Test
	public static void Test2() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		MobileElement t = driver.findElement(By.id("io.selendroid.testapp:id/input_adds_check_box"));
		TimeUnit.SECONDS.sleep(1);
		if (t.getAttribute("checked").equals("true")) {
			System.out.println("checkbox[checked]");
		}
		TimeUnit.SECONDS.sleep(1);
		t.click();
		if (!t.getAttribute("checked").equals("true")) {
			System.out.println("checkbox[unchecked]\n");
		}

	}

	@Test
	public static void Test3() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		MobileElement t = driver.findElement(By.id("io.selendroid.testapp:id/showToastButton"));
		t.click();
		TimeUnit.MILLISECONDS.sleep(2500);
		MobileElement toast = driver.findElementByXPath("//android.widget.Toast[@text='Hello selendroid toast!']");

		if (toast.getText().contentEquals("Hello selendroid toast!")) {
			System.out.println("Toast [" + toast.getText() + "] successfully displayed");

		}
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("io.selendroid.testapp:id/showPopupWindowButton")).click();
		System.out.println("pop-up opened");
		TimeUnit.SECONDS.sleep(3);
		TouchAction touchAction = new TouchAction(driver);

		touchAction.tap(PointOption.point(490, 1050)).perform();
		System.out.println("pop-up closed");
		TimeUnit.SECONDS.sleep(3);

	}

	@Test
	public static void Test4() throws InterruptedException {
		TimeUnit.SECONDS.sleep(3);
		if (!isElementPresent(By.id("io.selendroid.testapp:id/visibleTextView"))) {
			System.out.println("Text is hidden");
		}

		TimeUnit.SECONDS.sleep(3);
		driver.findElementById("io.selendroid.testapp:id/visibleButtonTest").click();
		System.out.println(
				driver.findElementById("io.selendroid.testapp:id/visibleButtonTest").getText() + " button pressed");
		if (isElementPresent(By.id("io.selendroid.testapp:id/visibleTextView"))) {
			System.out.println(
					"===> " + "'" + driver.findElementById("io.selendroid.testapp:id/visibleTextView").getText() + "'");
		}
	}

	@Test
	public static void Test5() throws InterruptedException {
		driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").click();
		TimeUnit.SECONDS.sleep(3);
		MobileElement rr = driver.findElementById("android:id/progress_percent");
		for (int i = 0; i < 3; i++) {
			System.out.print("==>" + rr.getText());
			TimeUnit.SECONDS.sleep(3);
		}
		TimeUnit.SECONDS.sleep(2);
		System.out.print("==>100%");
		System.out.println("\n\nprogress bar finished..!\n");

		System.out.println(driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
				.getText());

		driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Joe Ben");

		driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("abcd@gmail.com");

		driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("@213qwertY");

		MobileElement rt = driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
		String[] tt = { "Ruby", "PHP", "Scala", "Python", "Javascript", "Java", "C++", "C#" };

		for (int i = 0; i < tt.length; i++) {

			TimeUnit.SECONDS.sleep(2);
			rt.click();
			TimeUnit.SECONDS.sleep(1);
			driver.findElementByXPath("//android.widget.CheckedTextView[@text='" + tt[i] + "']").click();
			TimeUnit.SECONDS.sleep(4);
			if (driver.findElement(By.id("android:id/text1")).getAttribute("text").contentEquals(tt[i])) {
				System.out.println(driver.findElement(By.id("android:id/text1")).getAttribute("text") + " is selected");
			}

		}

		TimeUnit.SECONDS.sleep(2);
		MobileElement check = driver.findElement(By.id("io.selendroid.testapp:id/input_adds"));

		if (!check.getAttribute("checked").equals("true")) {
			System.out.println("checkbox[unchecked]\n");

			TimeUnit.SECONDS.sleep(1);
			check.click();
		}
		if (check.getAttribute("checked").equals("true")) {
			System.out.println("checkbox[checked]");
		}
		TimeUnit.SECONDS.sleep(2);
		assertEquals("Register User (verify)",
				driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).getAttribute("text"));
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
	}

	@Test
	public static void Test6() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		assertEquals("Verify user", driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.TextView"))
				.getAttribute("text"));
		assertEquals("Mr. Burns", driver.findElementById("io.selendroid.testapp:id/label_name_data").getAttribute("text"));
		assertEquals("Joe Ben", driver.findElementById("io.selendroid.testapp:id/label_username_data").getAttribute("text"));
		assertEquals("@213qwertY", driver.findElementById("io.selendroid.testapp:id/label_password_data").getAttribute("text"));
		assertEquals("abcd@gmail.com", driver.findElementById("io.selendroid.testapp:id/label_email_data").getAttribute("text"));
		assertEquals("C#", driver.findElementById("io.selendroid.testapp:id/label_preferedProgrammingLanguage_data").getAttribute("text"));
		assertEquals("true", driver.findElementById("io.selendroid.testapp:id/label_acceptAdds_data").getAttribute("text"));
		assertEquals("Register User", driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser").getAttribute("text"));
		driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser").click();
	}

	@Test
	public static void Test7() throws InterruptedException {

		driver.findElementById("io.selendroid.testapp:id/buttonStartWebview").click();
		TimeUnit.SECONDS.sleep(3);
		MobileElement text2 = driver.findElementByClassName("android.widget.EditText");
		MobileElement dp = driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[4]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]");

		text2.clear();
		text2.sendKeys("Bolt");
		assertEquals("Volvo", dp.getAttribute("text"));
		dp.click();
		TimeUnit.SECONDS.sleep(3);
		List<MobileElement> t3 = driver.findElementsByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView");
		System.out.println(t3.size());
		for (int i = 1; i <= t3.size(); i++) {

			TimeUnit.SECONDS.sleep(3);
			System.out.println(driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["
							+ i + "]")
					.getAttribute("text") + " is selected");

			driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView["
							+ i + "]")
					.click();

			TimeUnit.SECONDS.sleep(3);
			if (i == 3) {

				break;

			} else {
				dp.click();
			}
			TimeUnit.SECONDS.sleep(3);
		}
		TimeUnit.SECONDS.sleep(2);
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[4]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button")
				.click();
		TimeUnit.SECONDS.sleep(2);
		MobileElement e = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TableLayout/android.widget.TableRow[4]/android.webkit.WebView/android.webkit.WebView/android.widget.TextView[4]"));

		assertEquals("\"Bolt\"", e.getAttribute("text"));
		driver.findElementByXPath("//android.view.View[@content-desc=\"here\"]/android.widget.TextView").click();
		TimeUnit.SECONDS.sleep(2);
	}

	@Test
	public static void Test8() throws InterruptedException {
		driver.findElement(By.id("io.selendroid.testapp:id/spinner_webdriver_test_data")).click();
		TimeUnit.SECONDS.sleep(2);
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.TextView[3]")
				.click();
		TimeUnit.SECONDS.sleep(2);

		
		List<MobileElement>yu=driver.findElementsByClassName("android.widget.RadioButton");
		for (MobileElement mob : yu) {
			if(mob.isEnabled())
			{
				mob.click();
				System.out.println(mob.getAttribute("resource-id")+" is selected");
				TimeUnit.SECONDS.sleep(2);
			}
			else
			{
				System.out.println(mob.getAttribute("resource-id")+" is disabled");
			}
		}
		
		scrollDown();
		driver.findElementById("io.selendroid.testapp:id/goBack").click();
		TimeUnit.SECONDS.sleep(2);
	}
	@Test
	public static void Test9() throws InterruptedException {
		driver.findElement(By.id("io.selendroid.testapp:id/buttonTest")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.id("android:id/button1")).click();
		TimeUnit.SECONDS.sleep(3);
		
	}

	public static boolean isElementPresent(By by) {

		try {

			driver.findElement(by);

			return true;

		} catch (NoSuchElementException e) {

			return false;

		}

	}

	public static void scrollDown(){
	        Dimension dimension = driver.manage().window().getSize();
	        int scrollStart = (int) (dimension.getHeight());
	        int scrollEnd = (int) (dimension.getHeight() * 0.5);

	        new TouchAction((PerformsTouchActions) driver)
	                .press(PointOption.point(0, scrollStart))
	                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	                .moveTo(PointOption.point(0, scrollEnd))
	                .release().perform();
	    }
}
