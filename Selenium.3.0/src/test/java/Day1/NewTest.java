package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	// String sText = "Home";

	@Test(priority = 1)

	public void SignIn() throws InterruptedException {
		System.out.println("function");
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.name("q")).sendKeys("GoldRate");
		 * driver.findElement(By.name("q")).submit();
		 */
		// System.out.println(driver.getTitle());
		/*
		 * WebElement MenuButton =
		 * driver.findElement(By.className("dt-mobile-menu-icon")); Actions builder =
		 * new Actions(driver); builder.clickAndHold(MenuButton).release(MenuButton);
		 * builder.build().perform();
		 */

		/*
		 * WebElement resize =
		 * driver.findElement(By.xpath("//div[@id='resizable']//div[3]")); Actions
		 * builder = new Actions(driver); builder.dragAndDropBy(resize, 400,
		 * 400).perform();
		 */

		// driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[1]"));
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("function");
		// driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[1]")).click();
		// System.out.println("function");
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.name("Login"));
		// Assert.assertEquals(sText, driver.getTitle());

	}

	@Test(priority = 2)
	public void CartValidation() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@BeforeClass
	public void beforeMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");

	}

	@AfterClass
	public void afterMethod() {
		driver.close();
	}

}
