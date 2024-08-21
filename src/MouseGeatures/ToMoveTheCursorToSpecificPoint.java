package MouseGeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveTheCursorToSpecificPoint {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		Actions actions=new Actions(driver);
		passwordTextBox.sendKeys("Password@123");
		Thread.sleep(2000);
		int xOff = (passwordTextBox.getSize().getWidth())/2;
		actions.moveToElement(passwordTextBox, xOff, 0).click().perform();
	}
}
