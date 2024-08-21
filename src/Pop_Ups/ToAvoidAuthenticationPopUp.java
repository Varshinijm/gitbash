package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidAuthenticationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
