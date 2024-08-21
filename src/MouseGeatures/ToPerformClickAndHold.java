package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformClickAndHold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.paiinternational.in/");
		WebElement selectCategory = driver.findElement(By.partialLinkText("Select Category"));
		Actions actions=new Actions(driver);
		actions.moveToElement(selectCategory).perform();
		WebElement furniture = driver.findElement(By.partialLinkText("Furniture"));
		actions.moveToElement(furniture).click().perform();
		
		WebElement leftSlider = driver.findElement(By.xpath("//span[contains(@class,'slider from')]"));
		WebElement rightSlider = driver.findElement(By.xpath("//span[contains(@class,'slider to')]"));
		
		actions.clickAndHold(leftSlider).moveToElement(leftSlider, 20, 0).release().perform();
		actions.clickAndHold(rightSlider).moveToElement(rightSlider, -20, 0).release().perform();
		
	}
}
