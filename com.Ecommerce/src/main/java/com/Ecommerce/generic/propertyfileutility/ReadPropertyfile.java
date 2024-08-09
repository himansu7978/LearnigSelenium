package com.Ecommerce.generic.propertyfileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.Ecommerce.GenericLibrery.FrameWorkConstant;

public class ReadPropertyfile implements FrameWorkConstant {
	FileInputStream fis;
	FileOutputStream fos;
	Properties pobj;

	public String readData(String key) {
		try {
			// Covert The File Into Browser Understandable language
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		pobj = new Properties();
		try {
			pobj.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		String data = pobj.getProperty(key);
		return data;

	}

	public void writeData(String key, String value) {
		// Enter The Data
		pobj.put(key, value);
		// Create instance For outputStream
		try {
			fos = new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		try {
			pobj.store(fos, "Data Updatate Sucessfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void display(String key) {
		try {
			fis = new FileInputStream(propertypath);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		// Convert into Object

		pobj = new Properties();
		try {
			pobj.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		String data = pobj.getProperty(key);

		// Print it Console
		System.out.println(data);

	}

}
