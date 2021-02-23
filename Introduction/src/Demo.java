import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
//		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe"); 
//		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();

//		WebDriver driverf = new FirefoxDriver(); 
//		driverf.get("https://google.com");
//		WebDriver drivere = new EdgeDriver();
//		drivere.get("https://google.com");

//		String spec = "http://10.180.11.29:4444";
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		RemoteWebDriver driver = new RemoteWebDriver(new URL(spec), desiredCapabilities);
		driver.get("https://google.com");

		String title = driver.getTitle();
		System.out.println(title);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium is geat!");
		
	}

}
