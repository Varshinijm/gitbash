package browserActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverFocus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(10000);
		Set<String> allWindowsId = driver.getWindowHandles();
		
		for(String windowId:allWindowsId)
		{
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
		}
	}
}
