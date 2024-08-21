package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllignmentUsingGetSizeGetLocationFaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
		
		Point emailBoxLoc = emailTextBox.getLocation();
		Point passwordBoxLoc = passwordTextBox.getLocation();
		
		System.out.println(emailBoxLoc.getX());
		System.out.println(passwordBoxLoc.getX());
		
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
