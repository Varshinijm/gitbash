package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedIff {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.xpath("//a[.='Write mail']")).click();
		driver.findElement(By.xpath("//label[text()='To:']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'sumanthElfBatch')]/..//input")).click();
//		WebElement emailParent = driver.findElement(By.xpath("//ul[@id='as-selections-TO_IDcmp2']"));
//		emailParent.findElement(By.xpath("input[@value=\",\"]"))
//		.sendKeys(Keys.INSERT,"sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("(//button[@role='button']/span[text()='Done'])[2]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Subject')]/..//input[@placeholder]")).sendKeys("Varshini JM");
		WebElement mailBodyFrame = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(mailBodyFrame);
		driver.findElement(By.xpath("//body[@contenteditable=\"true\"]")).sendKeys("Hi");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		WebElement mailScreenshot = driver.findElement(By.xpath("//div[text()='Your mail has been sent']"));
		File source	=mailScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./errorShots/rediff.png");
		FileHandler.copy(source, destFile);
		
		explicitwait.until(ExpectedConditions.invisibilityOf(mailScreenshot));
		driver.navigate().refresh();
		driver.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
		driver.findElement(By.xpath("//span[@title='Varshini JM']/..//cite[@title='Select mail']")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		
		File deleteSource=driver.findElement(By.xpath("//div[text()='1 mail deleted successfully']")).getScreenshotAs(OutputType.FILE);
		File deleteDest=new File("./errorShots/rediffDelete.png");
		FileHandler.copy(deleteSource, deleteDest);
		
	}
}
