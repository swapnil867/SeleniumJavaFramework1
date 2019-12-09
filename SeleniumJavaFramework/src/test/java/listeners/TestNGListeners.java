package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	 public void onTestStart(ITestResult result) {					
	        
		 System.out.println("********Test Started : "+result.getName());
	    }		

	 public void onTestSuccess(ITestResult result) {					
	    	System.out.println("********Test is Sucessful : "+result.getName());
		}
	 
	 public void onTestFailure(ITestResult result) {					
	       System.out.println("********Test failed : "+result.getName());				
	        		
	    }
	 
	 public void onTestSkipped(ITestResult result) {					
		 System.out.println("********Test Skipped : " +result.getName());
	        		
	    }	
	 
	 public void onFinish(ITestContext result) {					
		 System.out.println("********Test Finished : "+ result.getName());				
        		
    }		

    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    		

    	

   
} 