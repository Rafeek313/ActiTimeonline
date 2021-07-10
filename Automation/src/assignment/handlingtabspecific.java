package assignment;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class handlingtabspecific {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("enter the tab which u want to close");
		Scanner sc=new Scanner(System.in);
		String Expectedtab = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltabs = driver.getWindowHandles();
		for(String tab:alltabs) {
			driver.switchTo().window(tab);
			String actualtab = driver.getTitle();
			if(Expectedtab.equals(actualtab))	{
				driver.close();
			}
		}

	}
}
