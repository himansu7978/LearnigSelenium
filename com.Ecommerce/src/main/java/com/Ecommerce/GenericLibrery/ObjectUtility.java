package com.Ecommerce.GenericLibrery;

import com.Ecommerce.generic.WebdriverUtility.WebDriverUtility;
import com.Ecommerce.generic.excelfile.utility.FeatchTheDataFromExcelfile;
import com.Ecommerce.generic.javautility.JavaUtility;
import com.Ecommerce.generic.propertyfileutility.ReadPropertyfile;

public class ObjectUtility implements FrameWorkConstant {
	JavaUtility javaobj;
	WebDriverUtility webdriverobj;
	ReadPropertyfile propertiesobj;
	FeatchTheDataFromExcelfile excelobj;

	public void objectCreation() {

		javaobj = new JavaUtility();
		webdriverobj = new WebDriverUtility();
		propertiesobj = new ReadPropertyfile();
		excelobj = new FeatchTheDataFromExcelfile();
	}

}
