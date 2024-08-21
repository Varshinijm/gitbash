package LaunchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver1=new FirefoxDriver();
		EdgeDriver driver=new EdgeDriver();
		
	}
}
