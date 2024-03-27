package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Open url application
		driver.get("https://demoqa.com/buttons");

		//Instantiate Actions class
		Actions actions = new Actions(driver);

		//Retrieve web element to perform double click
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));

		actions.contextClick(btnRightClick).perform();

		//Assert
		String text = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals(text, "You have done a right click");
		
		driver.quit();

	}

}
