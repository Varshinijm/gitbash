package Assesment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void alert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Forgot Username")).click();
		Set<String> allWindow = driver.getWindowHandles();
		allWindow.remove(parentWindow);
		for(String childWindow:allWindow)
		{
			driver.switchTo().window(childWindow);
		}
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight()+100;
		int width = size.getWidth()+100;
		Dimension newSize=new Dimension(width, height);
		driver.manage().window().setSize(newSize);
		driver.findElement(By.id("nextStep")).click();
		
		WebElement username = driver.findElement(By.id("userName"));
		WebElement submit = driver.findElement(By.id("go"));
		
		submit.click();
		alert(driver);
		
		username.sendKeys("varshini");
		submit.click();
		alert(driver);		
		
		WebElement acctNo = driver.findElement(By.id("accountNo"));
		acctNo.sendKeys("1234");
		submit.click();
		alert(driver);
		
		acctNo.clear();
		acctNo.sendKeys("12345678567");
		submit.click();
		alert(driver);
		
		WebElement dropDown = driver.findElement(By.id("selCountry"));
		Select listBox=new Select(dropDown);
		listBox.selectByVisibleText("India");
		submit.click();
		alert(driver);
		
		WebElement mobileNo = driver.findElement(By.id("mobileNo"));
		mobileNo.sendKeys("abcd");
		submit.click();
		alert(driver);
		
		mobileNo.clear();
		mobileNo.sendKeys("8789657452");
		submit.click();
		alert(driver);
		
		WebElement datepicker = driver.findElement(By.id("datepicker5"));
		datepicker.sendKeys("30/02/2001");
		submit.click();
		alert(driver);
		
		datepicker.clear();
		datepicker.sendKeys("24/14/2000");
		submit.click();
		alert(driver);
		
		datepicker.clear();
		datepicker.sendKeys("24/10/2025");
		submit.click();
		alert(driver);
		
		datepicker.clear();
		datepicker.sendKeys("24/10/1999");
		submit.click();
		alert(driver);
		
	}
}
