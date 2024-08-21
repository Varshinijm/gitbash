package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ToAvoidNotificationPopupInFireFox {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions settings=new FirefoxOptions();
		//settings.setProfile(new FirefoxProfile());
		settings.addPreference("dom.webnotifications.enabled", true);
		settings.addPreference("geo.enabled", false);
		//settings.setCapability("dom.webnotifications.enabled", true);
//		settings.setCapability("dom.webnotifications.enabled", true);
		
		FirefoxDriver driver=new FirefoxDriver(settings);
//		System.out.println(settings.getCapability("notification"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.easemytrip.com/");
	}
}
