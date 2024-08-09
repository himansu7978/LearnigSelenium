package com.Ecommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.GenericLibrery.BaseClass;
import com.Ecommerce.generic.excelfile.utility.FeatchTheDataFromExcelfile;
import com.Ecommercecom.genericPageRepository.Repository;

@Listeners(com.Ecommerce.generic.listnerutility.ListnersClass.class)
public class TextCase2 extends BaseClass {
	@Test(enabled = true)
	public void text() {
		//Assert.fail();
		Repository allElements = new Repository(driver);

		FeatchTheDataFromExcelfile excel = new FeatchTheDataFromExcelfile();

		allElements.getName().clear();
		allElements.getName().sendKeys(excel.readDataFromExcel("StudentsDetails", 2, 4));
		allElements.getEmail().sendKeys("hiamnsu33@gmail.com");
		allElements.getPassword().sendKeys("Himansu@123");
		allElements.getMobile().sendKeys("7978593335");
		allElements.getDob().sendKeys("100420000458");
		allElements.getFemlale().click();

		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("arguments[0].disabled = false;", allElements.getKerala());
		allElements.getKerala().click();

		Select sc = new Select(allElements.getCountry1());
		sc.selectByVisibleText("INDIA");

		Select sc2 = new Select(allElements.getCountry2());
		sc2.selectByIndex(2);
		sc2.selectByIndex(0);

	}

}
