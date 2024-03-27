package testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCaseOnEdge {

	public static void main(String[] args) throws InterruptedException {

		// Open Edge browser
		WebDriver driver = new EdgeDriver();

		// Imlicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize browser
		driver.manage().window().maximize();

		// Open url application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Delete cookies
		// driver.manage().deleteAllCookies();

		// clear field
		driver.findElement(By.id("Email")).clear();

		// Fill email
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);

		// clear field
		driver.findElement(By.id("Password")).clear();

		// Fill password
		driver.findElement(By.id("Password")).sendKeys("admin");

		// Click on Login button
		// driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Click on Login button with explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		btnLogin.click();

		Thread.sleep(3000);

		// validation enter on home page
		String text = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).getText();
		Assert.assertEquals(text, "Dashboard");

		// Close browser
		// driver.close();

		// kill session // kill browsers
		driver.quit();

	}

}
