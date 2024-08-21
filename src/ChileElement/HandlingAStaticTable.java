package ChileElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAStaticTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		WebElement fulltable = driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold Rates')]/../..//table"));
		List<WebElement> noOfRows = fulltable.findElements(By.xpath("tbody/tr"));
		//System.out.println(noOfRows.size());
		
		for(WebElement row:noOfRows)
		{
			System.out.print(row.findElement(By.xpath("td")).getText()+"-");
			System.out.println(row.findElement(By.xpath("td/div/div[1]")).getText());
		}
		
		for(int i=1;i<=noOfRows.size();i++)
		{
			System.out.print(driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr["+i+"]/td[1]")).getText()+"-");
			System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr["+i+"]/td[2]/div/div[1]")).getText());
		}
		
	}
}
