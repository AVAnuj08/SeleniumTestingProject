package com.CommonUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileData {
	
	public static String getPropertyValue(String key) throws IOException {

		FileInputStream file = new FileInputStream("./TestData/commonData.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
	}
}