package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillFieldUsingJsExecuter {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		driver.get("https://demoqa.com/text-box");
		
		// cliquer sur la fenetre publicité
		driver.findElement(By.className("fc-button-label")).click();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	

		// Remplir les champs en utilisant JavascriptExecutor

		WebElement fullName = driver.findElement(By.id("userName"));
		executor.executeScript("arguments[0].value='mouna aloulou';", fullName);

		WebElement email = driver.findElement(By.id("userEmail"));
		executor.executeScript("arguments[0].value='mouna@yahoo.fr';", email);

		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		executor.executeScript("arguments[0].value='25 RUE DE LA JOIE';", currentAdress);
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		currentAdress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currentAddress")));
		WebElement permanentAdress;
		permanentAdress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("permanentAddress")));

		// Copy Paste** chord permet la continuité de l'action selectionner copier
		// etcoller

		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
	
		// Ctrl+V Script écrit par soufiane mais
		// Zied a dit que ce n'est pas trés interressant
		// il suffit de faire avec le Key.chord

		// executor.executeScript("arguments[0].select();",currentAdress);
		// executor.executeScript("arguments[0].execCommand('copy');");
		// executor.executeScript("arguments[1].focus();arguments[1].select();",
		// permanentAdress, permanentAdress);
		// executor.executeScript("arguments[0].execCommand('paste');");
		
		//((JavascriptExecutor) driver).executeScript("Window.scrollBy(0,350)", "");??
		
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		executor.executeScript("arguments[0].click();", btnSubmit);
		
		driver.quit();

	}

}
