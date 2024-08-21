package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCssValueProperties {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		WebElement emailError = driver.findElement(By.id("email-error"));
		System.out.println(emailError.getCssValue("color"));
		WebElement passwordError = driver.findElement(By.id("password-error"));
		System.out.println(passwordError.getCssValue("color"));
	}
}
