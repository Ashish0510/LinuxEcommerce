package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ToFetchPropertyFile {
	Properties prop=new Properties();
	@Test
	
	public void propertyFile() throws IOException {
		File file=new File("/home/ashish/eclipse-workspace/com.ecommerce1Project/configuration/PopertyFile.properties");
		FileInputStream fis =new FileInputStream(file);
		
		
		prop.load(fis);
		
		
	}
		
		public String TogetBrowser() {
			String bro=prop.getProperty("Browser");
			return bro;
		}
		
		public String TogetUrl() {
			String Url=prop.getProperty("url");
			return Url;
		}
		
		
	

}
