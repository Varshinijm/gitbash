package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValueAltValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		String alternativeText = driver.findElement(By.xpath("//img[@title='Wedding Suits']")).getAttribute("alt");
		System.out.println(alternativeText);
	}
}
