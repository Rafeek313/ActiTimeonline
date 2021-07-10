package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS TO CHECK THE ALLIGNMENT OF GENDER RADIO BUTTON IN FACEBOOK.COM(after clicking create new account)?
public class Allignmentfacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(2000);
		int FemaleRB = driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).getLocation().getY();
		int MaleRB = driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).getLocation().getY();
		int CustomRB = driver.findElement(By.xpath("//input[@type='radio' and @value='-1']")).getLocation().getY();
		if(FemaleRB==MaleRB){
			System.out.println("Allignment of radio button same ");

		}
		else if(MaleRB==CustomRB)
		{
			System.out.println("allignment of radio button is same ");
		}
		else
		{
			System.out.println("allignment of radio button is same ");
		}
		System.out.println(FemaleRB+" "+MaleRB+" "+CustomRB);
		driver.close();
	}

}
