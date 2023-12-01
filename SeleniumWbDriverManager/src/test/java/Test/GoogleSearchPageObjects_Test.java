package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageObjects_Test {
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	public static void googleSearchTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		//goto google.com
		driver.get("https://google.com");
		GoogleSearchPageObjects searchObj=new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		searchObj.setTextInSearchBox("A B C D");
		searchObj.clickSearchButton();
		
	
	}
}
