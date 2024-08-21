package Task;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindowsInOneScreenSideBySide {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(5000);
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
	
		Point position1 = new Point(0,0 );
		Dimension size1=new Dimension(500, 1000);
		driver.manage().window().setSize(size1);
		driver.manage().window().setPosition(position1);
		int width = 500;
		for(String windowId:allWindowId) {
			
			driver.switchTo().window(windowId);
			
			Point pos = driver.manage().window().getPosition();
			Dimension siz = driver.manage().window().getSize();
			
			Point position = new Point( width,0);
			Dimension size=new Dimension(siz.getWidth()-60,size1.getHeight());
			
			//x+=pos.getX();
			
			driver.manage().window().setPosition(position);
			driver.manage().window().setSize(size);
				
			width=width+siz.getWidth()-80;
			
		}
	}
}
