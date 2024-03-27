package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");

		Actions actions = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		actions.dragAndDrop(source, target).build().perform();

		// Verify text changed into dropped!

		String textTarget = target.getText();

		if (textTarget.equals("Dropped!")) {
			System.out.println("pass: source is dropped to target as expected");

		} else {
			System.out.println("fail: source could not be dropped to target as expected");

		}
		driver.quit();
	}

}
