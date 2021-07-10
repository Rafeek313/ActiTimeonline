package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadresumae {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.id("usernameField")).sendKeys("eppyshan@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Rafeek317322*");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
		File f=new File("./data/RafeekT RESUME (1) (1).pdf");
		String absolutepath = f.getAbsolutePath();
		System.out.println(absolutepath);
		Thread.sleep(5000);
		driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
        driver.close();
	}

}
