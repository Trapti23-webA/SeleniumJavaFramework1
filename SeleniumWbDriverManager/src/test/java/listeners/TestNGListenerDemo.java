package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void test1()
	{
		System.out.println("I am inside Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside Test 2");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("abcd");
		driver.findElement(By.xpath("//textarea[@id='abc']")).sendKeys("abcd");
		driver.close();
	}
	@Test
	public void test3()
	{
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}
	@Test
	public void test4()
	{
		System.out.println("I am inside Test 4");
	}

}
