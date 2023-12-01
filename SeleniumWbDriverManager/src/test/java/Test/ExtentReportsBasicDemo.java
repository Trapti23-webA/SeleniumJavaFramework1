package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	private static WebDriver driver=null;

	public static void main(String[] args) throws Exception {
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google Search Test One","This is a test to validate google search functionality");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		// log(Status, details)
        test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step By step");
		test1.pass("Entered text in SearchBox");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		test1.pass("Pressed keyboard enter key");
		
		
		Thread.sleep(5000);
		driver.close();
		
		test1.pass("Closed the browser");
		test1.info("Test Completed");
		
		// creates a toggle for the given test, adds all log events under it    
				ExtentTest test2 = extent.createTest("Google Search Test One","This is a test to validate google search functionality");
				
				driver=new ChromeDriver();
				
				// log(Status, details)
		        test2.log(Status.INFO, "Starting Test Case");
				
				driver.get("https://google.com");
				test2.pass("Navigated to google.com");
				driver.findElement(By.name("q")).sendKeys("Automation Step By step");
				test2.pass("Entered text in SearchBox");
				driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
				test2.fail("Pressed keyboard enter key");
				
				
				Thread.sleep(5000);
				driver.close();
				
				test1.pass("Closed the browser");
				test1.info("Test Completed");
		
		extent.flush();
		
	}

}
