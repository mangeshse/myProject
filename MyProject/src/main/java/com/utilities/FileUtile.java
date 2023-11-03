package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtile {
	public String readConfigPropertiesFiles(String filePath , String key) {
		String baseDir=System.getProperty("user.dir");
		FileInputStream file = null;
		try {
			file = new FileInputStream(baseDir+filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		String value="";
		try {
			prop.load(file);
			value=prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	

}
