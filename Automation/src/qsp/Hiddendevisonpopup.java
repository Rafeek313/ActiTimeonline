package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hiddendevisonpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Select s =new Select(month);
		s.selectByIndex(0);
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s1 =new Select(year);
		s1.selectByValue("1996");
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[19]")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9483460652");
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
