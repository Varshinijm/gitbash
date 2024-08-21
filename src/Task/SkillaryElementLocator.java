package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillaryElementLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		driver.findElement(By.partialLinkText("SPANISH")).click();
		driver.findElement(By.partialLinkText("ENGLISH")).click();
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		driver.findElement(By.id("email")).sendKeys("varshinijm99@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Var@123");
		driver.findElement(By.id("usertype_yes")).click();
		driver.findElement(By.id("groupcode")).sendKeys("TYSS123");
		driver.findElement(By.name("remember")).click();
	}
}
