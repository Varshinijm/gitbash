package Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeeksForGeeksTaskExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./resources/GFGTestCase.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		String string = workbook.getSheet("Sheet3").getRow(5).getCell(5).getStringCellValue();
		System.out.println(string);
		
		String[] str = string.split("\n");
		String username = str[0];
		String password = str[1];
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.geeksforgeeks.org/");
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.id("luser")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}
}
