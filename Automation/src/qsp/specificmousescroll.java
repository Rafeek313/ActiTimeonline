package qsp;

import java.awt.AWTException;
//WAS TO SCROLL SPECIFIC ELEMENT IN BBC.COM
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificmousescroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		WebElement target = driver.findElement(By.xpath("(//a[contains(text(),' Israel strikes in Gaza after fire balloons launched ')])[1]"));
		int yaxis = target.getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		//j.executeScript("window.scrollBy(0,executeScript(\"argument[0].Scrollintoview(true);\")");
		j.executeScript("window.scrollBy(0,"+yaxis+")");
		System.out.println(yaxis);


	}

}
