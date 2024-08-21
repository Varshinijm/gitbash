package IFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeedTestAdvertisementFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.speedtest.net/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@data-google-container-id='5']"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("cbb")).click();
		driver.switchTo().defaultContent();
	}
}
