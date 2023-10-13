package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browser_Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver launchFirefox() {
			
		    System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Browser_Files\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			return driver;
		}
	
	public static WebDriver launchEdge() {
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browser_Files\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		return driver;
	}
}

