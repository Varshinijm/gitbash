package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValueOGivenData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		searchBox.clear();
		searchBox.sendKeys("foundation");
		String valueEntered = searchBox.getAttribute("value");
		System.out.println(valueEntered);
	}
}
