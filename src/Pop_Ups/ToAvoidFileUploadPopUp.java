package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//for fileupload and file download popup we have to locate the element using input tag other wise the sendkeys will not work on that perticular element
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.xpath("//input[@tabindex]")).sendKeys("E:\\Fake_News_Detector\\2nd sem\\cloud computing\\Chapter 1.pdf");
	}
}
