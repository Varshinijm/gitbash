package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCssValueProperties1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/register");
		
//		driver.findElement(By.partialLinkText(" SPANISH ")).click();
//		driver.findElement(By.partialLinkText(" ENGLISH")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up ']")).click();
		
		System.out.println(driver.findElement(By.id("first_name-error")).getCssValue("color"));
		System.out.println(driver.findElement(By.id("last_name-error")).getCssValue("color"));
		System.out.println(driver.findElement(By.id("email-error")).getCssValue("color"));
		System.out.println(driver.findElement(By.id("phone-error")).getCssValue("color"));
		System.out.println(driver.findElement(By.id("password-error")).getCssValue("color"));
		System.out.println(driver.findElement(By.id("password_confirmation-error")).getCssValue("color"));
	}
}
