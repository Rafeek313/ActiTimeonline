package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childswithoutpecific {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("enter the tile which u didnot close");
		Scanner sc=new Scanner(System.in);
		String ExpectedTitle = sc.nextLine();
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String ActualTitle = driver.getTitle();
			if(!(ExpectedTitle.equals(ActualTitle))) {
				driver.close();
			}
		}

	}

}
