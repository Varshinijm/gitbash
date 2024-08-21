package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScroeBoard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
		List <WebElement> fullRows = driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		int i=1;
		for(WebElement row:fullRows)
		{
			System.out.print(row.findElement(By.xpath("td[1]")).getText()+" ");
			if(i%2!=0) {
			System.out.println(row.findElement(By.xpath("td[3]")).getText());}
			i++;
			if(i==18)
			{
				break;
			}
		}
		driver.findElement(By.xpath(""));
	}
}
