package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor {

	public static void main(String[] args) {
		
		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		//Get element color
		String color = driver.findElement(By.id("doubleClickBtn")).getCssValue("background-color");
		
		Color color1 = Color.fromString(color);
		String actualColor = color1.asHex();
		Assert.assertEquals("#007bff", actualColor);
		
		driver.quit();
		
		
	}

}
