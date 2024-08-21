package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValueToolTipText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		
		Object toolTipText = driver.findElement(By.xpath("//img[@title='Dining Table set']")).getAttribute("title");
		System.out.println(toolTipText);
	}
}
