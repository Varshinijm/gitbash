package browserActions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWebBrowser1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.lotusbiscoff.com/");
		Dimension size = driver.manage().window().getSize();
		
		System.out.println("Height of WebBrowser:"+size.getHeight());
		System.out.println("Breadth of Webbrowser:"+size.getWidth());
		
		Dimension dimension = new Dimension(500, 500);
		driver.manage().window().setSize(dimension);
		
		
	}
}
