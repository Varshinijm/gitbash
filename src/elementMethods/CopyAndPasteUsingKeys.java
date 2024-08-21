package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPasteUsingKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement FirstNameTextBox = driver.findElement(By.id("FirstName"));
		FirstNameTextBox.sendKeys("ELF_44");
		Thread.sleep(1000);
		FirstNameTextBox.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		FirstNameTextBox.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
		
		FirstNameTextBox.clear();
		FirstNameTextBox.sendKeys("ELF_45");
		FirstNameTextBox.sendKeys(Keys.CONTROL+"a"+"c");
		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
	}
}
