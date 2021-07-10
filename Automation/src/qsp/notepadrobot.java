package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class notepadrobot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("notepad");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		
	}

}
