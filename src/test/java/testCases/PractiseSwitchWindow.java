package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSwitchWindow {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		driver.get("https://demoqa.com/browser-windows");
		// cliquer sur la fenetre publicité
		driver.findElement(By.className("fc-button-label")).click();

		// Store and print the name of the first Window
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		WebElement btnNewWindowMessage = driver.findElement(By.id("messageWindowButton"));
		btnNewWindowMessage.click();

		// Store and print of all the name of the Windows opened
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		// Pass a window handle to other handle // passage d'une fenetre à une autre

		for (String handle1 : driver.getWindowHandles()) {
			
			driver.switchTo().window(handle1);
			System.out.println(handle1);
		
		}
		driver.quit();

	}

}
