package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS TO PRINT ADDRESS OF ALL THE BROWSER OPENED BY NAUKRI.COM
public class childWindowbrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			System.out.println(wh);
		}
  driver.quit();
	}

}
