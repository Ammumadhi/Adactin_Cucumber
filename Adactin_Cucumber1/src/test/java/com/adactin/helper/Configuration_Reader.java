package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
 
	public static Properties p;
	
	
	public Configuration_Reader() throws Throwable {
	File f  = new File("C:\\Users\\AKannan\\eclipse-workspace\\Adactin_Cucumber1\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
	
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	
	p.load(fis);
	
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	private String URL() {
		String url = p.getProperty("Url");
        return url;
	}
}
