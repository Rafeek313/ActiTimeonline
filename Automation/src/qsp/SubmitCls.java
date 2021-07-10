package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS CLICK ON SUBMIT BUTTON WITHOUT USING CLICK METHOD?
public class SubmitCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.id("user_login_btn")).submit();
	

	}
	

}
