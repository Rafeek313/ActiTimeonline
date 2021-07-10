package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pom.Loginpage;

public class MainmethodCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
@Test
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Loginpage lp=new Loginpage();
		PageFactory.initElements(driver, lp);
         lp.setuser("admin1","manager1");
         driver.navigate().refresh();
         lp.setuser("admin", "manager");
	}

}
