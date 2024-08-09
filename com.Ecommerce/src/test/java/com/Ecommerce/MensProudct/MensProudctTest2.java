package com.Ecommerce.MensProudct;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MensProudctTest2 {
	@Test(dependsOnMethods = "addToCart", groups = "functionality")
	public void updateProuduct() {

		Reporter.log("Upadate Proudct Sucessfully", true);
	}

	@Test(priority = 1, groups = "smoke")
	public void addToCart() {

		Reporter.log("AddToCart Prouduct SucessFully", true);
	}

	@Test(invocationCount = 2, priority = 3, groups = "integration")
	public void deleteProduct() {

		Reporter.log("Delete Product Sucessfully", true);
	}
}
