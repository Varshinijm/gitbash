package Task;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverFocusAndManageWebBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(10000);
		Set<String> allWindowsId = driver.getWindowHandles();
		
//		for(String windowId:allWindowsId)
//		{
//			driver.switchTo().window(windowId);
//			String title = driver.getTitle();
//			
//			Dimension dimension1 = new Dimension(200,200);
//			driver.manage().window().setSize(dimension1);
//			
//			Point point1 = new Point(20,20);
//			driver.manage().window().setPosition(point1);
//			
//			if(title.contains("Multiple popups"))
//			{
//				Dimension dimension = new Dimension(200,200);
//				driver.manage().window().setSize(dimension);
//				
//				Point point = new Point(20,20);
//				driver.manage().window().setPosition(point);
//			}
//			else if(title.contains("Cadbury"))
//			{
//				Dimension dimension = new Dimension(400,400);
//				driver.manage().window().setSize(dimension);
//				
//				Point point = new Point(50,50);
//				driver.manage().window().setPosition(point);
//			}
//			else if(title.contains("Campco"))
//			{
//				Dimension dimension = new Dimension(400,400);
//				driver.manage().window().setSize(dimension);
//				
//				Point point = new Point(70,70);
//				driver.manage().window().setPosition(point);
//			}
//			else if(title.contains("Nestlé"))
//			{
//				Dimension dimension = new Dimension(400,400);
//				driver.manage().window().setSize(dimension);
//				
//				Point point = new Point(90,90);
//				driver.manage().window().setPosition(point);
//			}
//			
//		}
		
		Iterator<String> i=allWindowsId.iterator();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
			Dimension size = driver.manage().window().getSize();
			Point position = driver.manage().window().getPosition();
			
			int height = size.getHeight()+100;
			int width=size.getWidth()+100;
			
			int x = position.getX()+10;
			int y=position.getY()+10;
			
			Dimension size1=new Dimension(width, height);
			Point position1 = new Point(x, y);
			
			driver.manage().window().setPosition(position1);
			driver.manage().window().setSize(size1);
			
		}
	}
}
