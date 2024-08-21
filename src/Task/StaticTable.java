package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		WebElement fullTable = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates')]/../..//table"));
		List<WebElement> noOfRows = fullTable.findElements(By.xpath("tbody/tr"));
		
		for(WebElement rows:noOfRows)
		{
			System.out.print(rows.findElement(By.xpath("td[1]")).getText()+"-");
			System.out.println(rows.findElement(By.xpath("td[2]/div[1]")).getText());
		}
	}
}
