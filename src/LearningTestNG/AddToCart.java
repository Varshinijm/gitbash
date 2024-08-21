package LearningTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCart extends loginClass{

	@Test(priority = 2)
	public void AddToCart()throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
}
