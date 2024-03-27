package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeFocusWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(3000);
		// Switching to the frame of the cookies
		driver.switchTo().frame("gdpr-consent-notice");
		WebElement btnCookies = driver.findElement(By.id("save"));
		btnCookies.click();
		
		// Switching to the frame
		driver.switchTo().frame("a077aa5e");

		System.out.println("we switched to the iframe");

		WebElement image = driver.findElement(By.xpath("//body//a//img"));
		image.click();
		System.out.println("we are done");
		
		// Store and print of all the name of the Windows opened
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		// Pass a window handle to other handle // passage d'une fenetre à une autre
		for (String handle1 : driver.getWindowHandles()) {

			driver.switchTo().window(handle1);
			System.out.println(handle1);
		

		}
		driver.close();
		

	}

}
