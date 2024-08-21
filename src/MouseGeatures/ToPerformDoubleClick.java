package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		WebElement plusButton = driver.findElement(By.id("add"));
		WebElement minusButton = driver.findElement(By.id("minus"));
		
		Actions actions=new Actions(driver);
		actions.doubleClick(plusButton).perform();
		Thread.sleep(2000);
		actions.doubleClick(minusButton).perform();
	}
}
