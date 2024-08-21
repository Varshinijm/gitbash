package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedSkillaryRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/register");
		
		System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());		
		Thread.sleep(1000);
		driver.findElement(By.id("usertype_yes")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
	}
}
