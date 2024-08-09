package com.Ecommerce.generic.WebdriverUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void iMplicitWaitStatement(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void explicitWait(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void switchToAlertCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();

	}

	public void switchToAlertClickOK(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

	public void switchToAlertSendKeys(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public void mouseActionRightClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}

	public void mouseActionMoveTOElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		;
	}

	public void mouseActionDoubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void mouseActionDragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}

	public void selectDropDown(WebElement element, int index) {
		Select sc = new Select(element);
		sc.selectByIndex(index);

	}

	public void selectDropDown(WebElement element, String visibleText) {
		Select sc1 = new Select(element);
		sc1.selectByVisibleText(visibleText);
	}

	public void selectDropDown_value(WebElement element, String value) {
		Select sc2 = new Select(element);
		sc2.selectByValue(value);
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToframe(WebDriver driver, String namaID) {
		driver.switchTo().frame(namaID);

	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
}
