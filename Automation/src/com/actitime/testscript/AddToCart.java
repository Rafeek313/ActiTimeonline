package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddToCart {
	@Test(dataProvider="getdataforAddTocart")
	public void testAddTocart(String CType,String MDL,String QTY) {
		Reporter.log("Catogory Type= "+CType+"\t"+"Model name="+MDL+"\t"+"Quantity= "+QTY,true);
	}
	@DataProvider
	public Object[] [] getdataforAddTocart() {
		Object[][] obj=new Object[3][3];
		obj[0][0]="mobile";
		obj[0][1]="oneplus nord 5g";
		obj[0][2]="3";
		
		
		obj[1][0]="smartwatch";
		obj[1][1]="AmazeFit 4.0";
		obj[1][2]="2";
		
		obj[2][0]="Laptop";
		obj[2][1]="lenevo ideapad S340";
		obj[2][2]="4";
		return obj;
	}

}
