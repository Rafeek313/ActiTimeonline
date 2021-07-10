package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/FileUpload.html");
		driver.findElement(By.id("CV")).sendKeys("C:\\Users\\eppys\\Documents\\rafiq resume.pdf");
		Thread.sleep(2000);
  driver.close();
	}

}
