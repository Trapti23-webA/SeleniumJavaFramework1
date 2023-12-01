package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo2 {

	static WebDriver driver=null;

	@BeforeTest
	public void setUpTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public static void googleSearch2() 
	{


		//goto google.com
		driver.get("https://google.com");
		//Enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		// Click on the search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);




	}
	@Test
	public static void googleSearch3() 
	{


		//goto google.com
		driver.get("https://google.com");
		//Enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		// Click on the search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);




	}
	

	
	@AfterTest
	public void tearDownTest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();

		System.out.println("Test Completed Successfully");
	}

}
