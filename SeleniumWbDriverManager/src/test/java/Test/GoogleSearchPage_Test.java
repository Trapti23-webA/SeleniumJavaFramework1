package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPage_Test {
 static WebDriver driver=null;

	public static void main(String[] args) throws Exception {

		googleSearch();
	}
	public static void googleSearch() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		//goto google.com
		driver.get("https://google.com");
		//Enter text in search box
		//driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		
		GoogleSearchPage.textBox_search(driver).sendKeys("Automation Step By Step");
		// Click on the search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//close browser
		Thread.sleep(5000);
		driver.close();

		System.out.println("Test Completed Successfully");


	}

}
