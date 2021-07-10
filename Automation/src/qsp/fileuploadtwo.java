package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadtwo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/FileUpload.html");
		File f=new File("./data/rafiq resume.pdf");
		String absolutepath = f.getAbsolutePath();
		driver.findElement(By.id("CV")).sendKeys(absolutepath);
		Thread.sleep(2000);
		driver.close();
	}

}
