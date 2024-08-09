package com.Ecommerce.generic.excelfile.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Ecommerce.GenericLibrery.FrameWorkConstant;

public class FeatchTheDataFromExcelfile implements FrameWorkConstant {

	FileInputStream fis;
	FileOutputStream fos;
	Workbook book;
	DataFormatter df;

	public String readDataFromExcel(String Sheet, int row, int column) {
		try {
			// Convert The Data Into Object
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create WorkBook
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		// Using WorkBook go to the Sheet,row,column and cell fetch the data

		String data = df.formatCellValue(book.getSheet(Sheet).getRow(row).getCell(column));
		System.out.println(data);
		return data;
		

	}

	public void writeDataFromExcel(String sheet, int row, int column, String data) {
		try {
			// Convert The Data Into Object
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create WorkBook
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		// Create a new column and write data
		book.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);

		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// Write the data
		try {
			book.write(fos);
		} catch (IOException e) {

			e.printStackTrace();
		}

		// Close the Workbook
		try {
			book.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void displayDataFromExcelFile(String sheet, int row, int column) {

		try {
			// Fetch the File Path
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Convert The File Into Object
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		//
		String data = df.formatCellValue(book.getSheet(sheet).getRow(row).getCell(column));

		// Print The Data in Console
		System.out.println(data);
	}

	public void multiDataFetchExcel() {

		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		df = new DataFormatter();

		Sheet sh = book.getSheet("StudentsDetails");

		for (int i = 0; i < sh.getLastRowNum(); i++) {

			int lastcell = sh.getRow(i).getLastCellNum();

			for (int j = 0; j < lastcell; j++) {
				String data = df.formatCellValue(sh.getRow(i).getCell(j));
				System.out.print(data + " ");

			}
			System.out.println();

		}

	}

}
