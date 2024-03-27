package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderDemo {

	public static void main(String[] args) {
		
		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		driver.get("https://demoqa.com/tool-tips/");
		// cliquer sur la fenetre publicité
		driver.findElement(By.className("fc-button-label")).click();
		
		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		System.out.println("The placeholder is: "+textPlaceHolder);
		

	}

}
