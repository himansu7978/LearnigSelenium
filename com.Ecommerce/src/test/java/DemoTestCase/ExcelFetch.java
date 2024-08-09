package DemoTestCase;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelFetch {
	@Test
	public void m1() throws Throwable 
	{
		FileInputStream fis= new FileInputStream("D:\\ExcelFileSelenium.xlsx");
		
		
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh= book.getSheet("Sheet1");
		String data	=sh.getRow(1).getCell(2).getStringCellValue();
		int lastrow=sh.getLastRowNum();
		int lastCol=sh.getRow(1).getLastCellNum();
		
		//System.out.println(data);
		System.out.println(lastCol);
		System.out.println(lastrow);
		
	
		
		//String data=book.getSheet("StudentDetails").getRow(2).getCell(2).getStringCellValue();
		System.out.println(data);
	}
	
	

}
