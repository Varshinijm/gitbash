package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfiniteScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		
		driver.get("https://onepagelove.com/");
		Actions actions=new Actions(driver);
		for(;;)
		{
			try
			{
				WebElement griddyIcons = driver.findElement(By.linkText("Griddy Icons"));
				wait.until(ExpectedConditions.visibilityOf(griddyIcons));
				griddyIcons.click();
				break;
			}
			catch(NoSuchElementException e)
			{
				actions.scrollByAmount(0, 1000).perform();
			}
			catch(ElementClickInterceptedException e)
			{
				driver.findElement(By.linkText("Griddy Icons")).click();
				break;
			}
		}
	}
}
