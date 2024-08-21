package browserActions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToPerformBrowserHistoryNavigations {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.britania.co.in");
		driver.get("https://www.parleproducts.com");
		driver.get("https://sunfeastworld.com");
		
		Thread.sleep(2000);
		Navigation navigation = driver.navigate();
		navigation.back();
		Thread.sleep(2000);
		navigation.back();
		Thread.sleep(2000);
		navigation.refresh();
		Thread.sleep(2000);
		navigation.forward();
		
		URL url = new URL("https://www.lotusbiscoff.com/");
		navigation.to(url);
		
		navigation.to("https://cadburygifting.in/");
	}
}
