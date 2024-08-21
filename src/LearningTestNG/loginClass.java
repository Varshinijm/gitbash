package LearningTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginClass extends BaseClassDemoWebShop{
	
	@Test(priority = 1)
	public void Login() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("jyothi24@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Jyothi@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
