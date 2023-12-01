package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver=null;
	By textBox_search=By.id("APjFqb");
	By button_search=By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]");

	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setTextInSearchBox(String text)
	{
		driver.findElement(textBox_search).sendKeys(text);
	}
	public void clickSearchButton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);;
	}

}
