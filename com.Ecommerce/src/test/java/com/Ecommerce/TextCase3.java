package com.Ecommerce;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.GenericLibrery.BaseClass;
import com.Ecommerce.generic.excelfile.utility.FeatchTheDataFromExcelfile;

@Listeners(com.Ecommerce.generic.listnerutility.ListnersClass.class)
public class TextCase3 extends BaseClass {
	@Test(enabled = true)
	public void readDataFromExcel() throws Throwable, Throwable {

		FeatchTheDataFromExcelfile featch = new FeatchTheDataFromExcelfile();

		featch.readDataFromExcel("StudentsDetails",11, 9);
		featch.multiDataFetchExcel();
		 featch.displayDataFromExcelFile("StudentsDetails", 2, 4);
		featch.writeDataFromExcel("StudentsDetails", 11, 9, "Alwasys keep Smile");
		
		Reporter.log("Text Case # Exucute",true);

	}

}
