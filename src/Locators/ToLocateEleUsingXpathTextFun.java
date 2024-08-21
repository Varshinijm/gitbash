package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateEleUsingXpathTextFun {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("Varshini");
		driver.findElement(By.id("Password")).click();
		String errorMessageForEmailTestBox = driver.findElement(By.cssSelector("span[class=\"field-validation-error\"]")).getText();
		System.out.println(errorMessageForEmailTestBox);
	}
}
