package Task;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.get("https://shoppersstack.com/");
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Login"))));
		Actions actions=new Actions(driver);
		for(;;)
		{
			try
			{
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Swagger Documentation")));
				driver.findElement(By.linkText("Swagger Documentation")).click();
				break;
			}
			catch (NoSuchElementException e)
			{
				actions.scrollByAmount(0,1000).perform();
			}
		}
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
		alert.sendKeys("admin");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(1000);
		alert.sendKeys("admin");
		Thread.sleep(2000);
		alert.accept();
	}
}
