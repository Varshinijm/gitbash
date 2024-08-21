package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllChildPagesOptimizedSolution {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		String parentWindowID = driver.getWindowHandle();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowID);
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			driver.close();
		}
	}
}
