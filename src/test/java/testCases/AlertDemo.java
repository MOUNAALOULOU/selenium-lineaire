package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		WebElement btnClickMe = driver.findElement(By.id("alertButton"));

		btnClickMe.click();

		// Accept alert

		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
