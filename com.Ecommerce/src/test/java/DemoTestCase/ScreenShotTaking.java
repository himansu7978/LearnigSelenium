package DemoTestCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.google.common.io.Files;

public class ScreenShotTaking {
	@Test
	public void m1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./src/test/resources/ScreebShotFile.srcdata.png");
		
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("Hhdvcduczbcku"));
		
		
	}

}
