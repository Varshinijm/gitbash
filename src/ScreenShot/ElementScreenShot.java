package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.olaelectric.com/");
		
		File source = driver.findElement(By.xpath("//a[@aria-label='store logo']")).getScreenshotAs(OutputType.FILE);
		//System.out.println(source);
		File destfile=new File("./errorShots/ola.png");
		FileHandler.copy(source, destfile);
	}
}
