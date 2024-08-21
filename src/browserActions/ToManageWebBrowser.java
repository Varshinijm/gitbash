package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWebBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.lotusbiscoff.com/");
		
		driver.manage().window().fullscreen();
	}
}
