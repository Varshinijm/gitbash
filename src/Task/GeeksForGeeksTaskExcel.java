package Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeeksForGeeksTaskExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Steps to read data form Excel
		File file=new File("./resources/GFGTestCase1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		String username = workbook.getSheet("Sheet3").getRow(7).getCell(5).getStringCellValue();
		String password = workbook.getSheet("Sheet3").getRow(8).getCell(5).getStringCellValue();
		
		// Expected Data
		String welcomePageTitle = "GeeksforGeeks | A computer science portal for geeks";
		String homePageTitle = "GeeksforGeeks | A computer science portal for geeks";
		
		//Test Step1: Open Browser and enter the URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.geeksforgeeks.org/");
		if(driver.getTitle().equals(welcomePageTitle))
		{
			System.out.println("Welcome page is displayed");
		}
		else
		{
			System.out.println("Welcome page is not displayed");
		}
		
		//Test Step2: Click on Sign in button
		driver.findElement(By.linkText("Sign In")).click();
		WebElement signInPopup = driver.findElement(By.xpath("//label[text()='Sign In']"));
		wait.until(ExpectedConditions.visibilityOf(signInPopup));
		if(signInPopup.isDisplayed())
		{
			System.out.println("Sign in pop is displayed");
		}
		else
		{
			System.out.println("Sign in pop is not displayed");
		}
		
		//Test Step3: Enter given data in Username or email text field
		WebElement usernameTextField = driver.findElement(By.id("luser"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String usernameTextEntered = usernameTextField.getAttribute("value");
		if(usernameTextEntered.equals(username))
		{
			System.out.println("Email was entered successfully");
		}
		else
		{
			System.out.println("Email was not entered successfully");
		}
		
		//Test Step4: Enter given data in passowrd text field
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		if(passwordTextField.getAttribute("value").equals(password))
		{
			System.out.println("Password was entered successfully");
		}
		else
		{
			System.out.println("Password was not entered successfully");
		}
		
		//Test Step5: Click on SignUp button
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		if(driver.getTitle().equals(homePageTitle))
		{
			System.out.println("Home page is displayed");
		}
		else
		{
			System.out.println("Home page is not displayed");
		}
		
	}
}
