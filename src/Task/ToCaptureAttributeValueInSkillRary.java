package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValueInSkillRary {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("varshinijm99@gmail.com");
		String valueEntered = emailTextBox.getAttribute("value");
		System.out.println(valueEntered);
	}
}
