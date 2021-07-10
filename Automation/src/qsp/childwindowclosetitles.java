package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS TO CLOSE ALL THE CHILDBROWSER EXCEPT PARENT BROWSER BY USING TITLES IN NAUKRI.COM
public class childwindowclosetitles {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.naukri.com/");
		String ExceptedTitle = driver.getTitle();
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String ActualTitle = driver.getTitle();
			if(!(ExceptedTitle.equals(ActualTitle))) {
				driver.close();
				
			}
		}

	}

}
