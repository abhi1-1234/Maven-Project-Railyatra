package testPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pages.Search_Trains;
import utilize.Utility;

public class From_and_to_textbox extends Browser{

	private WebDriver driver;
	private Search_Trains search_Trains;
	private String testID;
	
		
		@Parameters("Browser")
		@BeforeTest
		public void Open_Browser(String BrowserName) {
			if(BrowserName.equals("Chrome")) {
				driver = launchChrome();
				
				 driver.get("https://www.railyatri.in/trains-between-stations");
				 driver.manage().window().maximize();
			}
			
			if(BrowserName.equals("Firefox")) {
				driver = launchFirefox();
				
				 driver.get("https://www.railyatri.in/trains-between-stations");
				 driver.manage().window().maximize();
				
			}
			
			if(BrowserName.equals("Edge")) {
				 driver = launchEdge();
				
				 driver.get("https://www.railyatri.in/trains-between-stations");
				 driver.manage().window().maximize();
				
			}
		}
		
	    @BeforeClass
	    public void Creating_Objects() {
	    	search_Trains = new Search_Trains(driver);
	    }
		
	    @Test
	    public void Verify_From_Side_Textbox() throws InterruptedException {
	    
	    	testID = "TC_002" ;
	    	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	
	    search_Trains.ClickTrainticketTab();
	    
	    search_Trains.SendKeysFromTextbox("Mumbai");
	    
	    search_Trains.ClickFromCrossButton();
	    
	    }
	    
	    @Test
	    public void Verify_To_Side_Textbox() throws InterruptedException {
	    
	    	testID = "TC_003" ;
	    	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	
	    search_Trains.SendKeysToTextbox("Pune");
	    
	    search_Trains.ClickToCrossButton();
	    
	    search_Trains.SendKeysFromTextbox("Mumbai");
	    
	    search_Trains.SendKeysToTextbox("Pune");
	    
	    search_Trains.ClickOnSearchButton();
	    }
	    
	    @AfterMethod
	    public void TakeScreenShot_Of_Failed_Test_Methods(ITestResult result) throws IOException {
	    	if(ITestResult.FAILURE == result.getStatus()) {
	    		
	    		Utility.TakeScreenShotOf(driver, testID);
	    	}
	    }
	    
	    @AfterClass
	    public void Clear_Object() {
	    	search_Trains = null;
	    }
	    
	    @AfterTest
	    public void Close_Browser() {
	    	driver.close();
	    	driver = null;
	    	System.gc();
	    }

}
