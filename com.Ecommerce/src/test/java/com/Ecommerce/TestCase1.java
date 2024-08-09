package com.Ecommerce;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.GenericLibrery.BaseClass;

public class TestCase1 extends BaseClass {
	@Test(enabled = false)
	public void test1() {
		String titel = driver.getTitle();
		System.out.println(titel);

		Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Users/new/Downloads/webpage.html");
		Assert.assertEquals(driver.getTitle(), "LEarning WEB TECHNOLOGY FORMS");

		// Clear The TextField
		driver.findElement(By.id("name")).clear();

		// Enter value into the name TextField
		driver.findElement(By.name("name")).sendKeys("RadhaSwami");

		// Enter value into the Email TextFiled
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("himansu123@gmail.com");

		// Enter value into the password TextFiled
		driver.findElement(By.xpath("//input[@placeholder='Enter your Password']")).sendKeys("Himansu@123");

		// Enter Your Mobile Number Into The TExtField
		driver.findElement(By.name("mobile")).sendKeys("7978593335");

		// set DOB and Time into the Field
		driver.findElement(By.xpath("//input[@type='datetime-local']")).sendKeys("100520001535");

		// Click All the RadioButton
		List<WebElement> radioButton = driver.findElements(
				By.xpath("//label[text()='Gender:']/parent::td/following-sibling::td/input[@name='gender']"));
		for (WebElement radio : radioButton) {
			radio.click();
		}

		// Click Kerala CheckBox
		WebElement ele = driver.findElement(By.id("Kerala"));
		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("arguments[0].disabled = false;", ele);

		ele.click();

		// Given DropDown Select Indian As Your Country
		WebElement countryDropdown = driver.findElement(By.name("country1"));
		Select sc = new Select(countryDropdown);
		sc.selectByVisibleText("INDIA");

		// Print All DropDown Option And Select second And Four Country of the DropDown
		WebElement dw = driver.findElement(By.name("country2"));
		Select counrty = new Select(dw);
		List<WebElement> option = counrty.getOptions();
		for (WebElement data : option) {
			System.out.println(data.getText());
		}
		counrty.selectByIndex(2);
		counrty.selectByVisibleText("CANADA");

		// Enter your feedback into the feedback TextField
		driver.findElement(By.id("feedback")).sendKeys("Working with Selenium is So Easy");

		// Upload File
		WebElement filepath = driver.findElement(By.xpath("//input[@type='file']"));
		File file = new File("C:\\\\Users\\\\new\\\\Downloads"); // Replace with your file path
		String filePath = file.getAbsolutePath();
		filepath.sendKeys(filePath);

		// Click On SubMit Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Click On Contact Us Option
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();

	}

}
