package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws Exception{

		googleSearch();
	}
	public static void googleSearch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//goto google.com
		driver.get("https://google.com");
		//Enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		// Click on the search button
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//close browser
		Thread.sleep(5000);
		driver.close();

		System.out.println("Test Completed Successfully");


	}

}
