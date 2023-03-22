package Utility;

import java.io.IOException;


import org.testng.annotations.DataProvider;

public class Alldataprovider {
	ToFetchExceleFile fef=new ToFetchExceleFile();

	@DataProvider(name="signupDetails")
	public String[][] signupDetailsprovider() throws IOException {
		
		return fef.excelFile("/home/ashish/eclipse-workspace/com.ecommerce1Project/configuration/Excelfile.xlsx");
	}
	
	@DataProvider(name="loginDetails")
	public String[][] LoginDetailsprovider() throws  IOException {
		return fef.excelFile("/home/ashish/eclipse-workspace/com.ecommerce1Project/configuration/LoginExcel.xlsx");
	}
}
