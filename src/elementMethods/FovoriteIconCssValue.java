package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FovoriteIconCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/in/beige-kurta-sharara-set-with-foil-mirror-work.html");
		
		WebElement favoriteButton = driver.findElement(By.xpath("//span[@data-wishlist='0']"));
		Thread.sleep(4000);
		favoriteButton.click();
		System.out.println(favoriteButton.getCssValue("background-image"));		
	}
}
