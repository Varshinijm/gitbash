package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiElementLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Forgot")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		for(String windowId:allWindowId)
		{
			driver.switchTo().window(windowId);
		}	
		driver.findElement(By.id("nextStep")).click();
		driver.findElement(By.id("userName")).sendKeys("Varshinijm");
		driver.findElement(By.id("accountNo")).sendKeys("9876567898654");
		driver.findElement(By.id("mobileNo")).sendKeys("8105549834");
		driver.findElement(By.id("datepicker5")).sendKeys("29/11/2023");
		driver.findElement(By.name("captchaValue")).sendKeys("aswss");
		driver.findElement(By.id("go")).click();
	}
}
