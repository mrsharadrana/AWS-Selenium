package com.automation.aws.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigFileReader {

	@Test
	public void ReadConfigProperty() throws IOException {
		
		//Read value from property file
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("F:/Eclipse Workspace/AWS-Selenium/com.automation.aws.testing/config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("implicitWait"));
		System.out.println(prop.getProperty("baseUrl"));
	}
	



}
