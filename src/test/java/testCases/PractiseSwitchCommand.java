package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSwitchCommand {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(3000);
		
		//Switching to the frame
		driver.switchTo().frame("gdpr-consent-notice");
		WebElement btnCookies = driver.findElement(By.id("save"));
		btnCookies.click();
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,600)");

		// Switching to the frame
		driver.switchTo().frame("a077aa5e");
		

		System.out.println("we are switch to iframe");

		// cliquer sur la fenetre publicité

		// driver.findElement(By.Xpath("//*[@id="save"]/span[1]/div/span")).click();

		WebElement image = driver.findElement(By.xpath("html/body/a/img"));
		image.click();
		System.out.println("we are done");
		
		// Store and print of all the name of the Windows opened
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		// Pass a window handle to other handle // passage d'une fenetre à une autre
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			System.out.println(handle);
		}
		Thread.sleep(3000);
		driver.switchTo().frame("sp_message_iframe_1061990");
		driver.findElement(By.xpath("//button[text()='Accepter et fermer']")).click();
		driver.quit();	 
	}

}
