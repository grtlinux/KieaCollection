package org.tain.test.t01.sample10;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesTestMain {

	public PropertiesTestMain() {
		String path = this.getClass().getResource("database.properties").getPath();
		System.out.println(">>> path: " + path);
	}
	
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiesTestMain.class.getResource("database.properties").getPath();
		System.out.println(">>> path: " + path);
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String message = properties.getProperty("message");
		
		System.out.println(">>> driver: " + driver);
		System.out.println(">>> url: " + url);
		System.out.println(">>> username: " + username);
		System.out.println(">>> password: " + password);
		System.out.println(">>> message: " + message);
		
		for (Entry<Object, Object> entry : properties.entrySet()) {
			String key = String.valueOf(entry.getKey());
			String val = String.valueOf(entry.getValue());
			System.out.printf(">>> %s = %s\n", key, val);
		}
		
		new PropertiesTestMain();
	}
}
