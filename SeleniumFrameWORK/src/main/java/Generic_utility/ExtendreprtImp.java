package Generic_utility;

import java.util.Date; 
 
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendreprtImp implements ITestListener {
	
	ExtentTest test;
	ExtentReports report;
	
	public void onStart(ITestContext context)
	{
		String time=new Date().toString().replace(",","_").replace(":","_");
		Java_Utility jilib = new Java_Utility();
		int ranNum = jilib.getRandomNum();
		
		ExtentSparkReporter spark= new ExtentSparkReporter("ExtentReports/Reports.html"+time);
		spark.config().setDocumentTitle("V tiger Reporte");
		spark.config().setReportName("AFRID");
		spark.config().setTheme(Theme.STANDARD);
		
		//System Configuration
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Platform", "Windows11");
		report.setSystemInfo("Executed by", "Afrid");
		report.setSystemInfo("Reviewed by", "BABA");
	}
	public void onTestStart(ITestResult result)
	@Test
	{
		
	test = report.createTest(result.getName()); 

	}
	public void OnTestSucess(ITestResult result)
	{
		test.log(Status.PASS);
		result.getMethod().getMethodName();
		test.log(Status.PASS,result.getThrowable());
		System.out.println("----->> TEST PASS<<-----");
	}
public void onTestFailure(ITestResult result)
{
	test.log(Status.FAIL,result.getMethod().getMethodName());
	test.log(Status.FAIL,result.getThrowable());
	System.out.println("---->>TEST FAIL<<----");
	
	String screenShot =null;
	try {
		String WebDriver_utility;
		screenShot=WebDriver_utility.takesScreenShot(BaseClass.sdriver,result.getMethod().getMethodName());
	}
	catch(Throwable e) {
		e.printStackTrace();
		
	}
	test.addScreenCaptureFromPath(screenShot);
}
public void onTestSkipped(ITestResult result)
{
	test.log(Status.SKIP,result.getMethod().getMethodName());
	test.log(Status.SKIP,result.getThrowable());
	System.out.println("---->>TEST SKIP<<---");
}
public void onFinsh(ITestContext context)
{
	report.flush();
	
}
}

	

