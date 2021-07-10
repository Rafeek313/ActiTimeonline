package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testdemo {
	@Test(priority=1)
	public void CreateCustomer() {
		Reporter.log("createcustomer",true);
	
	}
	@Test(dependsOnMethods="CreateCustomer")
	public void ModifyCustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test(dependsOnMethods="CreateCustomer")
	public void DeleteCustomer() {
		Reporter.log("deletecustomer",true);
	}

}
