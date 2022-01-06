package DistributionExecution_2;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImp implements ITestListener {
	 @Override		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {
	    	LocalDateTime ldt=LocalDateTime.now();
	    	String Date=ldt.toString().replace(":","");
	    	
	    	Reporter.log("the test script got failed and captured the screenshot successfully",true);
	    	TakesScreenshot ts=(TakesScreenshot) LoanAcc_003.driver;
	    	File tempfile=ts.getScreenshotAs(OutputType.FILE);
	    	File destFile=new File("./errorshots/"+arg0.getMethod().getMethodName()+Date+".png");
	    	tempfile.renameTo(destFile);
	    	
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
			
	

}

