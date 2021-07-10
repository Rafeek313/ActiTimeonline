package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

@Listeners(com.actitime.generics.ListenerImplimentation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void CreateCustomer() {
		Reporter.log("createcustomer",true);
		Assert.fail();
	}
	}

