package AllTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Utility.ToFetchPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {
	public static WebDriver driver; 
	public static Logger logger;
	
	@BeforeMethod(enabled=true)
	public void Preconditions() throws IOException {
		
		ToFetchPropertyFile fs=new ToFetchPropertyFile();
		fs.propertyFile();
		String Brow=fs.TogetBrowser();
		String urll=fs.TogetUrl();
		
		logger= LogManager.getLogger(BaseClassTest.class.getName());
		
		switch(Brow){
			case "chrome":
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(urll);
			break;
		}
		
		
		
	}
	
	@AfterMethod(enabled=true)
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}

}
