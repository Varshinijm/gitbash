package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingClassNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.className("email")).sendKeys("varshinijm99@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Var@1999");
		driver.findElement(By.className("button-1 login-button")).click();
	}
}
