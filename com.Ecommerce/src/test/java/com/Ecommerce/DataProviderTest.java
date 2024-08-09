package com.Ecommerce;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.GenericLibrery.BaseClass;
import com.Ecommercecom.genericPageRepository.Repository;

public class DataProviderTest extends BaseClass {
	
	@Test(dataProvider ="Register")
	public void uderInvalidData(String name,String email,String Password) {
		Repository data= new Repository(driver);
		
		
		//Step 1 Identify the Name Testfield
		data.getName().clear();
		data.getName().sendKeys(name);
		//Step 1 Identify the Email Testfield
		data.getEmail().clear();
		data.getEmail().sendKeys(email);
		
		//Step 1 Identify the password Testfield
		data.getPassword().clear();
		data.getPassword().sendKeys(Password);
		
		System.out.println("name "+name);
		System.out.println("name "+email);
		System.out.println("name "+Password);
		
		Reporter.log("uderInvalidData",true);
		
	}
	
}
 