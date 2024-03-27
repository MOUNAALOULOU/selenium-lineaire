package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) {
		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		driver.get("https://demoqa.com/select-menu");
		// cliquer sur la fenetre publicité
		driver.findElement(By.className("fc-button-label")).click();

		WebElement list = driver.findElement(By.id("oldSelectMenu"));
		Select dropDownList = new Select(list);

		// Select By index
		//dropDownList.selectByIndex(3);
		// Select By value
		//dropDownList.selectByValue("6");
		// Select By visible text
		dropDownList.selectByVisibleText("Indigo");
		
		

	}

}
