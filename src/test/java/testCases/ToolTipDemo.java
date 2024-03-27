package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		
		// Open chrome browser
				WebDriver driver = new ChromeDriver();
				// Maximize browser
				driver.manage().window().maximize();
				// Open url application
				driver.get("https://demoqa.com/tool-tips/");
				// cliquer sur la fenetre publicité
				driver.findElement(By.className("fc-button-label")).click();
				
				WebElement text = driver.findElement(By.id("toolTipButton"));
                String toolTipText = text.getText();
                if(toolTipText.equals("Hover me to see")){
                	
                	System.out.println("Pass:Tool Tip Matching expected value");

                }else {
                	System.out.println("Fail: Tool tip is not Matching expected value");
                	
                }
	}

}
