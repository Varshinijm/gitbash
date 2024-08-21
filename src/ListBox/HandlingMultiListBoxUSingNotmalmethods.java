package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiListBoxUSingNotmalmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiListBox = driver.findElement(By.id("cars"));
		
		driver.findElement(By.xpath("//option[@value='199']")).click();
		WebElement secondOption = driver.findElement(By.xpath("//option[@value='299']"));
		secondOption.sendKeys(Keys.CONTROL);
		secondOption.click();
	}
}
