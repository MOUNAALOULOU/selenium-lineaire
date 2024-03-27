package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/menu/");

		WebElement mouseHover = driver.findElement(By.id("//*[@id='nav']/li[2]/a"));
		
		//We can use relative xpath by selector hub://a[normalize-space()='Main Item 2']//
		
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseHover).perform();
		driver.quit();
				

		
	}

}
