package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureErrorMessageInVtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTextBox = driver.findElement(By.id("username"));
		usernameTextBox.clear();
		usernameTextBox.sendKeys("varshini");
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("abc@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		String errorMessage = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(errorMessage);
	}
}
