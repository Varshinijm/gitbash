package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHoverAndClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		WebElement womentEthnicWear = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
		Actions actions=new Actions(driver);
//		Thread.sleep(2000);
//		actions.contextClick().perform();
//		
//		actions.click(womentEthnicWear).perform();
		actions.moveToElement(womentEthnicWear).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Silk Sarees']")).click();
		
	}
}
