package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//was to close only parent browser in naukri.com
public class childcloseparent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.vtiger.com/customers/hackerearth-case-study/");
		String t = driver.getTitle();
		System.out.println(t);
		driver.close();

	}

}
