package Task;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FoodPandaActionClassSwitchToClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.foodpanda.com/");
		List<WebElement> allElement = driver.findElements(By.xpath("//ul[contains(@class,'primary-navigation')]/li[not(contains(.,'Choose location'))]"));
		Actions actions=new Actions(driver);
		for(WebElement element:allElement)
		{
			actions.keyDown(Keys.CONTROL).perform();
			element.click();
			actions.keyUp(Keys.CONTROL).perform();
		}
		
		Set<String> allWindow = driver.getWindowHandles();
		for(String childWindow:allWindow)
		{
			driver.switchTo().window(childWindow);
			if(driver.getTitle().contains("panda ads"))
			{
				driver.close();
				break;
			}
		}
	}
}
