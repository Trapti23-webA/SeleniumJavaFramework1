package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {

	ExtentSparkReporter spark=null;
	ExtentReports extent=null;
	ExtentTest test1=null;
	WebDriver driver=null;


	@BeforeSuite
	public void setUp()
	{
		spark = new ExtentSparkReporter("extentHtml.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		test1 = extent.createTest("Google Search Test One","This is a test to validate google search functionality");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		test1.log(Status.INFO, "This step shows usage of log(status, details)");
		test1.info("This step shows usage of info(details)");
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void tearDownTest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();

		System.out.println("Test Completed Successfully");
	}

	@AfterSuite
	public void tearDown()
	{
		extent.flush();

	}

}
