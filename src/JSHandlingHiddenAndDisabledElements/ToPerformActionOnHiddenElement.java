package JSHandlingHiddenAndDisabledElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionOnHiddenElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		WebElement hiddenTextBox = driver.findElement(By.name("custom_gender"));
		driver.executeScript("arguments[0].value='Data Entered';", hiddenTextBox);
	}
}
