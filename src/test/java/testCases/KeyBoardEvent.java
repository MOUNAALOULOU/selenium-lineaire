package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		driver.get("https://demoqa.com/text-box");
		// cliquer sur la fenetre publicité
		driver.findElement(By.className("fc-button-label")).click();
		

		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));

		
		fullName.sendKeys("mouna aloulou");
		email.sendKeys("mouna@yahoo.fr");
		currentAdress.sendKeys("25 RUE DE LA JOIE");

		// Copy Paste** chord permet la continuité de l'action selectionner copier et coller
		
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));

		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnSubmit);
		
		// Scroll Down
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,600)","");
		
		driver.quit();
		

	}

}
