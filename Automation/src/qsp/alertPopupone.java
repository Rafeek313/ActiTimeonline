package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//was to print the text in the alert popup present in the seleniumeasy.com
public class alertPopupone {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("(//button[.='Click me!'])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		a.accept();
		System.out.println(text);
		driver.close();
	}

}
