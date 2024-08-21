package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multiListBox = driver.findElement(By.id("cars"));
		Select courceByPriceSelect=new Select(multiListBox);
		
		Thread.sleep(1000);
		courceByPriceSelect.selectByValue("199");
		Thread.sleep(1000);
		courceByPriceSelect.selectByIndex(0);
		Thread.sleep(1000);
		courceByPriceSelect.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		
		courceByPriceSelect.deselectByIndex(2);
		courceByPriceSelect.deselectAll();
		
	}
}
