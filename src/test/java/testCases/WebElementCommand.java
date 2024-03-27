package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) throws InterruptedException {

		// Open chrome browser
		WebDriver driver = new ChromeDriver();

		// Imlicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Maximize browser
		driver.manage().window().maximize();

		// Open url application
		String url = "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
		driver.get(url);

		// Clear Field
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		// récuperation de la valeur de l'attribut ici id

		String attValue = email.getAttribute("value");
		System.out.println("the id attribute is : " + attValue);

		// fill email
		email.sendKeys("admin@yourstore.com");

		// Faire sortir longueur/ largeur d'un webelement
		Dimension dimensions = email.getSize();
		System.out.println("Hight : " + dimensions.height);
		System.out.println("Width : " + dimensions.width);

		// clear field
		WebElement password = driver.findElement(By.id("Password"));
		String attValue2 = email.getAttribute("id");
		System.out.println("the id attribute is : " + attValue2);
		password.clear();
		// Fill password
		password.sendKeys("admin");

		// Localisation du webelement dans la page avec les coordonnées xy
		Point point = password.getLocation();
		System.out.println("X coordinate : " + point.x);
		System.out.println("Y coordinate : " + point.y);

		// click on login button
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		String attValue3 = btnLogin.getAttribute("type");
		System.out.println("the type attribute is : " + attValue3);

		                                                                                  // Vérifier si le bouton affiché vrai/Faux par la commande is displayed et son
		// retour est
		// de type booleen vrai ou faux
		boolean status = btnLogin.isDisplayed();
		System.out.println("Status is :" + status);

		// Vérifier si le bouton activé vrai/Faux par la commande isEnabled
		boolean status1 = btnLogin.isEnabled();
		System.out.println("Status is :" + status1);

		// Vérifier si le bouton existe vrai/faux

		List<WebElement> btnLogin1 = driver.findElements(By.xpath("//button[@type='submit']"));
		if (btnLogin1.size() != 0) {
			System.out.println(" The Login button exist");
		} else {
			System.out.println(" The Login button exist");

		}
		btnLogin.click();
		driver.quit();
	}

}
