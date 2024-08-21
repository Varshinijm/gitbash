package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopPlaceOrderAndRemove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Varshini");
		driver.findElement(By.id("LastName")).sendKeys("J M");
		driver.findElement(By.id("Email")).sendKeys("varshinijjm1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Varsh@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Varsh@123");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.partialLinkText("Log out")).click();
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("varshinijjm1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Varsh@123");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		driver.findElement(By.partialLinkText("$25 Virtual Gift Card")).click();
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Varshini J M");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("jmvarshini@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(7000);
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		
	}
}
