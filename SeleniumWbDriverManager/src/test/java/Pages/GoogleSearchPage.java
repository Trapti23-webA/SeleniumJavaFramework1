package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {



	private static WebElement element=null;

	public static WebElement textBox_search(WebDriver driver)
	{
		element =driver.findElement(By.name("q"));
		return element;
	}
	public static WebElement button_search(WebDriver driver)
	{
		//element =driver.findElement(By.name("btnK"));
		element=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]"));
		//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]
		return element;	
	}

}
