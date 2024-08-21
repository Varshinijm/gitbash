package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturErrorMessgaeUsingGetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("varshinijm99@gmail.com");
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("abc@123");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).submit();
		Thread.sleep(2000);
		String errorMessage = driver.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
		System.out.println(errorMessage);
	}
}
