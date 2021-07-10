package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest {
	@Test
	public void demoA()
	{
		Reporter.log("hi",true);
		System.out.println("demoA");
	}
	@Test
	public void demoB()
	{
		Reporter.log("bye",false);
		System.out.println("demoB");
	}
	@Test
	public void demoC() {
		Reporter.log("hey",true);
		System.out.println("demoC");
	}
}
