package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingLinkTextLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://woodenstreet.com/");
		
		driver.findElement(By.linkText("Dining & Kitchen")).click();
		driver.findElement(By.partialLinkText("Modular Kitchen")).click();
	}
}
