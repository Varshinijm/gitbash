package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCodeOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
	}
}
