package browserActions;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWebBrowser2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.lotusbiscoff.com/");
		
		Point position = driver.manage().window().getPosition();
		System.out.println("X Position:"+position.getX());
		System.out.println("Y Position:"+position.getY());
		
		Point position1 = new Point(20, 20);
		driver.manage().window().setPosition(position1);
	}
}
