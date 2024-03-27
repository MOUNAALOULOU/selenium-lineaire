package testCases;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public WebDriver driver;

	@Before
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().deleteAllCookies();
	}

	@Test
	public void valid_UserCredential() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void invalid_UserCredential() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("Mouna@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("Mouna123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
