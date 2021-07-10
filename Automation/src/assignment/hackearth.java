package assignment;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hackearth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("enter the title which you want to check");
		Scanner sc=new Scanner(System.in);
		String Expectedtitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
	driver.manage().window().maximize();
		WebElement resource = driver.findElement(By.linkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[1]")).click();
		WebElement agree = driver.findElement(By.linkText("Agree"));
		a.doubleClick(agree).perform();
		WebElement readfullstory = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(readfullstory).perform();
		String currenttitle = driver.getTitle();
		if(Expectedtitle.equals(currenttitle)) {
			System.out.println("hackerearth page displayed");
		}
		else {
			System.out.println("hackerearth page not displayed");
		}
		driver.close();
	}

}
