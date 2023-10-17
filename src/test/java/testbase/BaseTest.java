package testbase;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.Application;
import reports.ExtentManager;

public class BaseTest {
	
	public String actualvalue;
	public String expectedvalue;
	public ExtentReports rep;
	public ExtentTest test;
	public Application app;
	public WebDriver driver;
	
	@BeforeTest(alwaysRun =true)
	public void ReportStart(ITestContext context) {
		app = new Application();
    	rep =ExtentManager.getReports();
    	test =rep.createTest(context.getCurrentXmlTest().getName());
    	System.out.println(context.getCurrentXmlTest().getName());
    	context.setAttribute("app", app);
    	context.setAttribute("report", rep);
    	context.setAttribute("test", test);
    	//context.setAttribute("driver", driver);
    	test.log(Status.INFO,"Starting Test"+context.getCurrentXmlTest().getName());
    	app.setReport(test);
	}
	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception
	{ 
		app.openBrowser();
		app.waiting();
		app.DealerLoginPage();
		app.CustomerSelectionPage();
		app.AirFxPage();
		app.navigateToUploadAndDownload();
         
    	}
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(ITestContext context) {
		app =(Application)context.getAttribute("app");
		rep =(ExtentReports)context.getAttribute("rep");
		test =(ExtentTest)context.getAttribute("test");
	}
	@AfterTest
	public void quit(ITestContext context) {
		app = (Application)context.getAttribute("app");
		if(app!=null)
			app.quit();
		
		rep = (ExtentReports)context.getAttribute("report");
	}
	@AfterSuite
	public void quitreport(ITestContext context) {
		if(rep !=null)
			rep.flush();
	}
}
