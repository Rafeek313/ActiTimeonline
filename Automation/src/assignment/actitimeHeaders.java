package assignment;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimeHeaders {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> it=alltabs.iterator();
		String parentwh = it.next();
		String childwh = it.next();
		driver.switchTo().window(childwh);
		List<WebElement> allheaders = driver.findElements(By.xpath("//h2"));
		int count = allheaders.size();
		System.out.println(count);
		for(WebElement header:allheaders) {
			String text = header.getText();
			System.out.println(text);
		}
		driver.switchTo().window(parentwh);
		driver.close();
		
		}
		

	}


