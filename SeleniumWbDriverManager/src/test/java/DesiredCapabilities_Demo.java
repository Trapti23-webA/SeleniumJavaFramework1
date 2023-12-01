import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class DesiredCapabilities_Demo {

	public static void main(String[] args)throws Exception {
		
		InternetExplorerOptions ieOptions = new InternetExplorerOptions();
		
		ieOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//caps.setCapability("ignoreProtectedModeSettings", true);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vasu\\eclipse-workspace\\SeleniumJavaFramework\\Drivers\\IEDriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(ieOptions);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Projects");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		driver.quit();
		driver.close();

	}

}
