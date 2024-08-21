package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplitWaitOnShopperstackCheckDelivery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("varshinijm99@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Var@1999");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("//span[text()='LEVIS']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560091");
		WebElement enabled = driver.findElement(By.id("Check"));
		while(true)
		{
			if(driver.findElement(By.id("Check")).isEnabled()==true)
			{
				enabled.click();
				break;
			}
		}
	}
}
