package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.xpath("(//div[.='Washington'])[2]"));
		WebElement target = driver.findElement(By.id("box103"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		WebElement source1 = driver.findElement(By.xpath("(//div[.='Madrid'])[2]"));
		WebElement target1 = driver.findElement(By.id("box107"));
		a.dragAndDrop(source1, target1).perform();
	}

}
