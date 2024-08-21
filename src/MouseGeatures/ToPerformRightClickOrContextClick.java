package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformRightClickOrContextClick {

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
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("revised"))).contextClick().perform();
		WebElement fullwindow = driver.findElement(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));
		System.out.println(fullwindow.getText());
	}
}
