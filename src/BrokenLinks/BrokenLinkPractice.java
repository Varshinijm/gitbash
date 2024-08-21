package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkPractice {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement ele:allLinks)
		{
			String href=ele.getAttribute("href");
			verify(href);
		}
	}
	public static void verify(String url) 
	{
		try {
		URL link=new URL(url);
		HttpURLConnection httpConnection=(HttpURLConnection) link.openConnection();
		httpConnection.setConnectTimeout(3000);
		httpConnection.connect();
		
		if(httpConnection.getResponseCode()==200)
		{
			System.out.println(httpConnection.getResponseMessage());
		}
		else
		{
			System.out.println(link+"-"+httpConnection.getResponseMessage()+" is a Broken link");
		}
		}
		catch(Exception e)
		{
			System.out.println(url +" is a Broken link");
		}
	}
}
