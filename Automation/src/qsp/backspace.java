package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class backspace {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/eppys/Desktop/file2.html");
		WebElement a1 = driver.findElement(By.xpath("//input[@type=\"text\" and @value=\"Qspider\"]"));
        String textvalue = a1.getAttribute("value");
        System.out.println(textvalue);
        int count = textvalue.length();
        for(int i=0;i<count;i++) {
        	a1.sendKeys(Keys.BACK_SPACE);
        	Thread.sleep(1000);
        	
        }
        driver.close();
	}

}
