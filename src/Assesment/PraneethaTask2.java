package Assesment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraneethaTask2 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/HP/Downloads/TestPage.html");
	driver.findElement(By.xpath("//button")).click();
	Thread.sleep(30000);
	Set<String> allWindowIds = driver.getWindowHandles();
	
	ArrayList<String> windowTitles = new ArrayList<>();
	for(String windowId:allWindowIds) {
		driver.switchTo().window(windowId);
		String title = driver.getTitle();
		System.out.println(title);
		windowTitles.add(title);
	}

	/*for(String eachTitle:windowTitles) {
		System.out.println(eachTitle);
	}*/
	
	Collections.sort(windowTitles);
	for(String eachTitle:windowTitles) {
		System.out.println(eachTitle);
		String currentWindowId = driver.getWindowHandle();
		driver.switchTo().window(currentWindowId);
		driver.close();
}
	}
}
