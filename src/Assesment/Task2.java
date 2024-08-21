package Assesment;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/HP/Downloads/TestPage.html");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(text(),'Click   Here')]")).click();
		Thread.sleep(25000);
		Set<String> allWindow = driver.getWindowHandles();
		LinkedList<String> list=new LinkedList<>();
		String ss;
		for(String window:allWindow)
		{
			driver.switchTo().window(window);
			ss=driver.getTitle();
			ss=ss+"?"+driver.getWindowHandle();
			list.add(ss);
		}	
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++)
		{
			String win=list.get(i);
			int j=win.indexOf('?');
			win=win.substring(j+1);
			driver.switchTo().window(win);
			Thread.sleep(3000);
			driver.close();
		}
		
	}
}
