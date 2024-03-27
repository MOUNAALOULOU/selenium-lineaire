package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/slider/");
		
		// cliquer sur la fenetre publicité

		driver.findElement(By.className("fc-button-label")).click();

		WebElement slider = driver.findElement(By.id("sliderContainer"));

		Actions actions = new Actions(driver);

		actions.moveToElement(slider, 45, 0).click().build().perform();
		
		
		// driver.quit();

	}

}
