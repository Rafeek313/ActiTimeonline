package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a program to navigate to search wipro jobs and capture all the url’s available in search page and print it on the console.
public class wiprojobs { 
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		List<WebElement> Allurl = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']/.."));
			int count = Allurl.size();
			System.out.println(count);
			for (WebElement url : Allurl) 
			{
				String text = url.getAttribute("href");
				System.out.println(text);
			}
		
		driver.close();


	}

}
