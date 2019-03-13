package Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException, AWTException {
		driver.findElement(By.xpath(".//a[@href=contains(text(),'mailmerge.xls')]")).click();
		Robot robot = new Robot();
		Thread.sleep(2000);
		// Thread.sleep throws InterruptedException

		robot.keyPress(KeyEvent.VK_DOWN);
		// press arrow down key of keyboard to navigate and select Save radio button

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("test");

		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		System.out.println("test");
		driver = new ChromeDriver();
		System.out.println("test");
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
