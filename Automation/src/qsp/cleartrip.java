package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("BAN");
		Thread.sleep(2000);
		List<WebElement> Autosugg = driver.findElements(By.xpath("//p[@class='to-ellipsis o-hidden ws-nowrap c-inherit fs-3']"));
		int count = Autosugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = Autosugg.get(i).getText();
			System.out.println(text);

		}
		Autosugg.get(0).click();
		Thread.sleep(2000);
		driver.close();
	}

}
