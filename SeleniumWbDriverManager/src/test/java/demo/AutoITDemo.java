package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	static WebDriver driver=null;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
		
	}
	
	public static void test() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://easyupload.io/");
		driver.findElement(By.xpath(" //body[1]/main[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]")).click();
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		Thread.sleep(3000);
		driver.close();
	}

}
