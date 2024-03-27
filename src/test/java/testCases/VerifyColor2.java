package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyColor2 {

	public static void main(String[] args) {
		// open Chrome
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url orange
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);

		// get element color
		String color = driver.findElement(By.xpath("//button[@type='submit']")).getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();

		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();

		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);

		Assert.assertEquals("#ff0000", actualColor);
		System.out.print("The color of text is :" + actualColor);
	}

}
