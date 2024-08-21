package browserActions;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageTitleUrlOfPageInFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("./task/TitleUrl.txt");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		String title=driver.getTitle()+"\n";
		String url = driver.getCurrentUrl();
		fos.write(title.getBytes());
		fos.write(url.getBytes());
	}
}
