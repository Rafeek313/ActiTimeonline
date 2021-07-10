package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9483460652");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rafeek317322*");
		driver.findElement(By.xpath("(//span[.='Login'])[3]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone11");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='_1AtVbE col-12-12']"));
		int count = alllinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link = alllinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		driver.close();

	}

}
