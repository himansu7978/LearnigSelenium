package com.Ecommerce.GenericLibrery;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.Ecommerce.generic.propertyfileutility.ReadPropertyfile;

public class BaseClass extends ObjectUtility {
	public static WebDriver driver = null;

	// Data Provider Exucation
	@DataProvider(name = "Register")
	public Object[][] registerData() {
		Object[][] data = new Object[3][3];

		data[0][0] = "Himansu";
		data[0][1] = "himansu@1234";
		data[0][2] = "Tester";

		data[1][0] = "Vinay";
		data[1][1] = "vinay@Gmail.com";
		data[1][2] = "Devloper@1234";

		data[2][0] = "Satish";
		data[2][1] = "Satist@gmail.com";
		data[2][2] = "Devops@1234";

		return data;
	}

	@BeforeSuite
	public void serverConection() {
		Reporter.log("Server Conncton Done ", true);
	}

	@AfterSuite
	public void closeServer() {
		Reporter.log("Server Conncton Closed ", true);
	}

	@BeforeTest
	public void dataBase() {
		Reporter.log("DataBase Conncton Done ", true);
	}

	@AfterSuite
	public void closeDataBase() {
		Reporter.log("DataBase Conncton Closed ");
	}

	// Connecting parameter
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) {

		//driver = new ChromeDriver();

//		System.out.println("Enter Your BrowserName");
//		Scanner sc = new Scanner(System.in);
//		String browser1 = sc.next();

		// If user Give Browser name Chrome
		if (browser.contains("chrome")) {
			// Step1 lunch The Chrome Driver
			driver = new ChromeDriver();

			// If user Give Browser name Edge
		} else if (browser.contains("edge")) {
			// Lunch The Edge Driver
			driver = new EdgeDriver();

			// If user Give Browser name FireFox
		} else if (browser.contains("firefox")) {
			// Lunch FireFox Driver
			driver = new FirefoxDriver();

			// If user Give Browser name SaFari
		} else if (browser.contains("safari")) {
			// Lunch Safari Driver
			driver = new SafariDriver();

			// If user Not Give Any Browser/Wrong Browser name It will Execute Default
			// Browser
		} else {
			System.out.println("Your Driver Is wrong It Will execute Default Browser");
			driver = new ChromeDriver();
		}

		// Create object For all
		objectCreation();

		String url = propertiesobj.readData("url");
		// Navigate To the Application Using Url
		driver.get(url);
//	String url1	=driver.getCurrentUrl();
//	System.out.println(url1);

		Reporter.log("Browser Opening  Done ");
	}

	@AfterClass
	public void closeBrowser() {
		// Close Browser
		driver.quit();
		Reporter.log(" Browser Closed  ");
	}

	@BeforeMethod
	public void login() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		Reporter.log("Login Done ", true);
	}

	@AfterMethod
	public void logout() {
		

		Reporter.log("Logout Done  ", true);
	}

}
