package com.Ecommerce.generic.listnerutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Ecommerce.GenericLibrery.BaseClass;

public class ListnersClass extends BaseClass  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("Test case Start",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("TestCase Exucute SucessFully",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String name	=result.getName();
		TakesScreenshot shot=(TakesScreenshot)driver;
		File sorce=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./src/test/resources/ScreenShotFile"+name+ ".png");
		
		try {
			FileHandler.copy(sorce, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
//		try {
//			Files.copy(sorce, dest);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		Reporter.log("ScreenShot Completed : "+name,true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("TestCase Skiped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log("Project Start ",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log("Project Finished",true);
	}
	

}
