package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("varshinijm99@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Var@1999");
		Thread.sleep(1000);
		driver.findElement(By.name("remember")).click();
	}
}
