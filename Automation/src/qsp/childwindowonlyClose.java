package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS TO CLOSE ONLY CHILD BROWSER
public class childwindowonlyClose {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			if(!(wh.equals(pwh))){
				driver.close();
			}
		}

	}

}
