package Task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDownNewWindowSwitch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://parivahan.gov.in/parivahan/");
		String parentWindow = driver.getWindowHandle();
		WebElement externalLinks = driver.findElement(By.partialLinkText("External Links"));
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.SHIFT).perform();
		externalLinks.click();
		actions.keyUp(Keys.SHIFT).perform();
		
		Set<String> allWindow = driver.getWindowHandles();
		allWindow.remove(parentWindow);
		
		for(String childWindow:allWindow) 
		{
			driver.switchTo().window(childWindow);
		}
		WebElement onlineServices = driver.findElement(By.partialLinkText("Online Services"));
		actions.keyDown(Keys.CONTROL).perform();
		onlineServices.click();
		actions.keyDown(Keys.CONTROL).perform();
		driver.close();
	
	}
}
