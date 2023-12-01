import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 /*WebDriverManager.firefoxdriver().setup();
		 WebDriver driver=new FirefoxDriver();*/
         driver.get("https://google.com");
         
         //driver.findElement(By.id("APjFqb")).sendKeys("xyx");
         WebElement textbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
         textbox.sendKeys("automation step by step");
         
         List<WebElement> listofInputElemensts=driver.findElements(By.xpath("//input"));
         int count =listofInputElemensts.size();
         System.out.println("Count of Input Elements :" +count);
         Thread.sleep(4000);
         driver.close();
         driver.quit();
}

}
