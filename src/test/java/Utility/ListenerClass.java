package Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import AllTestCases.BaseClassTest;

public class ListenerClass extends BaseClassTest implements ITestListener {

    		
    public void onStart(ITestContext result) {					
        // TODO Auto-generated method stub				
        		
    }		
    
    		
    public void onTestStart(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }	
    
    		
    public void onTestSuccess(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }	

    
    		
    public void onTestFailure(ITestResult result) {					
        // TODO Auto-generated method stub	
    	
		
		try {
			ScreenShot sc=new ScreenShot();
			sc.ScreenShotProvider(driver);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        		
    }		
    
    		
    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    		
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    }		

    
    		
    public void onFinish(ITestContext result) {					
        // TODO Auto-generated method stub				
        		
    }		


}
