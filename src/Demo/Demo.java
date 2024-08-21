package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void demo1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/"
				+ "tutorials/selenium-tutorial/selenium-interview-questions-and-answers");
	}
}
