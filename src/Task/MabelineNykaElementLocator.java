package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MabelineNykaElementLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.com/");
		String parentWindowId = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nykaafashion.com/");
		driver.findElement(By.linkText("Men")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId:allWindowId)
		{
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("Men"))
			{
				break;
			}
		}
		driver.findElement(By.linkText("Careers")).click();
		driver.switchTo().window(parentWindowId);
		driver.close();
		
	}
}
