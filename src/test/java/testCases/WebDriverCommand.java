package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// Open url application
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);

		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();

		System.out.println("The title of the page is : " + titlePage);
		System.out.println("The title of the page is : " + titleLength);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Verification successfull - The correct url is opened");
		} else {
			System.out.println("Verification failed - incorrect url is opened");

		}
		System.out.println("Actual url : " + actualUrl);
		System.out.println("Expected url is : " + url);
		
        //Storing page source in string variable
		String sourcePage = driver.getPageSource();
		
		//Storing Page source variable in int variable
		int lengthSourcePage = sourcePage.length();
		
		//Printing length of the page source on console
		System.out.println("Length of the source page is : " + lengthSourcePage);
		driver.quit();

	}

}
