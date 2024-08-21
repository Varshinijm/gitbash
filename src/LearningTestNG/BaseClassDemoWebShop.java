package LearningTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClassDemoWebShop{

	ChromeDriver driver;
	@BeforeClass
	public void Launchbrowser()
	{
		//System.setProperty("wedriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
}
