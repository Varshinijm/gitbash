package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllActionsOnDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("vars24@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("Var@1999");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input")).click();
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		WebElement priceOfFirstProd = driver.findElement(By.xpath("//th[contains(text(),'Total')]/../../..//span[text()=130.00]"));
		String firstProdPrice = priceOfFirstProd.getText();
		firstProdPrice=firstProdPrice.trim();
		double price1=Double.parseDouble(firstProdPrice);
		
		WebElement priceOfSecProd = driver.findElement(By.xpath("//th[contains(text(),'Total')]/../../..//span[text()=1590.00]"));
		String secProdPrice = priceOfSecProd.getText();
		secProdPrice=secProdPrice.trim();
		double price2=Double.parseDouble(secProdPrice);
		
		WebElement priceOfThiProd = driver.findElement(By.xpath("//th[contains(text(),'Total')]/../../..//span[text()=10.00]"));
		String thiProdPrice = priceOfThiProd.getText();
		thiProdPrice=thiProdPrice.trim();
		double price3=Double.parseDouble(thiProdPrice);
		double finalProdPrice = ((price1<price2)?((price1<price3)?price1:price3):((price2<price3)?price2:price3));
		System.out.println(finalProdPrice);
		
		driver.findElement(By.xpath("//th[contains(text(),'Total')]/../../..//span[text()="+finalProdPrice+"]/../..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value=\"Update shopping cart\"]")).click();
		
	}
}
