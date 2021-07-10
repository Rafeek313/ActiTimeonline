package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("Enter the URL");
		Scanner sc=new Scanner(System.in);
		String url = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		int count = Alllinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement links = Alllinks.get(i);
			String text = links.getText();
			System.out.println(text);
		}
		driver.close();
		
	}

}
