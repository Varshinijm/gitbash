package BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KalkiFashions {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.partialLinkText("SAREE")).click();
		driver.findElement(By.xpath("//a[text()='Bridal Saree']")).click();
	}
}
