package browserActions;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageSourceCodeInFile {

	public static void main(String[] args) throws IOException {
			FileOutputStream fos=new FileOutputStream("./task/SourceCode.html");
			
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/");
			String sourceCode=driver.getPageSource();
			fos.write(sourceCode.getBytes());
	}
}
