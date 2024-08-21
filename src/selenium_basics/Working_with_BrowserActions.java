package selenium_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_BrowserActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
	}
}
