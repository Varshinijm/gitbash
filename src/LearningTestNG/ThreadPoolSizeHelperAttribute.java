package LearningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThreadPoolSizeHelperAttribute {
	@Test(priority = 0,invocationCount = 5, threadPoolSize = 5)
	public void BMW()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("from BMW");
		driver.quit();
	}
	
	@Test(priority = 2,invocationCount = 5, threadPoolSize = 2)
	public void benz()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mercedes-benz.co.in/");
		Reporter.log("from benz");
		driver.quit();
	}
	
	@Test(priority = 1,invocationCount = 0)
	public void volvo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.volvo.com/en/");
		Reporter.log("from volvo");
		driver.quit();
	}
}
