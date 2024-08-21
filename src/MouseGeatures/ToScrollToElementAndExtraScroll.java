package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToScrollToElementAndExtraScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/");
		Actions actions=new Actions(driver);
		WebElement resumeWriting = driver.findElement(By.linkText("Resume writing"));
		
		ScrollOrigin ref=ScrollOrigin.fromElement(resumeWriting);
		actions.scrollFromOrigin(ref, 0, 150).perform();
	}
}
