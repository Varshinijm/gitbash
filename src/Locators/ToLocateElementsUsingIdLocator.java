package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingIdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		
		Thread.sleep(20000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Create Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("First Name")).sendKeys("Sindhu");
		driver.findElement(By.id("Last Name")).sendKeys("J M");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Phone Number")).sendKeys("9741885894");
		driver.findElement(By.id("Email Address")).sendKeys("sindhujm@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sindhu@1999");
		driver.findElement(By.id("Confirm Password")).sendKeys("Sindhu@1999");
		driver.findElement(By.id("Terms and Conditions")).click();
		driver.findElement(By.id("btnDisabled")).click();	
		
	}
}
