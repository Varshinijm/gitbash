package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToComapreAllignmentUsingGetSizeGetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		
		Point emailBoxLoc = emailTextBox.getLocation();
		Point passwordBoxLoc = passwordTextBox.getLocation();
		
		if(emailBoxLoc.getX()==passwordBoxLoc.getX())
		{
			System.out.println("Allignment is proper");
		}
		else
		{
			System.out.println("Allignment is not proper");
		}
		
		
	}
}
