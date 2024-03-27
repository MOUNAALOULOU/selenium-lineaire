package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		// Open url application
		String url = "https://demo.guru99.com/test/upload/";
		driver.get(url);
		// Upload File
		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		uploadFile.sendKeys("C:\\Users\\33772\\Test.txt");
		
		
		
		
	}

}
