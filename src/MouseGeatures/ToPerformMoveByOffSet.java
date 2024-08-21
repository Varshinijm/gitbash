package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveByOffSet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://trello.com/home");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("varshini.j@testyantra.in");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Var@1999");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//h3[contains(text(),' workspace')]/../..//div[text()='ELF44']")).click();
		
		WebElement sourceEle = driver.findElement(By.linkText("revised"));
		//WebElement destEle = driver.findElement(By.xpath("//h2[text()='Selenium']/../../..//button[text()='Add a card']"));
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDropBy(sourceEle, 200, 100).perform();
	}
}