package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindows {

	public static void main(String[] args) throws InterruptedException {
		
		 //Open chrome browser
			WebDriver driver = new ChromeDriver();
			// Maximize browser
			driver.manage().window().maximize();
			// Open url application
			driver.get("https://demoqa.com/browser-windows");
			
			// cliquer sur la fenetre publicité
			driver.findElement(By.className("fc-button-label")).click();
			
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			driver.navigate().forward();
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			
			
	}

}
