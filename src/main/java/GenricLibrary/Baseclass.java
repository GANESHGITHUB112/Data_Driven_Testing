package GenricLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepository.WelcomePage;

public class Baseclass{
	
	
	public WebDriver driver;
	public static  ExtentReports report;
	public static  ExtentTest test;
//	public static ExtentTest test;
//	public static ExtentReports extent;
//	public static ExtentSparkReporter spark;
	@BeforeSuite
	public void bs() {
		report=new ExtentReports("./Reports/TestReport.html",true);
//		spark = new ExtentSparkReporter("./TestReport.html");
//		 spark.config().setTheme(Theme.DARK);
//	        spark.config().setDocumentTitle("Test Report");
//	        spark.config().setReportName("Automation Test Results");
//
//	        extent = new ExtentReports();
//	        extent.attachReporter(spark);
		
		System.out.println("beforesuit");
		
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("beforetest");
		
	}
	
	@BeforeClass
	public void bc() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod 
	public void bm(Method method){
//		String methodname=method.getName();
//		test=reports.startTest(methodname);
//		WelcomePage welcomepage=new WelcomePage(d);
//		welcomepage.getLoginlink().click();
//		welcomepage.getEmailfield().sendKeys("ganeshvelmurugan112@gmail.com");
//		welcomepage.getPasswordfield().sendKeys("ganesh123");
//		welcomepage.getLoginbutton().click();
	   // test= extent.createTest("ExampleTest");
	//	test=extent.ProjectName("exampleTest");
		 String methodName = method.getName();
	        test = report.startTest(methodName);
	        System.out.println("beforemethod: " + methodName);
	}
	
	
	
	@AfterMethod 
	public void am(){
		report.endTest(test);
		System.out.println("aftermethod");
		report.flush();
		
	}
	
	@AfterClass 
	public void ac() {
		 if (driver != null) {
	            driver.quit();
	        }
	    
		System.out.println("afterclass");
		
	}
	
	@AfterTest
	public void at() {
		System.out.println("aftertest");
		
	}
	
	@AfterSuite 
	public void as(){
		if (report != null) {
            report.flush();
            report.close();
        }
		

		System.out.println("aftersuite");
	
	}
}
