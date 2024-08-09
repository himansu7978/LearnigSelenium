package com.Ecommerce.MensProudct;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MensShoes {
	@Test
	public void shose() {
		Reporter.log("Mens Shoes Class Exucted");
	}
	@Test(groups = "smoke")
	public void addTocart() {
		Reporter.log("Proudct Added SusessFully");
	}
	@Test
	public void updateProduct() {
		Reporter.log("Proudct Upadate Sucessfully");
	}
	

}
