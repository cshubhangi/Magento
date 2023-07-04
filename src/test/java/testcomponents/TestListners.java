
package testcomponents;										
import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import resources.ExtentreporterNg;
import yogamagento.pageobject.homepage;


 public  class TestListners extends BaseTest1 implements ITestListener  {
	 
	  ExtentTest test;
	  ExtentReports extent = ExtentreporterNg.getreportObject();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		 ExtentTest test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	
	test.log(Status.PASS, "TestPass");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		//test.getAttribute();
		test.log(Status.FAIL, "Testfail");
		test.fail(result.getThrowable());
		
		
		//driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		/*try {
		driver = (WebDriver) result.getTestClass().getRealClass().getField("driver")
		.get (result.getInstance());
		}
		catch(Exception e1){
			
			e1.printStackTrace();
		}*/
		
		String filepath = null;
		try {
			filepath = getScreenshot(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		extent.flush();
	}
}

 

		







